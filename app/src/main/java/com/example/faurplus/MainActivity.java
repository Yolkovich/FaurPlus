package com.example.faurplus;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ImageButton firstScreen;
    ImageButton secondScreen;
    ImageButton thirdScreen;
    //LottieAnimationView splash;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {


        int id = item.getItemId();

        if( id == R.id.menuSettings){

            Intent intentS = new Intent(this, Settings.class);
            startActivity(intentS);
            return true;

        }else if(id == R.id.grafics){

            Intent intentG = new Intent(this, Grafics.class);
            startActivity(intentG);
            return true;

        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar bottomAppBar = findViewById(R.id.bottomAppBar);
        setSupportActionBar(bottomAppBar);

        //splash = findViewById(R.id.lottie);
        ImageButton firstScreen = (ImageButton) findViewById(R.id.imageViewFirstScreen);
        ImageButton secondScreen = (ImageButton) findViewById(R.id.imageViewSecondScreen);
        ImageButton thirdScreen = (ImageButton) findViewById(R.id.imageViewThirdScreen);



        //обработка сплэша
        //splash.animate().translationX(-100).setDuration(100).setStartDelay(500);


        firstScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ppm.class);
                startActivity(intent);

                // Animation onClick
                Animation animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                firstScreen.startAnimation(animFadein);
            }
        });

        secondScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Anna.class);
                startActivity(intent);

                // Animation onClick
                Animation animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                secondScreen.startAnimation(animFadein);
            }
        });

        thirdScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MaxDle.class);
                startActivity(intent);

                // Animation onClick
                Animation animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                thirdScreen.startAnimation(animFadein);
            }
        });


    }
}