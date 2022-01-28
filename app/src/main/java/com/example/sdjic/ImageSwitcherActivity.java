package com.example.sdjic;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class ImageSwitcherActivity extends AppCompatActivity {

    ImageSwitcher imgSwitcher;
    Button btnNext;
    TextView imgCounter;

    int userProfiles[] = {R.drawable.cp, R.drawable.kv, R.drawable.nd, R.drawable.ng, R.drawable.vv};
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher);

        imgSwitcher = (ImageSwitcher) findViewById(R.id.imgSwitcher);
        btnNext = findViewById(R.id.btnImageSwitcherNext);
        imgCounter = findViewById(R.id.imageCounter);
        imgCounter.setText(counter+1 +"/" + userProfiles.length);

        imgSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setLayoutParams(new FrameLayout.LayoutParams(
                        ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT
                ));

                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(userProfiles[counter]);

                return imageView;
            }
        });

        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);

        imgSwitcher.setOutAnimation(aniOut);
        imgSwitcher.setInAnimation(aniIn);

    }

    public void onNextBtnClick(View view) {
        counter++;

        if(counter > userProfiles.length-1)
            counter=0;

        imgSwitcher.setImageResource(userProfiles[counter]);
        imgCounter.setText(counter+1 +"/" + userProfiles.length);
    }
}