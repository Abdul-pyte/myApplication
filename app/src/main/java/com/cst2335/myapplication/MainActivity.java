package com.cst2335.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Searchforcars  = (Button) findViewById(R.id.butnCar);
        Searchforcars.setOnClickListener( c -> {

            Intent goToProfile  = new Intent(MainActivity.this, CarActivity.class);
            startActivity( goToProfile);
        });

        Button Searchforsoccer  = (Button) findViewById(R.id.butnSoccer);
        Searchforsoccer.setOnClickListener( c -> {

            Intent goToProfile  = new Intent(MainActivity.this, SoccerActivity.class);

            startActivity( goToProfile);
        });

        Button SearchforTriviar  = (Button) findViewById(R.id.butnTrivia);
        SearchforTriviar.setOnClickListener( c -> {

            Intent goToProfile  = new Intent(MainActivity.this, IndexActivity.class);

            startActivity( goToProfile);
        });
        Button SearchforSong  = (Button) findViewById(R.id.butnSongster);
        SearchforSong.setOnClickListener( c -> {

            Intent goTowwProfile  = new Intent(MainActivity.this, SongMainActivity.class);

            startActivity( goTowwProfile);
        });
    }

}