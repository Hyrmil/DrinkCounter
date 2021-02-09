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
    private Integer count1 = 0, count2 = 0, count3 = 0 , count4 = 0 ;
    private TextView viewCount1, viewCount2, viewCount3, viewCount4;
    private TextView viewDate;
    private Button viewButtonM1, viewButtonM2, viewButtonM3, viewButtonM4;
    /* Plus buttons */
    /* Minus buttons */
    private Button viewButtonP1, viewButtonP2, viewButtonP3, viewButtonP4;

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

        /* Plus buttons setters */
        viewButtonP1 = (Button) findViewById(R.id.buttonPlus1);
        viewButtonP2 = (Button) findViewById(R.id.buttonPlus2);
        viewButtonP3 = (Button) findViewById(R.id.buttonPlus3);
        viewButtonP4 = (Button) findViewById(R.id.buttonPlus4);

        /* Minus buttons setters*/
        viewButtonM1 = (Button) findViewById(R.id.buttonMinus1);
        viewButtonM2 = (Button) findViewById(R.id.buttonMinus2);
        viewButtonM3 = (Button) findViewById(R.id.buttonMinus3);
        viewButtonM4 = (Button) findViewById(R.id.buttonMinus4);

        /* Others to deal with */
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
        count1 = count2 = count3 = count4 = 0;
        if (viewCount1 != null) {
            viewCount1.setText(Integer.toString(count1));
        }
        if (viewCount2 != null) {
            viewCount2.setText(Integer.toString(count2));
        }
        if (viewCount3 != null) {
            viewCount3.setText(Integer.toString(count3));
        }
        if (viewCount4 != null) {
            viewCount4.setText(Integer.toString(count4));
        }
    }

    public void sub_counter(View view) {
        switch (view.getId()) {
            case R.id.buttonMinus1:
                count1--;
                if (count1 < 0) {
                    count1 = 0;
                }

                if (viewCount1 != null) {
                    viewCount1.setText(Integer.toString(count1));
                }
                break;

                case R.id.buttonMinus2:
                    count2--;
                    if (count2 < 0) {
                        count2 = 0;
                    }

                if (viewCount2 != null) {
                    viewCount2.setText(Integer.toString(count2));
                }
                break;

                case R.id.buttonMinus3:
                    count3--;
                    if (count3 < 0) {
                        count3 = 0;
                    }

                if (viewCount3 != null) {
                    viewCount3.setText(Integer.toString(count3));
                }
                break;

                case R.id.buttonMinus4:
                    count4--;
                    if (count4 < 0) {
                        count4 = 0;
                    }

                if (viewCount4 != null) {
                    viewCount4.setText(Integer.toString(count4));
                }
                break;
        }
    }

    public void add_counter(View view) {
        switch (view.getId()) {
            case R.id.buttonPlus1:
                count1++;
                if (viewCount1 != null) {
                    viewCount1.setText(Integer.toString(count1));
                }
                break;

            case R.id.buttonPlus2:
                count2++;
                if (viewCount2 != null) {
                    viewCount2.setText(Integer.toString(count2));
                }
                break;

            case R.id.buttonPlus3:
                count3++;
                if (viewCount3 != null) {
                    viewCount3.setText(Integer.toString(count3));
                }
                break;

            case R.id.buttonPlus4:
                count4++;
                if (viewCount4 != null) {
                    viewCount4.setText(Integer.toString(count4));
                }
                break;
        }
    }
}