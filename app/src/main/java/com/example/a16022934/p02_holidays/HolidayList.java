package com.example.a16022934.p02_holidays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HolidayList extends AppCompatActivity {

    ListView holidayLv;
    ArrayAdapter aa;
    ArrayList<Holiday> holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday_list);

        holidayLv = findViewById(R.id.lvHolidays);
        holiday = new ArrayList<Holiday>();
        holiday.add(new Holiday("New Year", "1 Jan 2018"));
        holiday.add(new Holiday("Labour Day", "1 May 2018"));
        holiday.add(new Holiday("National Day", "8 Aug 2018"));

        aa = new HolidayAdapter(this, R.layout.row, holiday);
        holidayLv.setAdapter(aa);
    }
}
