package com.gamesforfriends.qubicgameadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mStartgame;
    Button mAbout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     mStartgame = findViewById(R.id.start);
     mAbout = findViewById(R.id.about);


     // transition to MainGameActivity (main game space)
        mStartgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent_game = new Intent(MainActivity.this, MainGameActivity.class);
                startActivity(intent_game);
            }
        });

        // transition to AboutActivity (game description, about authors)
        mAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent_about = new Intent(MainActivity.this, AboutGame.class);
                startActivity(intent_about);
            }

        });





    }
}
