package com.example.android.quakereport;

class Earthquake {

    double mMag;
    private String mLocation;
    private long mTimeInMilliSeconds;
    private String mUrl;



    public Earthquake(double mag, String location, long timeInMilliSeconds, String url) {
        mMag = mag;
        mLocation = location;
        mTimeInMilliSeconds = timeInMilliSeconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMag;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getDateInMilliSeconds() {
        return mTimeInMilliSeconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
