package com.gamesforfriends.qubicgameadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainGameActivity extends AppCompatActivity {

    GridView gridView;
    Integer[] Headline = {1, 2,3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        gridView = findViewById(R.id.final_array_view);

        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, Headline);

        gridView.setAdapter(adapter);
    }
}
