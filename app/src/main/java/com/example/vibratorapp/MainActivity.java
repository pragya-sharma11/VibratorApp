package com.example.vibratorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT>26){
                    ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(2000);
                }
                else{
                    ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(2000);
                }
            }
        });
    }
}