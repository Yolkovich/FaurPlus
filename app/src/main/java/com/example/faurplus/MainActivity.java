package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton firstScreen;
    ImageButton secondScreen;
    ImageButton thirdScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton firstScreen = (ImageButton) findViewById(R.id.imageViewFirstScreen);
        ImageButton secondScreen = (ImageButton) findViewById(R.id.imageViewSecondScreen);
        ImageButton thirdScreen = (ImageButton) findViewById(R.id.imageViewThirdScreen);

        firstScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ppm.class);
                startActivity(intent);
            }
        });

        secondScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Anna.class);
                startActivity(intent);
            }
        });

        thirdScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MaxDle.class);
                startActivity(intent);
            }
        });
    }
}