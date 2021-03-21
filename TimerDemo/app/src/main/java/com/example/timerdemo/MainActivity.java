package com.example.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new CountDownTimer(10000,1000){
            public void onTick(long millisecondsuntildone){
            Log.i("Second Left",String.valueOf(millisecondsuntildone/1000));
            }
            public  void onFinish(){

            }
        }.start();
       /* final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
            }
        }; */
    }
}