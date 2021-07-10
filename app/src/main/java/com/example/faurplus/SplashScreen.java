package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    Thread timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        timer = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized (this) {
                        wait(2000);
                    }
                }catch(InterruptedException e){
                        e.printStackTrace();
                    } finally{
                        Intent intentS = new Intent(SplashScreen.this, MainActivity.class);
                        startActivity(intentS);
                        finish();
                    }


                }


        };
        timer.start();
    }
}


