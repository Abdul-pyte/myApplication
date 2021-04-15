package com.cst2335.myapplication;

import android.os.Bundle;

        import androidx.appcompat.app.AppCompatActivity;

public class EmptyActivityTrivia extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_trivia);
        Bundle dataToPass = getIntent().getExtras(); //get the data that was passed from FragmentExample

        DetailsFragmentTrivia dFragment = new DetailsFragmentTrivia();
        dFragment.setArguments( dataToPass ); //pass data to the the fragment
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentLocation, dFragment)
                .commit();
    }
}