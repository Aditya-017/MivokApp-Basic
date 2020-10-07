package com.example.mivokapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import java.util.List;

public class wordAdapter extends ArrayAdapter<Word> {
    private int color;
    MediaPlayer ml;
    Context context;
    public wordAdapter(@NonNull Context context,@NonNull List<Word> objects,int color) {
        super(context,0,objects);
        this.context=context;
        this.color=color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final Word currWord =getItem(position);
        View List_item_view=convertView;
        if(List_item_view == null) {
            List_item_view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        TextView mivok=(TextView) List_item_view.findViewById(R.id.miwokTextView);
        mivok.setText(currWord.getMivok());
        TextView eng=(TextView) List_item_view.findViewById(R.id.defaultTextView);
        eng.setText(currWord.getDefaultTranslation());
        ImageView img = (ImageView) List_item_view.findViewById(R.id.image);
        if(currWord.hasImage()) {

            img.setImageResource(currWord.getImg());
        }
        else
            img.setVisibility(View.GONE);
        ConstraintLayout cl= List_item_view.findViewById(R.id.cl);
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ml=MediaPlayer.create(context,currWord.getVoice());
                ml.start();
                ml.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        releaseMediaPlayer();
                        Toast.makeText(context, "finished", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
        View ll=List_item_view.findViewById(R.id.linearlayout);
        int col= ContextCompat.getColor(getContext(),color);
        ll.setBackgroundColor(col);
        return List_item_view ;
    }
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (ml != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            ml.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            ml = null;
        }
    }
}
