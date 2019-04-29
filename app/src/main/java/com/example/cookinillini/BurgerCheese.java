package com.example.cookinillini;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BurgerCheese extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burger_cheese);
        burgerSwissButton();
        burgerPepperjackButton();
    }

    private void burgerSwissButton() {
        ImageButton one = (ImageButton) findViewById(R.id.swiss);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BurgerCheese.this, BurgerVegetable.class));
            }
        });
    }

    private void burgerPepperjackButton() {
        ImageButton two = (ImageButton) findViewById(R.id.pepperjack);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BurgerCheese.this, BurgerVegetable.class));
            }
        });
    }
}
