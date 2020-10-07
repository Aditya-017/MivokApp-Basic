package com.example.mivokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        List<Word> words=new ArrayList<>();
        words.add(new Word("minto wuksus","Where are you going?",R.raw.phrase_where_are_you_going));
        words.add(new Word("tinna oyaase'ne","What is your name?",R.raw.phrase_what_is_your_name));
        words.add(new Word("oyaaset...","My name is..",R.raw.phrase_my_name_is));
        words.add(new Word("michekses?","How are you feeling?",R.raw.phrase_how_are_you_feeling));
        words.add(new Word("kuchi achit?","I am feeling good.",R.raw.phrase_im_feeling_good));
        words.add(new Word("eenes'aa","Are you coming?",R.raw.phrase_are_you_coming));
        words.add(new Word("hee'eenem","Yes, I'm coming",R.raw.phrase_yes_im_coming));
        words.add(new Word("eenem","I'm coming.",R.raw.phrase_im_coming));
        words.add(new Word("yoowutis","Let's go!",R.raw.phrase_lets_go));
        words.add(new Word("anni'nem","Come here",R.raw.phrase_come_here));

        wordAdapter adapter = new wordAdapter(this,words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}