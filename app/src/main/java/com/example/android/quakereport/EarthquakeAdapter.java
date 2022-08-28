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

import java.util.ArrayList;

class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
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

        TextView magTextView = (TextView) listViewItem.findViewById(R.id.mag_text_view);
        TextView cityTextView = (TextView) listViewItem.findViewById(R.id.city_text_view);
        TextView dateTextView = (TextView) listViewItem.findViewById(R.id.date_text_view);

        magTextView.setText(currentEarthquake.getmMag());
        cityTextView.setText(currentEarthquake.getmCityName());
        dateTextView.setText(currentEarthquake.getmDate());

        return listViewItem;
    }
}

