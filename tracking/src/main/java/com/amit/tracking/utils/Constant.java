package com.amit.tracking.utils;

/**
 * Created by amit on 10/12/17.
 */

public class Constant {

    public static final String EMPTY_STRING="";
    public static final int DEFAULT_FREQUENCY=1;

    public static class CategoryContract{
        public static final String TABLE_NAME="categoryTrack";

        public static final String ENTRY_NAME="name";
        public static final String ENTRY_ID="is";
        public static final String ENTRY_ICON="icon";
        public static final String ENTRY_CLICK="click";

        public static final String CREATE_CATEGORY_TRACK="CREATE TABLE " + TABLE_NAME + "("
                + ENTRY_NAME + " TEXT," + ENTRY_ID + " TEXT,"
                + ENTRY_ICON + " TEXT,"+ ENTRY_CLICK + " INTEGER" + ")";


    }
}
