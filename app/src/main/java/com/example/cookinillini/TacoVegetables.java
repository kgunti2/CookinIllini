package com.example.cookinillini;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TacoVegetables extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taco_veggies);
        lettuceButton();
        tomatoButton();
    }

    private void lettuceButton() {
        ImageButton one = (ImageButton) findViewById(R.id.tacolettuce);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TacoVegetables.this, TacoCondiments.class));
            }
        });
    }

    private void tomatoButton() {
        ImageButton two = (ImageButton) findViewById(R.id.tacotomatoes);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TacoVegetables.this, TacoCondiments.class));
            }
        });
    }
}
