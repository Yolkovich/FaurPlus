package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class PpmDleCalculatorActivity extends AppCompatActivity {

    private EditText input426Ok, input426Nok, input43xOk, input43xNok, inputQuantityHours;
    private CoordinatorLayout coordinatorLayout;
    private RelativeLayout calculateButton;
    private static int errorCount;

    private static final int COLOR_GREEN = 0xff00ff00;
    private static final double MILLION = 1_000_000;
    private static final double DLE_CONSTANT = 1200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anna);

        input426Ok = findViewById(R.id.volvo_426_ok);
        input426Nok = findViewById(R.id.volvo_426_nok);
        input43xOk = findViewById(R.id.volvo_43x_ok);
        input43xNok = findViewById(R.id.volvo_43x_nok);
        inputQuantityHours = findViewById(R.id.quantity_hours);
        calculateButton = findViewById(R.id.button_anna);
        coordinatorLayout = findViewById(R.id.materialToolbar);

        FloatingActionButton resetButton = findViewById(R.id.button_delet_all);
        resetButton.setOnClickListener(v -> resetFields());

        calculateButton.setOnClickListener(view -> {
            errorCount = 0;
            validateInputs();
            if (errorCount == 0) {
                calculateMetrics();
            }
        });
    }

    private void resetFields() {
        input426Ok.setText("");
        input426Nok.setText("");
        input43xOk.setText("");
        input43xNok.setText("");
        inputQuantityHours.setText("");
    }

    private void showCustomSnackbar(String message) {
        Snackbar snackbar = Snackbar.make(coordinatorLayout, message, Snackbar.LENGTH_LONG);
        View customView = getLayoutInflater().inflate(R.layout.snack_bur_custom_max_dle, null);
        snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
        @SuppressLint("RestrictedApi") Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
        snackbarLayout.setPadding(0, 0, 0, 0);
        snackbarLayout.addView(customView, 0);
        snackbar.show();
    }

    private void validateInputs() {
        validateField(input426Ok);
        validateField(input426Nok);
        validateField(input43xOk);
        validateField(input43xNok);
        validateField(inputQuantityHours);
    }

    private void validateField(EditText inputField) {
        if (inputField.getText().length() == 0) {
            inputField.setText("Puste pole");
            inputField.setBackgroundColor(COLOR_GREEN);
            showCustomSnackbar("Field cannot be empty!");
            errorCount++;
        }
    }

    private void calculateMetrics() {
        double int426Ok = parseDouble(input426Ok);
        double int426Nok = parseDouble(input426Nok);
        double int43xOk = parseDouble(input43xOk);
        double int43xNok = parseDouble(input43xNok);
        double hours = parseDouble(inputQuantityHours);

        double finalPpm1 = calculatePpm(int426Nok, int426Ok);
        double finalPpm2 = calculatePpm(int43xNok, int43xOk);
        double finalDle = calculateDle(int426Ok, int43xOk, hours);

        launchResultActivity(finalPpm1, finalPpm2, finalDle);
    }

    private double parseDouble(EditText input) {
        return Double.parseDouble(input.getText().toString());
    }

    private double calculatePpm(double nok, double ok) {
        return (nok * MILLION) / (nok + ok);
    }

    private double calculateDle(double ok426, double ok43x, double hours) {
        return Math.floor(((ok426 + ok43x) * DLE_CONSTANT / hours / 3600 / 4) * 100) / 10.0;
    }

    private void launchResultActivity(double finalPpm1, double finalPpm2, double finalDle) {
        Intent intent = new Intent(PpmDleCalculatorActivity.this, MetricsResultActivity.class);
        intent.putExtra("ppm_1", finalPpm1);
        intent.putExtra("ppm_2", finalPpm2);
        intent.putExtra("final_dlee", finalDle);
        startActivity(intent);
    }
}
