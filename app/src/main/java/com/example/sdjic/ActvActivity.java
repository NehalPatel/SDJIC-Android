package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class ActvActivity extends AppCompatActivity {

    String[] county = {"India", "Usa", "Russia", "Canada", "Chine", "Japan", "South Korea"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actv);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, county);

        AutoCompleteTextView actv = findViewById(R.id.ac_Country);

        actv.setThreshold(1);

        actv.setAdapter(adapter);

        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ActvActivity.this, "Selected Item " + adapterView.getSelectedItem(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}