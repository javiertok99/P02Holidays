package com.example.a16022934.p02_holidays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EthnicHoliday extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holiday> eHoliday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ethnic_holiday);

        lv = findViewById(R.id.lvEthnicHoliday);
        eHoliday = new ArrayList<Holiday>();
        eHoliday.add(new Holiday("Chinese New Year", "16-17 Feb 2018"));
        eHoliday.add(new Holiday("Good Friday", "30 Mar 2018"));
        eHoliday.add(new Holiday("Vesak Day", "29 May 2018"));
        eHoliday.add(new Holiday("Hari Raya Puasa", "15 Jun 2018"));
        eHoliday.add(new Holiday("Hari Raya Haji", "22 Aug 2018"));
        eHoliday.add(new Holiday("Deepavali", "6 Nov 2018"));
        eHoliday.add(new Holiday("Christmas Day", "25 Dec 2018"));

        aa = new HolidayAdapter(this, R.layout.row, eHoliday);
        lv.setAdapter(aa);


    }
}
