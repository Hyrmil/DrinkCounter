package com.example.drinkcounter.feature;

import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateSetup {

    public DateSetup() {
        super();
    }

    public void setDate(TextView viewDate) {

        Date today = Calendar.getInstance().getTime();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
        String date = df.format(today);
        viewDate.setText(date);
    }
}
