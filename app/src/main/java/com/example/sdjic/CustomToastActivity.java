package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
    }

    public void showCustomToastMessage(View view){
        LayoutInflater li = getLayoutInflater();

        View customtoast = li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast));

        Toast toast = new Toast(getApplicationContext());

//        EditText name = (EditText) findViewById(R.id.editTextName);
//        TextView tvName= (TextView) findViewById(R.id.customToastMessage);
//
//        tvName.setText( name.getText().toString() );

        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0, 100);
        toast.setView(customtoast);
        toast.show();
    }
}