package com.example.lessonfour_two_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void  initViews(){
        Button b_open_detail=findViewById(R.id.b_open_detail);
        b_open_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user=new User(1001,"Shaxzod");
                openSecond(user);
            }
        });
    }
   void openSecond(User user){
       Intent intent=new Intent(this,SecondActivity.class);
       intent.putExtra("user",user);
       startActivity(intent);

    }
}