package com.example.mitacademiccalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class adminlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
    }
    public void Userlogin(View view){
        Intent intent = new Intent(this, loginActivity1.class);
        startActivity(intent);
    }
}