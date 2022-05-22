package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;


import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    EditText editN,editY;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editN = findViewById(R.id.editName);
        editY = findViewById(R.id.editYear);
    }

    public void ageCalculate(View v){
       int birthYear = Integer.parseInt((editY.getText().toString()));
       String name = editN.getText().toString();
       int currentYear = Calendar.getInstance().get(Calendar.YEAR);
       int age;
       age = currentYear - birthYear;
       Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
       intent.putExtra("Name",name);
       intent.putExtra("Age",age);
       startActivity(intent);
    }
}