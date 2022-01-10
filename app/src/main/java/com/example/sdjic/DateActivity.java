package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class DateActivity extends AppCompatActivity {

    TextView txtDate;
    DatePicker dpDate;

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
    }

    public void onUserDateSelect(View view)
    {
        StringBuilder builder = new StringBuilder();
        builder.append(dpDate.getMonth() + 1 + "/");
        builder.append(dpDate.getDayOfMonth() + "/");
        builder.append(dpDate.getYear());

        txtDate.setText("Current Date:" + builder.toString());
    }
}