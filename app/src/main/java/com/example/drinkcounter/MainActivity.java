package com.example.drinkcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Integer count = 0;
    private TextView viewCount1;
    private TextView viewCount2;
    private TextView viewCount3;
    private TextView viewCount4;
    private TextView viewDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewCount1 = (TextView) findViewById(R.id.count1);
        viewCount2 = (TextView) findViewById(R.id.count2);
        viewCount3 = (TextView) findViewById(R.id.count3);
        viewCount4 = (TextView) findViewById(R.id.count4);
        //TODO: switch case button ?
        viewDate = (TextView) findViewById(R.id.dateStamp);
        setDate(viewDate);
    }

    private void setDate(TextView viewDate) {

        Date today = Calendar.getInstance().getTime();//getting date
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
        String date = df.format(today);
        viewDate.setText(date);
    }

    public void resetCount(View view) {
        count = 0;
        if (viewCount1 != null) {
            viewCount1.setText(Integer.toString(count));
        }
    }

    public void sub_counter(View view) {
        count--;
        if (viewCount1 != null) {
            viewCount1.setText(Integer.toString(count));
        }
    }

    public void add_counter(View view) {
        count++;
        if (viewCount1 != null) {
            viewCount1.setText(Integer.toString(count));
        }
    }
}