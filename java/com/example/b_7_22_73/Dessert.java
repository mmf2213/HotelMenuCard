package com.example.b_7_22_73;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Dessert extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        addListnerOnButtonClick();
    }
    public void addListnerOnButtonClick() {
        b = (Button) findViewById(R.id.t5);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i=new Intent(getApplicationContext(), Drinks.class);
                startActivity(i);
            }
        });
    }
}
