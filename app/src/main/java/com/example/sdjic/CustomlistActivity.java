package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CustomlistActivity extends AppCompatActivity {

    String[] userNames = {"Vimal Vaiwala","Nidhi Desai", "Nainesh Gatyiawala", "Chirag Prajapati", "Krishna Vaidya"};
    String[] subjects = {"Computer Graphics", ".NET Framework", "Java Programming", "Web Development", "RDBMS"};
    Integer[] imgid = {R.drawable.vv,R.drawable.nd,R.drawable.ng,R.drawable.cp,R.drawable.kv};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist);

        UserListAdapter adapter = new UserListAdapter(this, userNames, subjects, imgid);
        ListView list = findViewById(R.id.lstUsers);
        list.setAdapter(adapter);
    }
}