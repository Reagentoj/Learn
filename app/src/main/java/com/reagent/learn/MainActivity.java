package com.reagent.learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private final int DAYS_IN_WEEK = 7;
    private Context context;
    private Calendar currentDate;
    private List<String> sumDaysInMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentDate = Calendar.getInstance();


        RecyclerView calendarRecyclerView = findViewById(R.id.calendarRecyclerView);
        CalendarAdapter calendarAdapter = new CalendarAdapter(context, );
        calendarRecyclerView.setLayoutManager(new CalendarLyoutManager(this, DAYS_IN_WEEK));

    }

    private static List<String> daysInMonth(Calendar date) {
        List<String> daysInMonthArray = new ArrayList<String>();
        // количество дней в этом месяце
        int daysInMonth = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);
        // день недели от 1 до 7 начиная с воскресенья
        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
    }

    // возвращает дату в формате "МЕСЯЦ ГОД"
    // принимает в качестве параметра Calendar.getInstance()
    private static String dateFormatter(Calendar date) {
        final SimpleDateFormat formatter = new SimpleDateFormat("MMMM yyyy", Locale.ENGLISH);
        return formatter.format(date.getTime());
    }

}