package com.example.mivokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        List<Word> words=new ArrayList<>();
        words.add(new Word("epe ","Father",R.drawable.family_father,R.raw.family_father));
        words.add(new Word("eta","Mother",R.drawable.family_mother,R.raw.family_mother));
        words.add(new Word("angsi","Son",R.drawable.family_son,R.raw.family_son));
        words.add(new Word("tune","Daughterr",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Word("taachi","Older Brother",R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new Word("chalitti","Younger Brother",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Word("tete","Older Sister",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Word("kolliti","Younger Sister",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Word("ama","Grandmother",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Word("paapa","Grandfather",R.drawable.family_grandfather,R.raw.family_grandfather));

        wordAdapter adapter = new wordAdapter(this,words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}