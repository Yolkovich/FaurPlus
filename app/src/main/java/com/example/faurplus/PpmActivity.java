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

public class PpmActivity extends AppCompatActivity {

    private EditText inputForwardLeft, inputForwardRight, inputBackLeft, inputBackRight, inputDefective, inputTime;
    private CoordinatorLayout coordinatorLayout;
    private static int errorCount;

    private static final int MILLION = 1_000_000;
    private static final int NUMBER1 = 310;
    private static final int NUMBER3 = 3600;
    private static final int NUMBER4 = 4;
    private static final int COLOR_GREEN = 0xff00ff00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RelativeLayout calculateButton = findViewById(R.id.button);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppm);

        inputForwardLeft = findViewById(R.id.forwardLeft);
        inputForwardRight = findViewById(R.id.forwardRight);
        inputBackLeft = findViewById(R.id.backLeft);
        inputBackRight = findViewById(R.id.backRight);
        inputDefective = findViewById(R.id.difective);
        inputTime = findViewById(R.id.quantity_hours);
        coordinatorLayout = findViewById(R.id.materialToolbar);

        FloatingActionButton clearButton = findViewById(R.id.button_delet_all);
        clearButton.setOnClickListener(v -> resetFields());

        calculateButton.setOnClickListener(v -> {
            errorCount = 0;
            validateInputs();

            if (errorCount == 0) {
                calculatePpmAndDle();
            }
        });
    }

    private void resetFields() {
        inputForwardLeft.setText("");
        inputForwardRight.setText("");
        inputBackLeft.setText("");
        inputBackRight.setText("");
        inputDefective.setText("");
        inputTime.setText("");
    }

    private void showCustomSnackbar() {
        Snackbar snackbar = Snackbar.make(coordinatorLayout, "", Snackbar.LENGTH_LONG);
        View customView = getLayoutInflater().inflate(R.layout.snack_bur_custom_max_dle, null);
        snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
        @SuppressLint("RestrictedApi") Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
        snackbarLayout.setPadding(0, 0, 0, 0);
        snackbarLayout.addView(customView, 0);
        snackbar.show();
    }

    private void validateInputs() {
        validateField(inputForwardLeft);
        validateField(inputForwardRight);
        validateField(inputBackLeft);
        validateField(inputBackRight);
        validateField(inputDefective);
        validateField(inputTime);
    }

    private void validateField(EditText inputField) {
        if (inputField.getText().length() == 0) {
            inputField.setText("Puste pole");
            inputField.setBackgroundColor(COLOR_GREEN);
            errorCount++;
            showCustomSnackbar();
        }
    }

    private void calculatePpmAndDle() {
        double forwardLeft = Double.parseDouble(inputForwardLeft.getText().toString());
        double forwardRight = Double.parseDouble(inputForwardRight.getText().toString());
        double backLeft = Double.parseDouble(inputBackLeft.getText().toString());
        double backRight = Double.parseDouble(inputBackRight.getText().toString());
        double defective = Double.parseDouble(inputDefective.getText().toString());
        double time = Double.parseDouble(inputTime.getText().toString());

        double totalDetails = forwardLeft + forwardRight + backLeft + backRight + defective;
        double totalGood = forwardLeft + forwardRight + backLeft + backRight;

        double ppm = (defective * MILLION) / totalDetails;
        double dle = (totalGood * NUMBER1) / time / NUMBER3 / NUMBER4 * 100;

        Intent intent = new Intent(PpmActivity.this, PpmActivity.class);
        intent.putExtra("ppm", ppm);
        intent.putExtra("dle", dle);
        startActivity(intent);
    }
}
