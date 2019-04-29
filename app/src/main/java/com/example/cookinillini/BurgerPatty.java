package com.example.cookinillini;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BurgerPatty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burger_patty);
        burgerVeggiePattyButton();
        burgerMeatPattyButton();
    }

    private void burgerVeggiePattyButton() {
        ImageButton one = (ImageButton) findViewById(R.id.veggiepatty);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BurgerPatty.this, BurgerCheese.class));
            }
        });
    }

    private void burgerMeatPattyButton() {
        ImageButton two = (ImageButton) findViewById(R.id.meatPatty);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BurgerPatty.this, BurgerCheese.class));
            }
        });
    }

}
