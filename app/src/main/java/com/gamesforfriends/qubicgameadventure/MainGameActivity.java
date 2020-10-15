package com.gamesforfriends.qubicgameadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

public class MainGameActivity extends AppCompatActivity {

    GridView gridView;
    Button btnLeft;

    Integer[] Headline = {1, 2,3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        final GameMatrix gameManage = new GameMatrix();
        gridView = findViewById(R.id.final_array_view);


            btnLeft = findViewById(R.id.btn_rotate_left);

            final ArrayAdapter<Integer> adapter = new ArrayAdapter<>(
                    this, android.R.layout.simple_list_item_1, Headline);

            gridView.setAdapter(adapter);


        btnLeft.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Headline = gameManage.arrayRotateLeft(Headline);


                adapter.notifyDataSetChanged();

            }

        });
    }
}
