package com.example.android.quakereport;

class Earthquake {

    double mMag;
    private String mLocation;
    private long mTimeInMilliSeconds;

    public Earthquake(double mag, String location, long timeInMilliSeconds) {
        mMag = mag;
        mLocation = location;
        mTimeInMilliSeconds = timeInMilliSeconds;
    }

    public double getMag() {
        return mMag;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getDateInMilliSeconds() {
        return mTimeInMilliSeconds;
    }
}
