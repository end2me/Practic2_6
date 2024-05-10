package com.mirea.kt.ribo.minustwofromone;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThreeNumsCalc extends AppCompatActivity {
    private TextView result;
    private EditText minuend, subtrahend_1, subtrahend_2;
    private Button btnCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_nums_calc);

        result = findViewById(R.id.result);
        minuend = findViewById(R.id.minuend);
        subtrahend_1 = findViewById(R.id.subtrahend_1);
        subtrahend_2 = findViewById(R.id.subtrahend_2);
        btnCalc = findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!minuend.getText().toString().isEmpty() &&
                        !subtrahend_1.getText().toString().isEmpty() &&
                !subtrahend_2.getText().toString().isEmpty()) {
                    float num1 = Float.parseFloat(minuend.getText().toString());
                    float num2 = Float.parseFloat(subtrahend_1.getText().toString());
                    float num3 = Float.parseFloat(subtrahend_2.getText().toString());
                    float res = num1 - (num2 + num3);
                    result.setText(String.valueOf(res));
                    Log.i("sButton", "Second button clicked. Showing the result.");
                }
                else {
                    showInfo("Неверный ввод");
                    Log.i("sButton", "Second button clicked. Incorrect input.");
                }
            }
        });
    }

    private void showInfo(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}