package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DleResult extends AppCompatActivity {

    private EditText gap_to_jnh, jnh, fdl_final, d_ex, g_ex, b_ex, hh_ex, i_ex, j_ex, n_ex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dle_result);

        //get values from last activity
        Bundle arguments = getIntent().getExtras();


        double fb_ex = arguments.getDouble("b_ex");
        double fd_ex = arguments.getDouble("d_ex");
        double fg_ex = arguments.getDouble("g_ex");
        double fh_ex = arguments.getDouble("h_ex");
        double fi_ex = arguments.getDouble("i_ex");
        double fj_ex = arguments.getDouble("j_ex");
        double fofo = arguments.getDouble("fofo");
        double h_ex = arguments.getDouble("h_ex");

        double fgap_to_jnh = arguments.getDouble("gap_to_jnh");
        double JNH = arguments.getDouble("JNH");
        double DLE = arguments.getDouble("DLE");




        //get value for EditText
        fdl_final = findViewById(R.id.dle_answer);
        fdl_final.setText(String.format("%.2f", DLE));
        fdl_final.setEnabled(false);

        jnh = findViewById(R.id.jnh);
        jnh.setText(String.format("%.1f", JNH));
        jnh.setEnabled(false);

        gap_to_jnh = findViewById(R.id.gap_to_jnh);
        gap_to_jnh.setText(String.format("%.1f", fgap_to_jnh));
        gap_to_jnh.setEnabled(false);

        b_ex = findViewById(R.id.be);
        b_ex.setText(String.format("%.2f", fb_ex));
        b_ex.setEnabled(false);

        d_ex = findViewById(R.id.de);
        d_ex.setText(String.format("%.2f", fd_ex));
        d_ex.setEnabled(false);

        g_ex = findViewById(R.id.ge);
        g_ex.setText(String.format("%.2f", fg_ex));
        g_ex.setEnabled(false);

        i_ex = findViewById(R.id.ie);
        i_ex.setText(String.format("%.2f", fi_ex));
        i_ex.setEnabled(false);

        j_ex = findViewById(R.id.je);
        j_ex.setText(String.format("%.2f", fj_ex));
        j_ex.setEnabled(false);


        n_ex = findViewById(R.id.ne);
        n_ex.setText(String.format("%.2f", fofo));
        n_ex.setEnabled(false);


        hh_ex = findViewById(R.id.he);
        hh_ex.setText(String.format("%.2f", fh_ex));
        hh_ex.setEnabled(false);



    }
}