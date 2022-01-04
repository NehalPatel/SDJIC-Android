package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Bundle extras = getIntent().getExtras();
        String username = extras.getString("username");
        String subject = extras.getString("subject");
        int image = extras.getInt("userImg");

        TextView Username = findViewById(R.id.txtUserName);
        TextView Subject = findViewById(R.id.txtSubject);
        ImageView UserImg = findViewById(R.id.profileImg);

        Username.setText(username);
        Subject.setText(subject);
        UserImg.setImageResource(image);
    }
}