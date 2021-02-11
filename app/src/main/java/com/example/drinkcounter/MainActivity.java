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
        ds.setDate(viewDate);

    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.buttonPlus1:
                count1 = counting.increment(viewCount1, count1);
                showCount1 = true;
                break;

            case R.id.buttonPlus2:
                count2 = counting.increment(viewCount2, count2);
                showCount2 = true;
                break;

            case R.id.buttonPlus3:
                count3 = counting.increment(viewCount3, count3);
                showCount3 = true;
                break;

            case R.id.buttonPlus4:
                count4 = counting.increment(viewCount4, count4);
                showCount4 = true;
                break;

            case R.id.buttonMinus1:
                count1 = counting.decrement(viewCount1, count1);
                showCount1 = true;
                break;

            case R.id.buttonMinus2:
                count2 = counting.decrement(viewCount2, count2);
                showCount2 = true;
                break;

            case R.id.buttonMinus3:
                count3 = counting.decrement(viewCount3, count3);
                showCount3 = true;
                break;

            case R.id.buttonMinus4:
                count4 = counting.decrement(viewCount4, count4);
                showCount4 = true;
                break;

            case R.id.buttonReset:
                if (showCount1) {
                    count1 = counting.resetCount(viewCount1, count1);
                    showCount1 = false;
                }
                if (showCount2) {
                    count2 = counting.resetCount(viewCount2, count2);
                    showCount2 = false;
                }
                if (showCount3) {
                    count3 = counting.resetCount(viewCount3, count3);
                    showCount3 = false;
                }
                if (showCount4) {
                    count4 = counting.resetCount(viewCount4, count4);
                    showCount4 = false;
                }
                break;

            default:
                break;
        }
    }
}