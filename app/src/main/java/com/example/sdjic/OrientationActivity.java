package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrientationActivity extends AppCompatActivity {

    TextView txtOrientationText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);

        txtOrientationText = findViewById(R.id.txtOrientation);
    }

    public void onOrientationLandscapeClick(View view) {
        txtOrientationText.setText("Orientation Landscape");

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void onOrientationPotraitClick(View view) {
        txtOrientationText.setText("Orientation Potrait");

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void onOrientationSensorClick(View view) {
        txtOrientationText.setText("Orientation Sensor");

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
    }
}