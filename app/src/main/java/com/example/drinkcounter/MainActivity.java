package com.example.drinkcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Integer count1 = 0, count2 = 0, count3 = 0, count4 = 0;
    private TextView viewCount1, viewCount2, viewCount3, viewCount4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(LOG_TAG, "On Create Start");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Counters setters */
        viewCount1 = (TextView) findViewById(R.id.count1);
        viewCount2 = (TextView) findViewById(R.id.count2);
        viewCount3 = (TextView) findViewById(R.id.count3);
        viewCount4 = (TextView) findViewById(R.id.count4);

        /* Others to deal with */
        TextView viewDate = (TextView) findViewById(R.id.dateStamp);
        setDate(viewDate);

    }

    private void setDate(TextView viewDate) {

        Date today = Calendar.getInstance().getTime();//getting date
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
        String date = df.format(today);
        viewDate.setText(date);
    }

    private Integer increment (TextView view, Integer count) {
        count++;

        if (view != null) {
            view.setText(String.format("%d", count));
        }
        return count;
    }

    private Integer decrement (TextView view, Integer count) {
        count--;

        if (count < 0) {
            count= 0;
        }

        if (view != null) {
            view.setText(String.format("%d", count));
        }
        return count;
    }
    public void resetCount(View view) {
        count1 = count2 = count3 = count4 = 0;
        if (viewCount1 != null) {
            viewCount1.setText(String.format("%d", count1));
        }
        if (viewCount2 != null) {
            viewCount2.setText(String.format("%d", count2));
        }
        if (viewCount3 != null) {
            viewCount3.setText(String.format("%d", count3));
        }
        if (viewCount4 != null) {
            viewCount4.setText(String.format("%d", count4));
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonPlus1:
                count1 = increment(viewCount1, count1);
                break;

            case R.id.buttonPlus2:
                count2 = increment(viewCount2, count2);
                break;

            case R.id.buttonPlus3:
                count3 = increment(viewCount3, count3);
                break;

            case R.id.buttonPlus4:
                count4 = increment(viewCount4, count4);
                break;

            case R.id.buttonMinus1:
                count1 = decrement(viewCount1, count1);
                break;

            case R.id.buttonMinus2:
                count2 = decrement(viewCount2, count2);
                break;

            case R.id.buttonMinus3:
                count3 = decrement(viewCount3, count3);
                break;

            case R.id.buttonMinus4:
                count4 = decrement(viewCount4, count4);
                break;
        }
    }
}