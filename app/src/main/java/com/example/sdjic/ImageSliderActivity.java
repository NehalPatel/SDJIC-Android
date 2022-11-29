package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.sdjic.support.ImageAdapter;

public class ImageSliderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);

        ViewPager2 mViewPage = (ViewPager2) findViewById(R.id.ViewPage);
        ImageAdapter adapter = new ImageAdapter(this);
        //mViewPage.setAdapter(adapter);
    }
}