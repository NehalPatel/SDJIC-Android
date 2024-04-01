package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.sdjic.support.ImageAdapter;

public class ImageSliderActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private int[] images = {R.drawable.nd, R.drawable.vv, R.drawable.kv, R.drawable.ng, R.drawable.cp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);

        viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this, images);
        viewPager.setAdapter(adapter);
    }
}