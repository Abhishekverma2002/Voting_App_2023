package com.example.votingapp2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TextView anim= findViewById(R.id.anim);
        getSupportActionBar().hide();
                anim.setAlpha(0f);
        anim.animate()
                .setDuration(2000)
                .alpha(1f)
                .start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                 startActivity(new Intent(getApplicationContext(),MainActivity.class));
                 finish();

            }
        },3000);
    }
}