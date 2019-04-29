package com.example.cookinillini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PastaSauce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasta_sauce);
        alfredoButton();
        pestoButton();

    }

    private void alfredoButton() {
        ImageButton one = (ImageButton) findViewById(R.id.alfredo);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PastaSauce.this, PastaMeat.class));
            }
        });
    }

    private void pestoButton() {
        ImageButton one = (ImageButton) findViewById(R.id.pesto);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PastaSauce.this, PastaMeat.class));
            }
        });
    }
}

