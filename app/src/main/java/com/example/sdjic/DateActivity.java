package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class DateActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    TextView txtDate, txtBirthday;
    DatePicker dpDate;
    ImageButton dtImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        txtDate = findViewById(R.id.txtDate);
        dpDate = findViewById(R.id.dpCurrentDate);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            dpDate.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
                @Override
                public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                    txtDate.setText("Current Date:" + day + "/" + (month+1) + "/" + year);
                }
            });
        }

        txtBirthday = findViewById(R.id.txtBirthday);
        dtImage = findViewById(R.id.btnDTimage);
        dtImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "Date Picker");
            }
        });
    }

    public void onUserDateSelect(View view)
    {
        StringBuilder builder = new StringBuilder();
        builder.append(dpDate.getMonth() + 1 + "/");
        builder.append(dpDate.getDayOfMonth() + "/");
        builder.append(dpDate.getYear());

        txtDate.setText("Current Date:" + builder.toString());
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, day);
        String currentDateString = DateFormat.getDateInstance(DateFormat.MEDIUM).format(c.getTime());
        txtBirthday.setText(currentDateString);
    }
}