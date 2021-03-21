package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     public void Login(View view){
         EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
         EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
         Log.i("Info","button pressed");
         Log.i("Username",usernameEditText.getText().toString());
         Log.i("password",passwordEditText.getText().toString());
         Toast.makeText(this,"hi There",Toast.LENGTH_SHORT).show();

     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}