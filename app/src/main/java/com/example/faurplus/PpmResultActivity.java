package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class PpmResultActivity extends AppCompatActivity {

    private EditText editPpmResult, editDleResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppm_result);

        editPpmResult = findViewById(R.id.ppm);
        editDleResult = findViewById(R.id.dle);

        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
            double ppm = arguments.getDouble("ppm", 0.0);
            double dle = arguments.getDouble("dle", 0.0);

            editPpmResult.setText(String.format("%.0f", ppm));
            editDleResult.setText(String.format("%.3f", dle));
        }
    }
}
