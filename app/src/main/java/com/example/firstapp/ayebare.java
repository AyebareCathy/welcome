package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ayebare extends AppCompatActivity {
    MediaPlayer mPlayer;
    Button buttonPlay;
    Button buttonpause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayebare);

        buttonPlay =(Button) findViewById(R.id.button);
        //buttonPlay.setOnClickListener(getApplicationContext(),R.raw.omusheshe);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPlayer !=null && mPlayer.isPlaying())
                mPlayer.stop();
            }
        });
    }
}
