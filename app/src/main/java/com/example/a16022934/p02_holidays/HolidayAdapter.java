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
        // Store the food that is passed to this adapter
        holiday = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvHoliday = (TextView) rowView.findViewById(R.id.tvNameDate);
        ivIcon = (ImageView) rowView.findViewById(R.id.imageView);
        Holiday currentHoliday = holiday.get(position);

        if(currentHoliday.getName().equals("New Year")){
            ivIcon.setImageResource(R.drawable.newyear);
        }else if(currentHoliday.name.equals("Chinese New Year")){
            ivIcon.setImageResource(R.drawable.cny);
        }else if(currentHoliday.name.equals("Good Friday")){
            ivIcon.setImageResource(R.drawable.goodfriday);
        }else if(currentHoliday.name.equals("Labour Day")){
            ivIcon.setImageResource(R.drawable.labourday);
        }else if(currentHoliday.name.equals("Vesak Day")){
            ivIcon.setImageResource(R.drawable.vesakday);
        }else if(currentHoliday.name.equals("Hari Raya Puasa")){
            ivIcon.setImageResource(R.drawable.harirayapuasa);
        }else if(currentHoliday.name.equals("National Day")){
            ivIcon.setImageResource(R.drawable.nationalday);
        }else if(currentHoliday.name.equals("Hari Raya Haji")){
            ivIcon.setImageResource(R.drawable.harirayahaji);
        }else if(currentHoliday.name.equals("National Day")){
            ivIcon.setImageResource(R.drawable.nationalday);
        }else if(currentHoliday.name.equals("Deepavali")){
            ivIcon.setImageResource(R.drawable.deepavali);
        }else if(currentHoliday.name.equals("Christmas Day")){
            ivIcon.setImageResource(R.drawable.christmas);
        }

        String text = currentHoliday.getName() +  "\n" + currentHoliday.getDate();

        tvHoliday.setText(text);
        return rowView;
    }
}
