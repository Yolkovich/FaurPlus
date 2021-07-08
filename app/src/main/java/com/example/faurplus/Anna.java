package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class Anna extends AppCompatActivity  {

    private EditText v426_ok, v426_nok, v43x_ok, v43x_nok, quantit_hours;
    private TextView ppm_1, ppm_2, dle_1;
    RelativeLayout button_1;
    private View coordinatorLayout;

    public void foo(){
        Snackbar snackbar = Snackbar.make(coordinatorLayout,
                "Pardon! Ale pola nie mogą być puste!",
                Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anna);

        v426_ok = findViewById(R.id.volvo_426_ok);
        v426_nok = findViewById(R.id.volvo_426_nok);
        v43x_ok = findViewById(R.id.volvo_43x_ok);
        v43x_nok = findViewById(R.id.volvo_43x_nok);
        quantit_hours = findViewById(R.id.quantity_hours);
        ppm_1 = findViewById(R.id.ppm1);
        ppm_2 = findViewById(R.id.ppm2);
        dle_1 = findViewById(R.id.dle);
        button_1 = findViewById(R.id.button_anna);



        // Container
        this.coordinatorLayout = this.findViewById(R.id.materialToolbar);

            button_1.setOnClickListener(view -> {

                if (v426_ok.getText().length() == 0) {
                    v426_ok.setText("0");
                    foo();}

                if (v426_nok.getText().length() == 0) {
                    v426_nok.setText("0");
                    foo();}

                if (v43x_ok.getText().length() == 0) {
                    v43x_ok.setText("0");
                    foo();}

                if (v43x_nok.getText().length() == 0) {
                    v43x_nok.setText("0");
                    foo();}

                if (quantit_hours.getText().length() == 0) {
                    quantit_hours.setText("0");
                    foo();}


                    //PPM1
                    double int426ok = Integer.parseInt(v43x_ok.getText().toString());
                    double int426nok = Integer.parseInt(v43x_nok.getText().toString());
                    double million = 1_000_000;
                    double ex1 = int426nok * million;
                    double sum_ppm1 = int426nok + int426ok;
                    double final_ppm1 = ex1 / sum_ppm1;
                    ppm_1.setText(String.format("%.1f", final_ppm1));

                    //PPM2
                    double intv43x_ok = Integer.parseInt(v426_ok.getText().toString());
                    double intv43x_nok = Integer.parseInt(v426_nok.getText().toString());
                    double million2 = 1_000_000;
                    double ex2 = intv43x_nok * million2;
                    double sum_ppm2 = intv43x_nok + intv43x_ok;
                    double final_ppm2 = ex2 / sum_ppm2;
                    ppm_2.setText(String.format("%.1f", final_ppm2));

                    //DLE
                    double hours = Double.parseDouble(quantit_hours.getText().toString());
                    double sum_ok = int426ok + intv43x_ok;
                    double final_dle = sum_ok * 1200 / hours / 3600 / 4 * 100;

                    double final_dlee = Math.floor(final_dle * 10) / 10.0;


//    if (v426_ok.getText().length() == 0 ||
//            v426_nok.getText().length() == 0 ||
//            v43x_ok.getText().length() == 0 ||
//            v43x_nok.getText().length() == 0 ||
//            quantit_hours.getText().length() == 0                )
//    {
//        Snackbar snackbar = Snackbar.make(coordinatorLayout,
//                "Pardon! Ale pola nie mogą być puste!",
//                Snackbar.LENGTH_LONG);
//        snackbar.show();
//    }



            });








    }
}