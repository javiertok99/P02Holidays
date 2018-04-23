package com.example.a16022934.p02_holidays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
        eHoliday.add(new Holiday("Chinese New Year", "16-17 Feb 2018", "Also known as Spring Festival, is celebrated  at the turn of the traditional lunisolar Chinese calendar.", R.drawable.cny));
        eHoliday.add(new Holiday("Good Friday", "30 Mar 2018", "Good Friday is a Christian holiday celebrating the crucifixion of Jesus and His death at Calvary.",R.drawable.goodfriday));
        eHoliday.add(new Holiday("Vesak Day", "29 May 2018","Also known as Buddha Purnima and Buddha Day, commemorates the birth, enlightenment (Buddhahood), and death (Parinirvāna) of Gautama Buddha in the Theravada or southern tradition.",R.drawable.vesakday));
        eHoliday.add(new Holiday("Hari Raya Puasa", "15 Jun 2018","Eid al-Fitr is an important religious holiday celebrated by Muslims worldwide that marks the end of Ramadan, the Islamic holy month of fasting.",R.drawable.harirayapuasa));
        eHoliday.add(new Holiday("Hari Raya Haji", "22 Aug 2018", "Eid al-Adha, also called the \"Sacrifice Feast\", is the second of two Islamic holidays celebrated worldwide each year, and considered the holier of the two.", R.drawable.harirayahaji));
        eHoliday.add(new Holiday("Deepavali", "6 Nov 2018", "Diwali or Deepavali is the Hindu festival of lights celebrated every year in autumn in the northern hemisphere.",R.drawable.deepavali));
        eHoliday.add(new Holiday("Christmas Day", "25 Dec 2018", "Christmas is an annual festival commemorating the birth of Jesus Christ, observed primarily on December 25 as a religious and cultural celebration among billions of people around the world.",R.drawable.christmas));

        aa = new HolidayAdapter(this, R.layout.row, eHoliday);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHol = eHoliday.get(position);

                Toast.makeText(EthnicHoliday.this, selectedHol.getName() + " Date: " + selectedHol.getDate() + "\n" +
                                "Desc: " + selectedHol.getDesc(),
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
