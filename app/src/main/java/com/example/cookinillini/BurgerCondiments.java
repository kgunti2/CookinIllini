package com.example.cookinillini;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BurgerCondiments extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burger_condiments);
        burgerKetchupButton();
        burgerMustardButton();
    }

    private void burgerKetchupButton() {
        ImageButton one = (ImageButton) findViewById(R.id.ketchup);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BurgerCondiments.this, BurgerFinal.class));
            }
        });
    }

    private void burgerMustardButton() {
        ImageButton two = (ImageButton) findViewById(R.id.mustard);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BurgerCondiments.this, BurgerFinal.class));
            }
        });
    }
}
