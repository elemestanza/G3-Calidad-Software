package com.example.calendariourjc;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;

import androidx.appcompat.app.AppCompatActivity;

public class CalendarActivity extends AppCompatActivity {

    public CalendarView calendar;
    static Button BotonIni;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendar = (CalendarView) findViewById(R.id.calendar);
    }

}
