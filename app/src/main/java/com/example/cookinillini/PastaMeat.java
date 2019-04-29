package com.example.cookinillini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PastaMeat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasta_meat);
        meatballButton();
        shrimpButton();
    }

    private void meatballButton() {
        ImageButton one = (ImageButton) findViewById(R.id.meatballs);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PastaMeat.this, PastaCheese.class));
            }
        });
    }

    private void shrimpButton() {
        ImageButton one = (ImageButton) findViewById(R.id.shrimp);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PastaMeat.this, PastaCheese.class));
            }
        });
    }
}
