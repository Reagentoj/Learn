package com.reagent.learn;

import androidx.annotation.Nullable;

import java.util.List;

public class CalendarModel {

    private String date;
    private String events;
    private int position;

    public CalendarModel() {
    }

    public CalendarModel(String date, List<String> sumDaysInMonth, @Nullable String events, int position) {
        this.date = date;
        this.events = events;
        this.position = position;
    }

    public String getDate() {
        return date;
    }



    public String getEvents() {
        return events;
    }

    public int getPosition() {
        return position;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
