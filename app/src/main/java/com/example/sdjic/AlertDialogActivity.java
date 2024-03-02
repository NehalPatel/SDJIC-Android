package com.example.sdjic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogActivity extends AppCompatActivity {

    Button closeButton;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        closeButton = findViewById(R.id.btnClose);
        builder = new AlertDialog.Builder(this);
    }

    public void onCloseButtonClicked(View view)
    {
//        builder.setMessage("Are you sure want to perform?").setTitle("Confirm Action").show();

        builder.setMessage("Are you sure?")
                .setTitle("Close Application")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        Toast.makeText(getApplicationContext(), "See ya again.", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                        Toast.makeText(getApplicationContext(), "Continue...", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}