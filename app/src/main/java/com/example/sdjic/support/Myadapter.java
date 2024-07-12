package com.example.sdjic.support;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.sdjic.HomeFragment;
import com.example.sdjic.MovieFragment;
import com.example.sdjic.SportFragment;
import com.example.sdjic.TabLayoutActivity;

public class Myadapter extends FragmentPagerAdapter {

    Context context;
    int totalTabs;

    public Myadapter(Context context, FragmentManager fragmentManager, int totalTabs) {
        super(fragmentManager);
        this.context = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new SportFragment();
            case 2:
                return new MovieFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
