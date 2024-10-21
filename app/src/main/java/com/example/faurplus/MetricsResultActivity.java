package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MetricsResultActivity extends AppCompatActivity {

    private TextView textPpm1, textPpm2, textDle;

    public static final String EXTRA_PPM_1 = "ppm_1";
    public static final String EXTRA_PPM_2 = "ppm_2";
    public static final String EXTRA_FINAL_DLEE = "final_dlee";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anna_result);

        textPpm1 = findViewById(R.id.ppm1);
        textPpm2 = findViewById(R.id.ppm2);
        textDle = findViewById(R.id.dle);

        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
            double ppm1 = arguments.getDouble(EXTRA_PPM_1, 0.0);
            double ppm2 = arguments.getDouble(EXTRA_PPM_2, 0.0);
            double finalDlee = arguments.getDouble(EXTRA_FINAL_DLEE, 0.0);

            textPpm1.setText(String.format("%.2f", ppm1));
            textPpm2.setText(String.format("%.2f", ppm2));
            textDle.setText(String.format("%.2f", finalDlee));
        }
    }
}
