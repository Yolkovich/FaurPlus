package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

public class MaxDle extends AppCompatActivity {

    Double  b, c, d, e, i, j, m, n, p, a = 480.0;
    EditText be, ce, de, ee, fe, ie, je, me, ne, pe;
    RelativeLayout button_2;
    public CoordinatorLayout aayout;
    TextView aa, gg, hh;
    private CoordinatorLayout coordinatorLayout;
    static int count;



    public void toNull(){
        be.setText("");
        ce.setText("");
        de.setText("");
        ee.setText("");
        fe.setText("");
        ie.setText("");
        je.setText("");
        me.setText("");
        ne.setText("");
        pe.setText("");
        hh.setText("5");
        gg.setText("20");
        aa.setText("480");

    }




    public void check(){

        if (be.getText().length() == 0){
            be.setText("Puste pole");
            count++;
            be.setBackgroundColor(0xff00ff00);
            foo();}

        if (ce.getText().length() == 0) {
            ce.setText("Puste pole");
            ce.setBackgroundColor(0xff00ff00);
            count++;
            foo();}

        if (de.getText().length() == 0) {
            de.setText("Puste pole");
            count++;
            de.setBackgroundColor(0xff00ff00);
            foo();}

        if (ee.getText().length() == 0) {
            ee.setText("Puste pole");
            count++;
            ee.setBackgroundColor(0xff00ff00);
            foo();}

        if (fe.getText().length() == 0) {
            fe.setText("Puste pole");
            count++;
            fe.setBackgroundColor(0xff00ff00);
            foo();}

        if (ie.getText().length() == 0) {
            ie.setText("Puste pole");
            count++;
            ie.setBackgroundColor(0xff00ff00);
            foo();}

        if (je.getText().length() == 0) {
            je.setText("Puste pole");
            count++;
            je.setBackgroundColor(0xff00ff00);
            foo();}

        if (me.getText().length() == 0) {
            me.setText("Puste pole");
            count++;
            me.setBackgroundColor(0xff00ff00);
            foo();}

         if (ne.getText().length() == 0) {
             ne.setText("Puste pole");
             count++;
             ne.setBackgroundColor(0xff00ff00);
             foo();}

        if (pe.getText().length() == 0) {
            pe.setText("Puste pole");
            count++;
            pe.setBackgroundColor(0xff00ff00);
            foo();}

        if (hh.getText().length() == 0) {
            hh.setText("Puste pole");
            count++;
            hh.setBackgroundColor(0xff00ff00);
            foo();}
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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max_dle);

        button_2 =  findViewById(R.id.button_dle);
        be = findViewById(R.id.e1);
        ce = findViewById(R.id.e2);
        de = findViewById(R.id.e3);
        ee = findViewById(R.id.e4);
        fe = findViewById(R.id.e5);
        ie = findViewById(R.id.e6);
        je = findViewById(R.id.e7);
        me = findViewById(R.id.e8);
        ne = findViewById(R.id.e9);
        pe = findViewById(R.id.actual);
        coordinatorLayout =  findViewById(R.id.maxDle);

        aa = findViewById(R.id.t1);
        //block input data
        aa.setText("480");

        gg = findViewById(R.id.t2);
        gg.setText("20");

        hh = findViewById(R.id.t3);
        hh.setText("5");







        FloatingActionButton faba = (FloatingActionButton)findViewById(R.id.button_delet_all_dle);
        faba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toNull();

            }
        });

/////////////////////TEST///////////////////////////////////////////////////
        FloatingActionButton test = (FloatingActionButton)findViewById(R.id.test_numbers);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                        be.setText("3");


                        ce.setText("30");


                        de.setText("0");


                        ee.setText("19");


                        fe.setText("22");

                        ie.setText("15");


                        je.setText("5");


                        me.setText("0");

                        ne.setText("0");

                        pe.setText("59");



            }
        });







        button_2.setOnClickListener(view -> {

            boolean stop;
            check();
            if (count >= 1) {
                stop = true;
            } else {
                stop = false;
            }



            if(be.getText().toString().equals("Puste pole") ||
            ce.getText().toString().equals("Puste pole") ||
            de.getText().toString().equals("Puste pole") ||
            ee.getText().toString().equals("Puste pole") ||
            fe.getText().toString().equals("Puste pole") ||
            ie.getText().toString().equals("Puste pole") ||
            je.getText().toString().equals("Puste pole") ||
            me.getText().toString().equals("Puste pole") ||
            ne.getText().toString().equals("Puste pole") ||
            pe.getText().toString().equals("Puste pole"))    {
                System.err.println("во всех полях пустота");
                count++;
            }   else {

                if (stop) {

                    if (be.getText().toString().equals("Puste pole")) {
                        be.setText(0 + "");
                    }

                    if (ce.getText().toString().equals("Puste pole")) {
                        ce.setText(0 + "");
                    }

                    if (de.getText().toString().equals("Puste pole")) {
                        de.setText(0 + "");
                    }

                    if (ee.getText().toString().equals("Puste pole")) {
                        ee.setText(0 + "");
                    }

                    if (fe.getText().toString().equals("Puste pole")) {
                        fe.setText(0 + "");
                    }

                    if (ie.getText().toString().equals("Puste pole")) {
                        ie.setText(0 + "");
                    }

                    if (je.getText().toString().equals("Puste pole")) {
                        je.setText(0 + "");
                    }

                    if (me.getText().toString().equals("Puste pole")) {
                        me.setText(0 + "");
                    }

                    if (ne.getText().toString().equals("Puste pole")) {
                        ne.setText(0 + "");
                    }

                    if (pe.getText().toString().equals("Puste pole")) {
                        pe.setText(0 + "");
                    }
                    if (be.getText().toString().equals("Puste pole")) {
                        be.setText(0 + "");
                    }
                }

                    stop = true;

                if (stop) {
                    b = Double.parseDouble(be.getText().toString());
                    c = Double.parseDouble(ce.getText().toString());
                    d = Double.parseDouble(de.getText().toString());
                    e = Double.parseDouble(ee.getText().toString());
                    i = Double.parseDouble(ie.getText().toString());
                    j = Double.parseDouble(je.getText().toString());
                    m = Double.parseDouble(me.getText().toString());
                    n = Double.parseDouble(ne.getText().toString());
                    p = Double.parseDouble(pe.getText().toString());

                    double prox = b + e;
                    //готово
                    double ko = 1 - c / 100;
                    double b_ex = b * ko / prox * 100;

                    //готово
                    double d_ex = d / prox * 100;

                    //готово
                    double po = c / 100 * b;
                    double pop = e + po;
                    double popo = prox * a;
                    double popop = pop / popo;
                    double formulaG = popop * 20 * 100;
                    double g_ex = formulaG;

                    //готово
                    double ho = c / 100 * b;
                    double hoh = e + ho;
                    double hoho = prox * a;
                    double hohoh = hoh / hoho;
                    double formulaH = hohoh * 5 * 100;
                    double h_ex = formulaH;

                    //готово
                    double io = c / 100 * b;
                    double ioi = e + io;
                    double ioio = prox * a;
                    double ioioi = ioi / ioio;
                    double formulaI = ioioi * i * 100;
                    double i_ex = formulaI;

                    //готово
                    double jo = c / 100 * b;
                    double joj = e + jo;
                    double jojo = prox * a;
                    double jojoj = joj / jojo;
                    double formulaJ = jojoj * j * 100;
                    double j_ex = formulaJ;

                    //готово
                    double mo = c / 100 * b;
                    double mom = e + mo;
                    double momo = prox * a;
                    double momom = mom / momo;
                    double formulaM = momom * m * 100;


                    double fo = m * n * prox;
                    double fof = prox * a;
                    double fofo = fo / fof * 100;


                    double max = b_ex + d_ex + g_ex + h_ex + i_ex + j_ex + fofo;

                    double dleFinal = 100 - max;

                    double jnh = p * prox / dleFinal;

                    double gap_to_jnh = prox - jnh;


                    if (Integer.parseInt(be.getText().toString()) >= 0   &&
                            Integer.parseInt(ce.getText().toString()) >= 0 &&
                            Integer.parseInt(de.getText().toString()) >= 0 &&
                            Integer.parseInt(ee.getText().toString()) >= 0 &&
                            Integer.parseInt(fe.getText().toString()) >= 0 &&
                            Integer.parseInt(ie.getText().toString()) >= 0 &&
                            Integer.parseInt(je.getText().toString()) >= 0 &&
                            Integer.parseInt(me.getText().toString()) >= 0 &&
                            Integer.parseInt(ne.getText().toString()) >= 0 &&
                            Integer.parseInt(pe.getText().toString()) >= 0) {

                        Intent intent = new Intent(MaxDle.this, DleResult.class);
                        intent.putExtra("b_ex", b_ex);
                        intent.putExtra("d_ex", d_ex);
                        intent.putExtra("g_ex", g_ex);
                        intent.putExtra("h_ex", h_ex);
                        intent.putExtra("i_ex", i_ex);
                        intent.putExtra("j_ex", j_ex);
                        intent.putExtra("fofo", fofo);
                        intent.putExtra("DLE", dleFinal);
                        intent.putExtra("JNH", jnh);
                        intent.putExtra("gap_to_jnh", gap_to_jnh);
                        startActivity(intent);


                }   }

               }
    });}





}
