package com.example.sdjic.support;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.sdjic.R;

public class ImageAdapter extends PagerAdapter {

    Context mContext;

    private int[] sliderImageId = new int[]{
            R.drawable.vv, R.drawable.nd, R.drawable.ng,R.drawable.kv, R.drawable.cp,
    };

    public ImageAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return sliderImageId.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((ImageView) object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager2) container).removeView((ImageView) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(sliderImageId[position]);

        container.addView(imageView, 0);

        return imageView;
    }
}
