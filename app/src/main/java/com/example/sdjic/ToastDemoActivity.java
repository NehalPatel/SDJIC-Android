package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ToastDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_demo);
    }

    public void onSaveStudentClick(View view){
        EditText name = findViewById(R.id.editTextName);
        EditText mobile = findViewById(R.id.editTextPhone);
        EditText email = findViewById(R.id.editTextEmail);
        EditText dob = findViewById(R.id.editTextDOB);

        String detail = "Name:" + name.getText().toString() + "\n Email:" + email.getText().toString() + "\n Mobile:" + mobile.getText().toString()+ "\n DOB:" + dob.getText().toString();;

        Toast.makeText(getApplicationContext(), detail, Toast.LENGTH_LONG).show();
    }
}