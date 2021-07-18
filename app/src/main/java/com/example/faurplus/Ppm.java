package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Ppm extends AppCompatActivity {

    EditText forwardLeft,  forwardRight, backLeft, backRight, difective, time;
    int million = 1_000_000, number1 = 310, number2 = 320, number3 = 3600, number4 = 4, number5 = 100;
    RelativeLayout button;

    public void toNull(){


        forwardLeft.setText("");


        forwardRight.setText("");


        backLeft.setText("");


        backRight.setText("");


        difective.setText("");

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

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

                Intent intent = new Intent(Ppm.this, PpmResult.class);
                intent.putExtra("ppm", ppm);
                intent.putExtra("dle", dle);

                startActivity(intent);



            }
        });



    }
}