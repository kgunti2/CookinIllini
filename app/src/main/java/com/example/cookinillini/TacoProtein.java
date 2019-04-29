package com.example.cookinillini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TacoProtein extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taco_protein);
        blackBeansButton();
        tacoMeatButton();
    }

    private void blackBeansButton() {
        ImageButton one = (ImageButton) findViewById(R.id.blackbeans);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TacoProtein.this, TacoCheese.class));
            }
        });
    }

    private void tacoMeatButton() {
        ImageButton one = (ImageButton) findViewById(R.id.tacomeat);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TacoProtein.this, TacoCheese.class));
            }
        });
    }


}




