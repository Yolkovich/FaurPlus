package com.example.faurplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class Anna extends AppCompatActivity  {

    private EditText v426_ok, v426_nok, v43x_ok, v43x_nok, quantit_hours;
    CoordinatorLayout constraintLayout;
    RelativeLayout button_1;
    private CoordinatorLayout coordinatorLayout;
    static int count;



    public void toNull(){
        v426_ok.setText("");
        v426_nok.setText("");
        v43x_ok.setText("");
        v43x_nok.setText("");
        quantit_hours.setText("");
    }


    public void foo(){
        Snackbar snackbar = Snackbar.make(coordinatorLayout, "", Snackbar.LENGTH_LONG);
        View custom = getLayoutInflater().inflate(R.layout.snack_bur_custom_max_dle, null);
        snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
        snackbarLayout.setPadding(0, 0, 0, 0);

        snackbarLayout.addView(custom, 0);
        snackbar.show();

    }


    public void check(){

        if (v426_ok.getText().length() == 0) {
            v426_ok.setText("Puste pole");
            v426_ok.setBackgroundColor(0xff00ff00);
            count++;
            foo();}

        if (v426_nok.getText().length() == 0) {
            v426_nok.setText("Puste pole");
            v426_nok.setBackgroundColor(0xff00ff00);
            foo();
            count++;}

        if (v43x_ok.getText().length() == 0) {
            v43x_ok.setText("Puste pole");
            v43x_ok.setBackgroundColor(0xff00ff00);
            foo();
            count++;}

        if (v43x_nok.getText().length() == 0) {
            v43x_nok.setText("Puste pole");
            v43x_nok.setBackgroundColor(0xff00ff00);
            foo();
            count++;}

        if (quantit_hours.getText().length() == 0) {
            quantit_hours.setText("Puste pole");
            quantit_hours.setBackgroundColor(0xff00ff00);
            foo();
            count++;}
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
        button_1 = findViewById(R.id.button_anna);
        constraintLayout =  findViewById(R.id.materialToolbar);

        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.button_delet_all);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toNull();

            }
        });

        // Container
        this.coordinatorLayout = this.findViewById(R.id.materialToolbar);

            button_1.setOnClickListener(view -> {


                boolean stop;
                check();
                if (count >= 1) {
                    stop = true;
                } else {
                    stop = false;
                }

                if(v426_ok.getText().toString().equals("Puste pole") ||
                        v426_nok.getText().toString().equals("Puste pole") ||
                        v43x_ok.getText().toString().equals("Puste pole") ||
                        v43x_nok.getText().toString().equals("Puste pole") ||
                        quantit_hours.getText().toString().equals("Puste pole")){
                    count++;
                }else{
                    if(stop){
                        if(v426_ok.getText().toString().equals("Puste pole")){
                            v426_ok.setText(0 + "");
                        }
                        if(v426_nok.getText().toString().equals("Puste pole")){
                            v426_nok.setText(0 + "");
                        }
                        if(v43x_ok.getText().toString().equals("Puste pole")){
                            v43x_ok.setText(0 + "");
                        }
                        if(v43x_nok.getText().toString().equals("Puste pole")){
                            v43x_nok.setText(0 + "");
                        }
                        if(quantit_hours.getText().toString().equals("Puste pole")){
                            quantit_hours.setText(0 + "");
                        }
                    }
                    stop = true;

                    if (stop) {
                        //PPM1
                        double int426ok = Integer.parseInt(v43x_ok.getText().toString());
                        double int426nok = Integer.parseInt(v43x_nok.getText().toString());
                        double million = 1_000_000;
                        double ex1 = int426nok * million;
                        double sum_ppm1 = int426nok + int426ok;
                        double final_ppm1 = ex1 / sum_ppm1;


                        //PPM2
                        double intv43x_ok = Integer.parseInt(v426_ok.getText().toString());
                        double intv43x_nok = Integer.parseInt(v426_nok.getText().toString());
                        double million2 = 1_000_000;
                        double ex2 = intv43x_nok * million2;
                        double sum_ppm2 = intv43x_nok + intv43x_ok;
                        double final_ppm2 = ex2 / sum_ppm2;


                        //DLE
                        double hours = Double.parseDouble(quantit_hours.getText().toString());
                        double sum_ok = int426ok + intv43x_ok;
                        double final_dle = sum_ok * 1200 / hours / 3600 / 4 * 100;
                        double final_dlee = Math.floor(final_dle * 10) / 10.0;

                        if (Integer.parseInt(v426_ok.getText().toString()) >= 0 &&
                                Integer.parseInt(v426_nok.getText().toString()) >= 0 &&
                                Integer.parseInt(v43x_ok.getText().toString()) >= 0 &&
                                Integer.parseInt(v43x_nok.getText().toString()) >= 0 &&
                                Integer.parseInt(quantit_hours.getText().toString()) >= 0) {

                            Intent intent = new Intent(Anna.this, AnnaResult.class);
                            intent.putExtra("ppm_1", final_ppm1);
                            intent.putExtra("ppm_2", final_ppm2);
                            intent.putExtra("final_dlee", final_dlee);
                            // запуск SecondActivity
                            startActivity(intent);
                        }


                    }
                }

            });











    }
}