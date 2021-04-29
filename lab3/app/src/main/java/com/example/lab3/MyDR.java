package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MyDR extends AppCompatActivity {
    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Draw draw = new Draw(this);
        setContentView(draw);
    }

}
