package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
    }

    public void onSaveSettingsClick(View view){
        StringBuilder result = new StringBuilder();

        ToggleButton t1 = findViewById(R.id.toggleButtonSendSMS);
        ToggleButton t2 = findViewById(R.id.toggleButtonSendNotification);

        result.append("Send SMS: ").append( t1.getText() + "\n");
        result.append("Send Notification: ").append( t2.getText() + "\n");

        Log.d("testing", result.toString());

        Toast.makeText(getApplicationContext(), "Hello world", Toast.LENGTH_LONG).show();
    }
}