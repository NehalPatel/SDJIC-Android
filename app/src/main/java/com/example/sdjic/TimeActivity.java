package com.example.sdjic;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import com.example.sdjic.support.TimePickerFragment;

public class TimeActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    TextView txtCurrentTime;
    TimePicker tpCurrentTime;
    private EditText txtSelectedTime;
    private ImageButton ibtnSelectTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        txtCurrentTime = findViewById(R.id.txtCurrentTime);
        tpCurrentTime = findViewById(R.id.tpCurrentTime);

        tpCurrentTime.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int min) {
                txtCurrentTime.setText("Current Time:" + hour + ":" + min);
            }
        });

        txtSelectedTime = findViewById(R.id.txtSelectedTime);
        ibtnSelectTime = findViewById(R.id.ibtnSelectTime);

        ibtnSelectTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment timePicker = new TimePickerFragment();
                timePicker.show(getSupportFragmentManager(), "Current Time");
            }
        });

    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
        txtSelectedTime.setText(hour + ":" + minute);
    }
}