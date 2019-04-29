package com.example.cookinillini;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BurgerVegetable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burger_vegetables);
        burgerPicklesButton();
        burgerTomatoesButton();
    }

    private void burgerPicklesButton() {
        ImageButton one = (ImageButton) findViewById(R.id.pickles);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BurgerVegetable.this, BurgerCondiments.class));
            }
        });
    }

    private void burgerTomatoesButton() {
        ImageButton two = (ImageButton) findViewById(R.id.tomatoes);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BurgerVegetable.this, BurgerCondiments.class));
            }
        });
    }
}
