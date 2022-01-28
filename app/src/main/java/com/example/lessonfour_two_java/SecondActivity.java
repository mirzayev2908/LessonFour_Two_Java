package com.example.lessonfour_two_java;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    static final String TAG=SecondActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
    }

     void initViews() {
         TextView tv_detail=findViewById(R.id.tv_detail);
         User user=(User)getIntent().getSerializableExtra("user");
         tv_detail.setText(user.toString());

    }
}