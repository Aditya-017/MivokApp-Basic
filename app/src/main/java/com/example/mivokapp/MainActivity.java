package com.example.mivokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers =findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i);
            }
        });
        TextView family =findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(i);
            }
        });
        TextView phrases =findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(i);
            }
        });
        TextView colors =findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,colorsActivity.class);
                startActivity(i);
            }
        });
    }

  /*  public void openNumbersList(View view) {
        Intent i= new Intent(this,NumbersActivity.class);
        startActivity(i);
    }*/
}