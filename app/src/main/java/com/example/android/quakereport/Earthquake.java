package com.example.android.quakereport;

class Earthquake {

    private String mMag;
    private String mCityName;
    private long mTimeInMilliSeconds;

    public Earthquake(String mag, String cityName, long timeInMilliSeconds) {
        mMag = mag;
        mCityName = cityName;
        mTimeInMilliSeconds = timeInMilliSeconds;
    }

    public String getMag() {
        return mMag;
    }

    public String getCityName() {
        return mCityName;
    }

    public long getDateInMilliSeconds() {
        return mTimeInMilliSeconds;
    }
}
