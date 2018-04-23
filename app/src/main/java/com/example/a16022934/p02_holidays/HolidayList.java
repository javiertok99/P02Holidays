package com.example.a16022934.p02_holidays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
        holiday.add(new Holiday("New Year", "1 Jan 2018", "First Day of the year!", R.drawable.cny));
        holiday.add(new Holiday("Labour Day", "1 May 2018", "Celebrate the achievement of workers", R.drawable.labourday));
        holiday.add(new Holiday("National Day", "8 Aug 2018", "Commemorate the independence of Singapore from Malaysia", R.drawable.nationalday));

        aa = new HolidayAdapter(this, R.layout.row, holiday);
        holidayLv.setAdapter(aa);

        holidayLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHol = holiday.get(position);

                Toast.makeText(HolidayList.this, selectedHol.getName() + " Date: " + selectedHol.getDate() + "\n" +
                        "Desc: " + selectedHol.getDesc(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
