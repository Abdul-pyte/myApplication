package com.cst2335.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/*
         This will create a fragment on a new page
         */
public class EmptyActivitySong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_song);
        Bundle data=getIntent().getExtras();
        SongBlankFragment fragment=new SongBlankFragment();
        fragment.setArguments(data);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentLocation,fragment)
                .commit();
    }
}