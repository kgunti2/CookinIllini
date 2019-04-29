package com.example.cookinillini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class TacoShell extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taco_shell);
        hardShellButton();
        softShellButton();
    }

    private void hardShellButton() {
        ImageButton one = (ImageButton) findViewById(R.id.hardshell);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TacoShell.this, TacoProtein.class));
            }
        });
    }

    private void softShellButton() {
        ImageButton two = (ImageButton) findViewById(R.id.softshell);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TacoShell.this, TacoProtein.class));
            }
        });
    }
}
