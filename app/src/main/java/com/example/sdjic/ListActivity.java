package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<String> products = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView productList = findViewById(R.id.lstProducts);

        products.add("Mobile");
        products.add("Laptops");
        products.add("Watches");
        products.add("Desktops");

        ArrayAdapter<String> productAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, products);
        productList.setAdapter(productAdapter);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Log.d("nehal", products.get(i).toString());
        Toast.makeText(getApplicationContext(), products.get(i).toString(), Toast.LENGTH_SHORT).show();
    }
}