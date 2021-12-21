package com.reagent.learn;

import android.content.Context;

import androidx.recyclerview.widget.GridLayoutManager;

public class CalendarLyoutManager extends GridLayoutManager {

    public CalendarLyoutManager(Context context, int DAYS_IN_WEEK) {
        super(context, DAYS_IN_WEEK);
    }
}
