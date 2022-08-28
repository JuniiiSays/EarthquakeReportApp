package com.example.android.quakereport;

class Earthquake {

    private String mMag;
    private String mCityName;
    private String mDate;

    public Earthquake(String mag, String cityName, String date) {
        mMag = mag;
        mCityName = cityName;
        mDate = date;
    }

    public String getmMag() {
        return mMag;
    }

    public String getmCityName() {
        return mCityName;
    }

    public String getmDate() {
        return mDate;
    }
}
