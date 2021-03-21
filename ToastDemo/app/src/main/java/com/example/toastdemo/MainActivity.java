package com.example.toastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public void click(View view){
    EditText nameEditText = findViewById(R.id.nameEditText);
    Toast.makeText(this,"hello" + nameEditText.getText().toString(),Toast.LENGTH_LONG).show();

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}