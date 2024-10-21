package com.example.faurplus;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class DleResultActivity extends AppCompatActivity {

    private EditText editGapToJnh, editJnh, editDleResult;
    private EditText editBEx, editDEx, editGEx, editHEx, editIEx, editJEx, editNEx;

    public static final String EXTRA_B_EX = "b_ex";
    public static final String EXTRA_D_EX = "d_ex";
    public static final String EXTRA_G_EX = "g_ex";
    public static final String EXTRA_H_EX = "h_ex";
    public static final String EXTRA_I_EX = "i_ex";
    public static final String EXTRA_J_EX = "j_ex";
    public static final String EXTRA_FOFO = "fofo";
    public static final String EXTRA_GAP_TO_JNH = "gap_to_jnh";
    public static final String EXTRA_JNH = "JNH";
    public static final String EXTRA_DLE = "DLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dle_result);

        editDleResult = findViewById(R.id.dle_answer);
        editJnh = findViewById(R.id.jnh);
        editGapToJnh = findViewById(R.id.gap_to_jnh);
        editBEx = findViewById(R.id.be);
        editDEx = findViewById(R.id.de);
        editGEx = findViewById(R.id.ge);
        editHEx = findViewById(R.id.he);
        editIEx = findViewById(R.id.ie);
        editJEx = findViewById(R.id.je);
        editNEx = findViewById(R.id.ne);

        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
            setFieldValue(editDleResult, arguments.getDouble(EXTRA_DLE, 0.0), 2);
            setFieldValue(editJnh, arguments.getDouble(EXTRA_JNH, 0.0), 1);
            setFieldValue(editGapToJnh, arguments.getDouble(EXTRA_GAP_TO_JNH, 0.0), 1);
            setFieldValue(editBEx, arguments.getDouble(EXTRA_B_EX, 0.0), 2);
            setFieldValue(editDEx, arguments.getDouble(EXTRA_D_EX, 0.0), 2);
            setFieldValue(editGEx, arguments.getDouble(EXTRA_G_EX, 0.0), 2);
            setFieldValue(editHEx, arguments.getDouble(EXTRA_H_EX, 0.0), 2);
            setFieldValue(editIEx, arguments.getDouble(EXTRA_I_EX, 0.0), 2);
            setFieldValue(editJEx, arguments.getDouble(EXTRA_J_EX, 0.0), 2);
            setFieldValue(editNEx, arguments.getDouble(EXTRA_FOFO, 0.0), 2);
        }
    }

    private void setFieldValue(EditText editText, double value, int decimalPlaces) {
        editText.setText(String.format("%." + decimalPlaces + "f", value));
        editText.setEnabled(false);
    }
}
