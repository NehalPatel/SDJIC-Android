package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    CheckBox tea, coffee, pizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        tea = findViewById(R.id.checkBoxTea);
        coffee = findViewById(R.id.checkBoxCoffee);
        pizza = findViewById(R.id.checkBoxPizza);
    }

    public void onPlaceOrderClick(View view) {
        int total = 0;
        StringBuilder result = new StringBuilder();

        if(tea.isChecked()){
            total += 10;
            result.append(tea.getText() + "\n");
        }

        if(coffee.isChecked()){
            total += 20;
            result.append(coffee.getText() + "\n");
        }

        if(pizza.isChecked()){
            total += 100;
            result.append(pizza.getText() + "\n");
        }

        result.append("\n Total:" + total);

        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_SHORT).show();
    }
}