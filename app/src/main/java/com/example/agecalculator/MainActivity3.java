package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textN,textA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textN = findViewById(R.id.textName);
        textA = findViewById(R.id.textAge);

        Intent intent = getIntent();
        String age = String.valueOf(intent.getIntExtra("Age",0));

        String name = intent.getStringExtra("Name");

        textN.setText(name);
        textA.setText("Age: "+age);

    }

    public void GoBack(View v){
        Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
        startActivity(intent);
    }

}