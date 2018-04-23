package com.example.a16022934.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday>{

    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvHoliday;
    private ImageView ivIcon;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);
        holiday = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvHoliday =  rowView.findViewById(R.id.tvNameDate);
        ivIcon =  rowView.findViewById(R.id.imageView);
        Holiday currentHoliday = holiday.get(position);
        ivIcon.setImageResource(currentHoliday.getRes());
        String text = currentHoliday.getName() +  "\n" + currentHoliday.getDate();

        tvHoliday.setText(text);
        return rowView;
    }
}
