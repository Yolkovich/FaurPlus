package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Ppm extends AppCompatActivity {

    EditText forwardLeft,  forwardRight, backLeft, backRight, difective, time;
    int million = 1_000_000, number1 = 310, number2 = 320, number3 = 3600, number4 = 4, number5 = 100;
    RelativeLayout button;
    CoordinatorLayout coordinatorLayout;
    static int count;

    public void toNull(){


        forwardLeft.setText("");


        forwardRight.setText("");


        backLeft.setText("");


        backRight.setText("");


        difective.setText("");

    }

    public void foo(){
        Snackbar snackbar = Snackbar.make( coordinatorLayout, "", Snackbar.LENGTH_LONG);
        View custom = getLayoutInflater().inflate(R.layout.snack_bur_custom_max_dle, null);
        snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
        snackbarLayout.setPadding(0, 0, 0, 0);

        snackbarLayout.addView(custom, 0);
        snackbar.show();

    }



    public void check(){


        if (forwardLeft.getText().length() == 0) {
            forwardLeft.setText("Puste pole");
            count++;
            forwardLeft.setBackgroundColor(0xff00ff00);
            foo();}

        if (forwardRight.getText().length() == 0) {
            forwardRight.setText("Puste pole");
            count++;
            forwardRight.setBackgroundColor(0xff00ff00);
            foo();}

        if (backLeft.getText().length() == 0) {
            backLeft.setText("Puste pole");
            count++;
            backLeft.setBackgroundColor(0xff00ff00);
            foo();}

        if (backRight.getText().length() == 0) {
            backRight.setText("Puste pole");
            count++;
            backRight.setBackgroundColor(0xff00ff00);
            foo();}

        if (difective.getText().length() == 0) {
            difective.setText("Puste pole");
            count++;
            difective.setBackgroundColor(0xff00ff00);
            foo();}

        if (time.getText().length() == 0) {
            time.setText("Puste pole");
            count++;
            time.setBackgroundColor(0xff00ff00);
            foo();}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppm);



        FloatingActionButton faba = (FloatingActionButton)findViewById(R.id.button_delet_all);
        faba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toNull();

            }
        });
//
///////////////////////TEST///////////////////////////////////////////////////
//        FloatingActionButton test = (FloatingActionButton)findViewById(R.id.test_numbers);
//        test.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//
//
//                forwardLeft.setText("299");
//
//                forwardRight.setText("300");
//
//                backLeft.setText("288");
//
//                backRight.setText("288");
//
//                difective.setText("1");
//
//                time.setText("32");
//
//
//
//            }
//        });





        forwardLeft = findViewById(R.id.forwardLeft);
        forwardRight = findViewById(R.id.forwardRight);
        backLeft = findViewById(R.id.backLeft);
        backRight = findViewById(R.id.backRight);
        difective = findViewById(R.id.difective);
        button = findViewById(R.id.button);
        time = findViewById(R.id.quantity_hours);
        coordinatorLayout =  findViewById(R.id.materialToolbar);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean stop;
                check();
                if (count >= 1) {
                    stop = true;
                } else {
                    stop = false;
                }

                if(forwardLeft.getText().toString().equals("Puste pole") ||
                        forwardRight.getText().toString().equals("Puste pole") ||
                        backLeft.getText().toString().equals("Puste pole") ||
                        backRight.getText().toString().equals("Puste pole") ||
                        difective.getText().toString().equals("Puste pole") ||
                        time.getText().toString().equals("Puste pole")){
                    count++;
                } else {

                    if (stop) {

                        if (forwardLeft.getText().toString().equals("Puste pole")) {
                            forwardLeft.setText(0 + "");
                        }

                        if (forwardRight.getText().toString().equals("Puste pole")) {
                            forwardRight.setText(0 + "");
                        }

                        if (backLeft.getText().toString().equals("Puste pole")) {
                            backLeft.setText(0 + "");
                        }

                        if (backRight.getText().toString().equals("Puste pole")) {
                            backRight.setText(0 + "");
                        }

                        if (difective.getText().toString().equals("Puste pole")) {
                            difective.setText(0 + "");
                        }

                        if (time.getText().toString().equals("Puste pole")) {
                            time.setText(0 + "");
                        }
                    }

                    stop = true;

                    if (stop) {


                        double forwardLeftD = Double.parseDouble(forwardLeft.getText().toString());
                        double forwardRightD = Double.parseDouble(forwardRight.getText().toString());
                        double backLeftD = Double.parseDouble(backLeft.getText().toString());
                        double backRightD = Double.parseDouble(backRight.getText().toString());
                        double difectiveD = Double.parseDouble(difective.getText().toString());
                        double timeD = Double.parseDouble(time.getText().toString());

                        double allDetails = forwardLeftD + forwardRightD + backLeftD + backRightD + difectiveD;
                        double allGood = forwardLeftD + forwardRightD + backLeftD + backRightD;

                        double ppm = (difectiveD * million) / allDetails;

                        double dle = (allGood * number1) / timeD / 3600 / 4 * 100;

                        if (Integer.parseInt(forwardLeft.getText().toString()) >= 0 &&
                                Integer.parseInt(forwardRight.getText().toString()) >= 0 &&
                                Integer.parseInt(backLeft.getText().toString()) >= 0 &&
                                Integer.parseInt(backRight.getText().toString()) >= 0 &&
                                Integer.parseInt(difective.getText().toString()) >= 0 &&
                                Integer.parseInt(time.getText().toString()) >= 0) {

                            Intent intent = new Intent(Ppm.this, PpmResult.class);
                            intent.putExtra("ppm", ppm);
                            intent.putExtra("dle", dle);

                            startActivity(intent);
                        }
                    }


                }

            }
        });



    }
}