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


    public void foo(){
        Snackbar snackbar = Snackbar.make(aayout, "", Snackbar.LENGTH_LONG);
        View mucro = getLayoutInflater().inflate(R.layout.snack_bur_custom, null);
        snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
        Snackbar.SnackbarLayout snabarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
        snabarLayout.setPadding(0, 0, 0, 0);

        snabarLayout.addView(mucro, 0);
        snackbar.show();

    }

    public void check(){

        if (be.getText().length() == 0) {
            be.setText("0");
            foo();}

        if (ce.getText().length() == 0) {
            ce.setText("0");
            foo();}

        if (de.getText().length() == 0) {
            de.setText("0");
            foo();}

        if (ee.getText().length() == 0) {
            ee.setText("0");
            foo();}

        if (fe.getText().length() == 0) {
            fe.setText("0");
            foo();}

        if (ie.getText().length() == 0) {
            ie.setText("0");
            foo();}

        if (je.getText().length() == 0) {
            je.setText("0");
            foo();}

        if (me.getText().length() == 0) {
            me.setText("0");
            foo();}

         if (ne.getText().length() == 0) {
             ne.setText("0");
             foo();}

        if (pe.getText().length() == 0) {
            pe.setText("0");
            foo();}


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

        aa = findViewById(R.id.t1);
        //block input data
        aa.setText("480");
        //aa.setEnabled(false);

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








        button_2.setOnClickListener(view -> {


            check();

//            if(Integer.parseInt(be.getText().toString()) > 0 &&
//                    Integer.parseInt(ce.getText().toString()) > 0 &&
//                    Integer.parseInt(de.getText().toString()) > 0 &&
//                    Integer.parseInt(ee.getText().toString()) > 0 &&
//                    Integer.parseInt(fe.getText().toString()) > 0 &&
//                    Integer.parseInt(ie.getText().toString()) > 0 &&
//                    Integer.parseInt(je.getText().toString()) > 0 &&
//                    Integer.parseInt(me.getText().toString()) > 0 &&
//                    Integer.parseInt(ne.getText().toString()) > 0 &&
//                    Integer.parseInt(pe.getText().toString()) > 0 ){

                        b = Double.parseDouble(be.getText().toString());
                        c = Double.parseDouble(ce.getText().toString());
                        d = Double.parseDouble(de.getText().toString());
                        e = Double.parseDouble(ee.getText().toString());
                        i = Double.parseDouble(ie.getText().toString());
                        j = Double.parseDouble(je.getText().toString());
                        m = Double.parseDouble(me.getText().toString());
                        n = Double.parseDouble(ne.getText().toString());
                        p = Double.parseDouble(pe.getText().toString());


//
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
                        double m_ex = formulaM;


                        double fo = m * n * prox;
                        double fof = prox * a;
                        double fofo = fo / fof * 100;


                        double max = b_ex + d_ex + g_ex + h_ex + i_ex + j_ex + fofo;
                        double dleFinal = 100 - max;

                        double jnh = p * prox / dleFinal;

                        double gap_to_jnh = prox - jnh;





                         //создание объекта Intent для запуска activity_anna_result
                        Intent intent = new Intent(this, DleResult.class);
                        // передача объекта с ключом "hello" и значением "Hello World"
                        intent.putExtra("DLE", dleFinal);
                        intent.putExtra("JNH", jnh);
                        intent.putExtra("gap_to_jnh", gap_to_jnh);
                        intent.putExtra("b_ex", b_ex);
                        intent.putExtra("d_ex", d_ex);
                        intent.putExtra("g_ex", g_ex);
                        intent.putExtra("h_ex", h_ex);
                        intent.putExtra("i_ex", i_ex);
                        intent.putExtra("j_ex", j_ex);
                        intent.putExtra("fofo", fofo);





                        // запуск SecondActivity
                        startActivity(intent);
//
//            }else {
//                foo();
//
//
//
//            }
//
//        });




    });}





}
