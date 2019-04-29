package com.example.cookinillini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PastaType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasta_type);
        pastaOneButton();
        pastaTwoButton();

    }

    private void pastaOneButton() {
        ImageButton one = (ImageButton) findViewById(R.id.pastatype1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PastaType.this, PastaSauce.class));
            }
        });
    }

    private void pastaTwoButton() {
        ImageButton one = (ImageButton) findViewById(R.id.pastatype2);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PastaType.this, PastaSauce.class));
            }
        });
    }


}
