package com.example.drinkcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Integer count = 0;
    private TextView viewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewCount = (TextView) findViewById(R.id.count);
    }

    public void countWater(View view) {
        count++;
        if (viewCount != null) {
            viewCount.setText(String.format("%d verre(s)",count));
        }
    }

    public void countHotTea(View view) {
        count++;
        if (viewCount != null) {
            viewCount.setText(String.format("%d verre(s)",count));
        }
    }

    public void countIceTea(View view) {
        count++;
        if (viewCount != null) {
            viewCount.setText(String.format("%d verre(s)",count));
        }
    }

    public void countMilk(View view) {
        count++;
        if (viewCount != null) {
            viewCount.setText(String.format("%d verre(s)",count));
        }
    }

    public void resetCount(View view) {
        count = 0;
        if (viewCount != null) {
            viewCount.setText(String.format("%d verre",count));
        }
    }
}