package com.example.sdjic;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class ProgressBarActivity extends AppCompatActivity {

    ProgressDialog progress;
    ProgressBar p1, p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        p1 = findViewById(R.id.progressBar1);
        p2 = findViewById(R.id.progressBar2);
        p2.setVisibility(View.INVISIBLE);
    }

    public void onProgressClick(View view) {
        progress = new ProgressDialog(view.getContext());

        progress.setCancelable(false);
        progress.setMessage("File downloading...");
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress.setMax(100);
        progress.setProgress(0);
        progress.show();

        final int totalProgressTime = 100;
        final Thread t = new Thread() {
            @Override
            public void run() {
                int jumpTime = 0;

                while (jumpTime < totalProgressTime) {
                    try {
                        sleep(200);
                        jumpTime += 5;
                        progress.setProgress(jumpTime);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                progress.dismiss();
            }
        };
        t.start();


    }

    public void doProgress(View view) {
        final int totalProgressTime = 100;
        p2.setVisibility(View.VISIBLE);

        final Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <= totalProgressTime; i++) {
                        sleep(200);
                        p1.setProgress(i);
                        p2.setProgress(i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p2.setVisibility(View.INVISIBLE);
            }
        };
        t.start();
    }
}