package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToastButtonClick(View view){
        Intent i = new Intent(getApplicationContext(), ToastDemoActivity.class);
        startActivity(i);
    }

    public void onCustomToastButtonClick(View view){
        Intent i = new Intent(getApplicationContext(), CustomToastActivity.class);
        startActivity(i);
    }
}