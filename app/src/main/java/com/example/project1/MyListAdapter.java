package com.example.project1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter {
    private final Activity context;
    private final ArrayList<String> name;
    private final ArrayList<Double> value;

    public MyListAdapter(Activity context, ArrayList<String> name, ArrayList<Double> value) {
        this.context = context;
        this.name = name;
        this.value = value;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylistlayout, null, true);

        TextView titleText = (TextView) rowView.findViewById(R.id.name);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.value);

        titleText.setText(name.get(position));
        subtitleText.setText(Double.toString(value.get(position)));

        return rowView;

    }
}
