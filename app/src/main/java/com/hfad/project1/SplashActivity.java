package com.hfad.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Intent gotologin = new Intent(SplashActivity.this,LoginActivity.class);
        startActivity(gotologin);
        finish();
    }
}