package com.example.sdjic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent profileIntent = new Intent(getApplicationContext(), ProfileActivity.class);
                profileIntent.putExtra("username", userNames[position]);
                profileIntent.putExtra("subject",subjects[position]);
                profileIntent.putExtra("userImg", imgid[position]);
                startActivity(profileIntent);
            }
        });
    }
}