package com.example.b_7_22_73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Starter extends AppCompatActivity {
    Button b;
    int amts = 0;
    CheckBox x1, x2, x3, x4, x5, x6, x7, x8, x9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);
        addListnerOnButtonClick();
    }

    public void addListnerOnButtonClick() {
        x1 = (CheckBox) findViewById(R.id.c1);
        x2 = (CheckBox) findViewById(R.id.c2);
        x3 = (CheckBox) findViewById(R.id.c3);
        x4 = (CheckBox) findViewById(R.id.c4);
        x5 = (CheckBox) findViewById(R.id.c5);
        x6 = (CheckBox) findViewById(R.id.c6);
        x7 = (CheckBox) findViewById(R.id.c7);
        x8 = (CheckBox) findViewById(R.id.c8);
        x9 = (CheckBox) findViewById(R.id.c9);
        b=(Button)findViewById(R.id.b2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i=new Intent(getApplicationContext(),MainCourse.class);
                startActivity(i);
            }
        });
    }

}
