package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AnnaResult extends AppCompatActivity {

    private TextView ppm_1t, ppm_2t, dle_1t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anna_result);

        ppm_1t = findViewById(R.id.ppm1);
        ppm_2t = findViewById(R.id.ppm2);
        dle_1t = findViewById(R.id.dle);

        Bundle arguments = getIntent().getExtras();
        double ppm_1 = arguments.getDouble("ppm_1");
        double ppm_2 = arguments.getDouble("ppm_2");
        double final_dlee = arguments.getDouble("final_dlee");


        ppm_1t.setText(String.format("%.1f", ppm_1));
        ppm_2t.setText(String.format("%.1f", ppm_2));
        dle_1t.setText(String.format(final_dlee+""));

    }
}