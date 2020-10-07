package com.example.mivokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class colorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        List<Word> words=new ArrayList<>();
        words.add(new Word("wetetti","Red",R.drawable.color_red,R.raw.color_red));
        words.add(new Word("chokokki","Green",R.drawable.color_green,R.raw.color_green));
        words.add(new Word("takaakki","Brown",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Word("topoppi","Gray",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Word("kululli","Black",R.drawable.color_black,R.raw.color_black));
        words.add(new Word("kelelli","White",R.drawable.color_white,R.raw.color_white));
        words.add(new Word("topiise","Dusty Yellow",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Word("chiwiite","Mustard Yellow",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));


        wordAdapter adapter = new wordAdapter(this,words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}