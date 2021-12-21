package com.reagent.learn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CalendarAdapter extends RecyclerView.Adapter<CalendarViewHolder> {

    private Context context;
    private ArrayList<Integer> sumDaysInMonth;

    public CalendarAdapter(Context context, ArrayList<Integer> sumDaysInMonth) {
        this.context = context;
        this.sumDaysInMonth = sumDaysInMonth;
    }


    @NonNull
    @Override
    public CalendarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.calendar_day, parent, false);

        return new CalendarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CalendarViewHolder holder, int position) {
        int day = sumDaysInMonth.get(position);
    }

    @Override
    public int getItemCount() {
        return sumDaysInMonth.size();
    }

    private static int getFirstDayOfWeek() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.get(Calendar.DAY_OF_WEEK);
    }
}
