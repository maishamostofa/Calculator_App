package com.example.standardcalculator;

import android.content.Intent;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<secondsDelayed> extends AppCompatActivity {
    protected boolean _active = true;
    protected int _splashTime = 3500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while (_active && (waited < _splashTime)) {
                        sleep(100);
                        if (_active) {
                            waited += 100;
                        }
                    }
                } catch (Exception e) {

                } finally {

                    startActivity(new Intent(MainActivity.this,
                            StandardCalculator.class));
                    finish();
                }
            }
        };
        splashTread.start();
    }
}
