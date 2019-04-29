package com.example.cookinillini;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TacoCondiments extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taco_sauce);
        sauceButton();
        guacButton();
    }

    private void sauceButton() {
        ImageButton one = (ImageButton) findViewById(R.id.sauce);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TacoCondiments.this, TacoFinal.class));
            }
        });
    }

    private void guacButton() {
        ImageButton two = (ImageButton) findViewById(R.id.guac);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TacoCondiments.this, TacoFinal.class));
            }
        });
    }
}
