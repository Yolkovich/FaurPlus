package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class PpmResult extends AppCompatActivity {

    EditText ppmF, dleF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppm_result);
        //get values from last activity
        Bundle arguments = getIntent().getExtras();


        double ppm = arguments.getDouble("ppm");
        double dle = arguments.getDouble("dle");

        ppmF = findViewById(R.id.ppm);
        ppmF.setText(String.format("%.0f", ppm));


        dleF = findViewById(R.id.dle);
        dleF.setText(String.format("%.2f", dle));


    }
}