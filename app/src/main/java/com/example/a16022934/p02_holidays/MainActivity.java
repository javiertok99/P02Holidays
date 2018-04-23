package com.example.a16022934.p02_holidays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, values);

        lv.setAdapter(aa);
    }
}
