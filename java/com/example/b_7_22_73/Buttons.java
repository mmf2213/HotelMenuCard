package com.example.b_7_22_73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Buttons extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        b1 = findViewById(R.id.menu);
        b2 = findViewById(R.id.drink);
        b3 = findViewById(R.id.dessert);
        b4 = findViewById(R.id.starter);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new
                        Intent(getApplicationContext(),MainCourse.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new
                        Intent(getApplicationContext(),Drinks.class);

                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new
                        Intent(getApplicationContext(),Dessert.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new
                        Intent(getApplicationContext(),Starter.class);
                startActivity(i);
            }
        });

    }}