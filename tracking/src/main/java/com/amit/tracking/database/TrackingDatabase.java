package com.amit.tracking.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.amit.tracking.data.Category;
import com.amit.tracking.utils.Constant;

/**
 * Created by amit on 10/12/17.
 */

public class TrackingDatabase extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "tracking";

    public TrackingDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constant.CategoryContract.CREATE_CATEGORY_TRACK);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void addCategory(Category category){
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(Constant.CategoryContract.TABLE_NAME, null, getCategoryContentValues(category));
        db.close(); // Closing database connection
    }

    public void incrementClick(String categoryId){
        SQLiteDatabase db = this.getWritableDatabase();
        String[] bindingArgs = new String[]{ "1", categoryId };
        String query="UPDATE "+Constant.CategoryContract.TABLE_NAME+" SET "+Constant.CategoryContract.ENTRY_CLICK
                +" = "+Constant.CategoryContract.ENTRY_CLICK+" +?"
                +" WHERE "+Constant.CategoryContract.ENTRY_ID+" =?";
        db.rawQuery(query,bindingArgs);
        db.close();
    }


    private ContentValues getCategoryContentValues(Category category){
        ContentValues values = new ContentValues();
        values.put(Constant.CategoryContract.ENTRY_NAME, category.getName());
        values.put(Constant.CategoryContract.ENTRY_ID, category.getId());
        values.put(Constant.CategoryContract.ENTRY_ICON, category.getIcon());
        values.put(Constant.CategoryContract.ENTRY_CLICK, category.getFrequency());
        return values;
    }
}