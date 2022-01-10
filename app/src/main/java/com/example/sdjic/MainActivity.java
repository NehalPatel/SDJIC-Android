package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToastButtonClick(View view){
        i = new Intent(getApplicationContext(), ToastDemoActivity.class);
        startActivity(i);
    }

    public void onCustomToastButtonClick(View view){
        i = new Intent(getApplicationContext(), CustomToastActivity.class);
        startActivity(i);
    }

    public void onToggleButtonClick(View view){
        i = new Intent(getApplicationContext(), ToggleButtonActivity.class);
        startActivity(i);
    }

    public void onCheckboxButtonClick(View view){
        i = new Intent(getApplicationContext(), CheckBoxActivity.class);
        startActivity(i);
    }

    public void onAlertButtonOnClick(View view)
    {
        i = new Intent(getApplicationContext(), AlertDialogActivity.class);
        startActivity(i);
    }

    public void onSpinnerButtonClick(View view)
    {
        i = new Intent(getApplicationContext(), SpinnerActivity.class);
        startActivity(i);
    }

    public void onListViewButtonClick(View view)
    {
        i = new Intent(getApplicationContext(), ListActivity.class);
        startActivity(i);
    }

    public void onCustomListViewButtonClick(View view)
    {
        i = new Intent(getApplicationContext(), CustomlistActivity.class);
        startActivity(i);
    }

    public void onDateTimeButtonClick(View view)
    {
        i = new Intent(getApplicationContext(), DateActivity.class);
        startActivity(i);
    }
}