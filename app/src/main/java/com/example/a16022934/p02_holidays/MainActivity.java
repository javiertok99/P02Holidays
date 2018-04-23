package com.example.a16022934.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lvTypes);

        List<String> values = new ArrayList<>();
        values.add("Secular");
        values.add("Ethnic & Religion");

        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, values);

        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int pos = lv.getPositionForView(view);
                if (pos == 0) {
                    Intent i = new Intent(MainActivity.this, HolidayList.class);
                    startActivity(i);
                }else if(pos == 1){
                    Intent i = new Intent(MainActivity.this, EthnicHoliday.class);
                    startActivity(i);
                }


            }
        });
    }
}
