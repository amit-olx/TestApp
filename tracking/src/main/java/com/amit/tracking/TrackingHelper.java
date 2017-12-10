package com.amit.tracking;

import android.content.Context;

import com.amit.tracking.communication.TrackingListener;
import com.amit.tracking.data.TrackingDAO;

/**
 * Created by amit on 10/12/17.
 */

public class TrackingHelper {

    public static TrackingHelper sTrackingHelper;
    public static Context sContext;

    public static TrackingListener getsTrackingListener() {
        return sTrackingListener;
    }

    public static TrackingDAO getsTrackingDAO() {
        return sTrackingDAO;
    }

    public static TrackingListener sTrackingListener;
    public static TrackingDAO sTrackingDAO;

    private TrackingHelper() {

    }

    private static synchronized TrackingHelper getInstance(Context context, TrackingListener trackingListener) {
        sContext = context;
        sTrackingListener = trackingListener;
        if(sTrackingDAO==null){
            sTrackingDAO=new TrackingDAO();
        }
        if (sTrackingHelper == null) {
            sTrackingHelper = new TrackingHelper();
        }
        return sTrackingHelper;
    }

    public static TrackingListener getTrackingListener() {
        return sTrackingListener;
    }

    public static TrackingDAO getTrackingDAO() {
        return sTrackingDAO;
    }
}
