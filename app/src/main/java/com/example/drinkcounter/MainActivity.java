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
    private Boolean showCount1 = false, showCount2 = false, showCount3 = false, showCount4 = false;

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

    private Integer resetCount(TextView view, Integer count) {
        count = 0;
        view.setText("");
        return count;
    }

    public void onClick(View view) {

        String result;
        switch (view.getId()) {
            case R.id.buttonPlus1:
                count1 = increment(viewCount1, count1);
                showCount1 = true;
                break;

            case R.id.buttonPlus2:
                count2 = increment(viewCount2, count2);
                showCount2 = true;
                break;

            case R.id.buttonPlus3:
                count3 = increment(viewCount3, count3);
                showCount3 = true;
                break;

            case R.id.buttonPlus4:
                count4 = increment(viewCount4, count4);
                showCount4 = true;
                break;

            case R.id.buttonMinus1:
                count1 = decrement(viewCount1, count1);
                showCount1 = true;
                break;

            case R.id.buttonMinus2:
                count2 = decrement(viewCount2, count2);
                showCount2 = true;
                break;

            case R.id.buttonMinus3:
                count3 = decrement(viewCount3, count3);
                showCount3 = true;
                break;

            case R.id.buttonMinus4:
                count4 = decrement(viewCount4, count4);
                showCount4 = true;
                break;

            case R.id.buttonReset:
                if (showCount1) {
                    count1 = resetCount(viewCount1, count1);
                    showCount1 = false;
                }
                if (showCount2) {
                    count2 = resetCount(viewCount2, count2);
                    showCount2 = false;
                }
                if (showCount3) {
                    count3 = resetCount(viewCount3, count3);
                    showCount3 = false;
                }
                if (showCount4) {
                    count4 = resetCount(viewCount4, count4);
                    showCount4 = false;
                }
                break;

            default:
                break;
        }
    }
}