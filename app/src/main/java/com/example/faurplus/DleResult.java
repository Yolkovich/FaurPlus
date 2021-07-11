package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DleResult extends AppCompatActivity {

    private EditText gap_to_jnh, jnh, dle_final, d_ex, g_ex, b_ex, h_ex, i_ex, j_ex, fofo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dle_result);

        //get values from last activity
        Bundle arguments = getIntent().getExtras();
        double fgap_to_jnh = arguments.getDouble("gap_to_jnh");
        double fjnh = arguments.getDouble("jnh");
        double fdle_final = arguments.getDouble("dle_final");


        double fb_ex = arguments.getDouble("b_ex");
        double fd_ex = arguments.getDouble("d_ex");
        double fg_ex = arguments.getDouble("g_ex");
        double fh_ex = arguments.getDouble("h_ex");
        double fi_ex = arguments.getDouble("i_ex");
        double fj_ex = arguments.getDouble("j_ex");
        double ffofo = arguments.getDouble("fofo");

        System.out.println("fdle_final ------------------------------------------------ " + fdle_final);
        System.out.println("fg_ex ------------------------------------------------ " + fg_ex);
        System.out.println("fgap_to_jnh ------------------------------------------------ " + fgap_to_jnh);
        System.out.println("fjnh ------------------------------------------------ " + fjnh);
        System.out.println("fi_ex ------------------------------------------------ " + fi_ex);
        System.out.println("fb_ex ------------------------------------------------ " + fb_ex);
        System.out.println("fd_ex ------------------------------------------------ " + fd_ex);
        System.out.println("fh_ex ------------------------------------------------ " + fh_ex);
        System.out.println("fj_ex ------------------------------------------------ " + fj_ex);
        System.out.println("ffofo ------------------------------------------------ " + ffofo);
        //get value for EditText
        dle_final = findViewById(R.id.dle_answer);
        //dle_final.setText(fdle_final+"");
        dle_final.setText(String.format("%.2f", fdle_final));
        dle_final.setEnabled(false);

        jnh = findViewById(R.id.jnh);
        jnh.setText(String.format("%.1f", fjnh));
        jnh.setEnabled(false);

    }
}