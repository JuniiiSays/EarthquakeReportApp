package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    String primaryLocation;
    String locationOffset;
    private static final String LOCATION_SEPARATOR = " of ";

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listViewItem = convertView;
        if (listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView magnitudeTextView = (TextView) listViewItem.findViewById(R.id.mag_text_view);
        TextView offSetTextView = (TextView) listViewItem.findViewById(R.id.location_offset);
        TextView primaryLocationTextView = (TextView) listViewItem.findViewById(R.id.primary_location);
        TextView dateTextView = (TextView) listViewItem.findViewById(R.id.date_text_view);
        TextView timeTetView = (TextView) listViewItem.findViewById(R.id.time_text_view);


        double magnitude = currentEarthquake.getMag();

        DecimalFormat formatter = new DecimalFormat("0.00");
        String formattedMagnitude = formatter.format(magnitude);

        magnitudeTextView.setText(formattedMagnitude);

        String originalLocation  = currentEarthquake.getLocation();

        if (originalLocation.contains(LOCATION_SEPARATOR)){
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];
        } else {
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }

        offSetTextView.setText(locationOffset);
        primaryLocationTextView.setText(primaryLocation);

        Date dateObject = new Date(currentEarthquake.getDateInMilliSeconds());

        String formattedDate = formatDate(dateObject);
        String formattedTime = formatTime(dateObject);

        dateTextView.setText(formattedDate);
        timeTetView.setText(formattedTime);

        return listViewItem;
    }

    private String formatDate(Date dateObject){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return simpleDateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject){
        SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("h:mm a");
        return simpleTimeFormat.format(dateObject);
    }
}

