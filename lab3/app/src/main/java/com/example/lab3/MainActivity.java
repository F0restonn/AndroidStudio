package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view) {
        Intent intent1 = new Intent(this, MyDR.class);
        startActivity(intent1);
    }


    public void onClick2(View view) {
        Intent intent2 = new Intent(this, MySurface.class);
        startActivity(intent2);
    }
}