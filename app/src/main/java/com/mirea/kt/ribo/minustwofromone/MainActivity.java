package com.mirea.kt.ribo.minustwofromone;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button entButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entButton = findViewById(R.id.enterButton);
        entButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextLayer();
                Log.i("fButton", "First button clicked. Next Layer.");
            }
        });
    }

    private void nextLayer() {
        Intent intent = new Intent(this, ThreeNumsCalc.class);
        startActivity(intent);
    }
}