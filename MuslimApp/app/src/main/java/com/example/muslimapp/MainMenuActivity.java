package com.example.muslimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        getSupportActionBar().setTitle("Dzikir Pagi & Sore");
    }

    public void clickDzikirPagi(View view) {
        Intent i = new Intent(MainMenuActivity.this, DzikirPagiActivity.class);
        startActivity(i);
    }

    public void clickDzikirSore(View view) {
        Intent i = new Intent(MainMenuActivity.this, DzikirSoreActivity.class);
        startActivity(i);
    }
}

