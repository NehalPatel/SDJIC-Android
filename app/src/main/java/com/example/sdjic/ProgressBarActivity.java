package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class ProgressBarActivity extends AppCompatActivity {

    ProgressDialog progress;
    Handler progressHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
    }

    public void onProgressClick(View view) {
        progress = new ProgressDialog(view.getContext());

        progress.setCancelable(false);
        progress.setMessage("File downloading...");
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress.setMax(100);
        progress.setProgress(0);
        progress.show();

//        try {
//            progressHandler.post(new Runnable() {
//                @Override
//                public void run() {
//                    for (int i=0; i<=100; i++)
//                    {
//                        progress.setProgress(i);
//                        Thread.sleep(1000);
//                    }
//                }
//            });
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}