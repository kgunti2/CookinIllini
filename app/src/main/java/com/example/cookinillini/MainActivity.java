package com.example.cookinillini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {

    //private YouTubePlayerView youTubePlayerView;
    //private YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        burgerButton();
        tacoButton();
        pastaButton();
    }


    private void burgerButton() {
        final Intent intent = new Intent(this, BurgerBread.class);
        ImageButton one = (ImageButton) findViewById(R.id.TheAarthiBurger);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }

    private void tacoButton() {
        ImageButton two = (ImageButton) findViewById(R.id.KeertanaTaco);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TacoShell.class));
            }
        });
    }

    private void pastaButton() {
        ImageButton three = (ImageButton) findViewById(R.id.KeerthiPasta);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PastaType.class));
            }
        });
    }
}
