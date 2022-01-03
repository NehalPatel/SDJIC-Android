package com.example.sdjic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class UserListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] users;
    private final String[] designations;
    private final Integer[] imgIds;


    public UserListAdapter(Activity context, String[] users, String[] designations, Integer[] imgIds) {
        super(context, R.layout.custom_list_item, users);
        this.context = context;
        this.users = users;
        this.designations = designations;
        this.imgIds = imgIds;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_list_item, null, true);

        TextView userName = rowView.findViewById(R.id.userName);
        TextView designation = rowView.findViewById(R.id.designation);
        ImageView userImg = rowView.findViewById(R.id.userImage);

        userName.setText(users[position]);
        designation.setText(designations[position]);
        userImg.setImageResource(imgIds[position]);

        return rowView;
    }
}