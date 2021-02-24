package com.example.drinkcounter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.drinkcounter.feature.ButtonMath;
import com.example.drinkcounter.feature.DateSetup;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private ButtonMath counting = new ButtonMath();
    private DateSetup ds = new DateSetup();
    private Integer[] count = {0, 0, 0, 0};
    private TextView[] viewCount = new TextView[4];
    private Boolean[] showCount = {false, false, false, false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(LOG_TAG, "On Create Start");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Counters setters */
        viewCount[0] = (TextView) findViewById(R.id.count1);
        viewCount[1] = (TextView) findViewById(R.id.count2);
        viewCount[2] = (TextView) findViewById(R.id.count3);
        viewCount[3] = (TextView) findViewById(R.id.count4);

        /* Others to deal with */
        TextView viewDate = (TextView) findViewById(R.id.dateStamp);
        ds.setDate(viewDate);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonPlus1:
                count[0] = counting.increment(viewCount[0], count[0]);
                showCount[0] = true;
                break;

            case R.id.buttonPlus2:
                count[1] = counting.increment(viewCount[1], count[1]);
                showCount[1] = true;
                break;

            case R.id.buttonPlus3:
                count[2] = counting.increment(viewCount[2], count[2]);
                showCount[2] = true;
                break;

            case R.id.buttonPlus4:
                count[3] = counting.increment(viewCount[3], count[3]);
                showCount[3] = true;
                break;

            case R.id.buttonMinus1:
                count[0] = counting.decrement(viewCount[0], count[0]);
                showCount[0] = true;
                break;

            case R.id.buttonMinus2:
                count[1] = counting.decrement(viewCount[1], count[1]);
                showCount[1] = true;
                break;

            case R.id.buttonMinus3:
                count[2] = counting.decrement(viewCount[2], count[2]);
                showCount[2] = true;
                break;

            case R.id.buttonMinus4:
                count[3] = counting.decrement(viewCount[3], count[3]);
                showCount[3] = true;
                break;

            case R.id.buttonReset:
                if (showCount[0]) {
                    count[0] = counting.resetCount(viewCount[0], count[0]);
                    showCount[0] = false;
                }
                if (showCount[1]) {
                    count[1] = counting.resetCount(viewCount[1], count[1]);
                    showCount[1] = false;
                }
                if (showCount[2]) {
                    count[2] = counting.resetCount(viewCount[2], count[2]);
                    showCount[2] = false;
                }
                if (showCount[3]) {
                    count[3] = counting.resetCount(viewCount[3], count[3]);
                    showCount[4] = false;
                }
                break;

            default:
                break;
        }
    }
}