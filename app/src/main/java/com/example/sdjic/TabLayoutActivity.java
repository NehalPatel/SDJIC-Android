package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.graphics.PorterDuff;
import android.os.Bundle;

import com.example.sdjic.support.Myadapter;
import com.google.android.material.tabs.TabLayout;

public class TabLayoutActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_tab_layout);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.addTab(tabLayout.newTab().setText("Home").setIcon(R.drawable.ic_home));
        tabLayout.addTab(tabLayout.newTab().setText("Sport").setIcon(R.drawable.ic_sports));
        tabLayout.addTab(tabLayout.newTab().setText("Movie").setIcon(R.drawable.ic_movie));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final Myadapter myadpater = new Myadapter(this, getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(myadpater);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                int tabIconColor = ContextCompat.getColor(TabLayoutActivity.this, R.color.white);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int tabIconColor = ContextCompat.getColor(TabLayoutActivity.this, R.color.black);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}