package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {
    ToggleButton t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        t1 = findViewById(R.id.toggleButtonSendSMS);
        t2 = findViewById(R.id.toggleButtonSendNotification);
    }

    public void onSaveSettingsClick(View view){
        StringBuilder result = new StringBuilder();

        result.append("Send SMS: ").append( t1.getText() + "\n");
        result.append("Send Notification: ").append( t2.getText() + "\n");

        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
    }

    public void onGetOffText(View view){
        StringBuilder result = new StringBuilder();

        result.append("Send SMS (OFF): ").append( t1.getTextOff() + "\n");
        result.append("Send Notification (OFF): ").append( t2.getTextOff() + "\n");

        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
    }

    public void onGetOnText(View view){
        StringBuilder result = new StringBuilder();

        result.append("Send SMS (ON): ").append( t1.getTextOn() + "\n");
        result.append("Send Notification (ON): ").append( t2.getTextOn() + "\n");

        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
    }
}