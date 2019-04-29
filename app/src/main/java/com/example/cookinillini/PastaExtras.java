package com.example.cookinillini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PastaExtras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasta_extras);
        olivesButton();
        mushroomsButton();
    }

    private void olivesButton() {
        ImageButton one = (ImageButton) findViewById(R.id.olives);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PastaExtras.this, PastaFinal.class));
            }
        });
    }

    private void mushroomsButton() {
        ImageButton one = (ImageButton) findViewById(R.id.mushrooms);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PastaExtras.this, PastaFinal.class));
            }
        });
    }
}
