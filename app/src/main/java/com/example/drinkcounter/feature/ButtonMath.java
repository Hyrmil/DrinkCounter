package com.example.drinkcounter.feature;

import android.widget.TextView;

import java.util.Locale;

public class ButtonMath {

    public ButtonMath() {
        super();
    }

    public Integer increment(TextView view, Integer count) {
        count++;

        if (view != null) {
            view.setText(String.format(Locale.FRANCE,"%d", count));
        }
        return count;
    }

    public Integer decrement(TextView view, Integer count) {
        count--;

        if (count < 0) {
            count = 0;
        }

        if (view != null) {
            view.setText(String.format(Locale.FRANCE,"%d", count));
        }
        return count;
    }

    public Integer resetCount(TextView view, Integer count) {
        count = 0;
        view.setText("");
        return count;
    }

}
