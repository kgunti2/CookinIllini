package com.example.cookinillini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TacoCheese extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taco_cheese);
        cheddarButton();
        mozzarellaButton();
    }

    private void cheddarButton() {
        ImageButton one = (ImageButton) findViewById(R.id.cheddar);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TacoCheese.this, TacoVegetables.class));
            }
        });
    }

    private void mozzarellaButton() {
        ImageButton one = (ImageButton) findViewById(R.id.mozzarella);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TacoCheese.this, TacoVegetables.class));
            }
        });
    }

}
