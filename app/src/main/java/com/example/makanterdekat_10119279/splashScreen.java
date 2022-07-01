package com.example.makanterdekat_10119279;

/**
 * NIM      : 10119279
 * Nama     : Martua Febrianto
 * Kelas    : IF-7
 */


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashScreen extends AppCompatActivity {

    private int waktu_loading = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent (splashScreen.this, MainActivity.class);
                startActivity(splash);
                finish();
            }
        },waktu_loading);

    }
}