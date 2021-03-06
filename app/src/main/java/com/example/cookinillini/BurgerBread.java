package com.example.cookinillini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BurgerBread extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burger_bread);
        burgerPlainButton();
        burgerSesameButton();
    }


    private void burgerPlainButton() {
        ImageButton one = (ImageButton) findViewById(R.id.plainBun);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BurgerBread.this, BurgerPatty.class));
            }
        });
    }

    private void burgerSesameButton() {
        ImageButton two = (ImageButton) findViewById(R.id.sesameBun);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BurgerBread.this, BurgerPatty.class));
            }
        });
    }
}
