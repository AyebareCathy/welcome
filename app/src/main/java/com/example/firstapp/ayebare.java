package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class ayebare extends AppCompatActivity {
    MediaPlayer mPlayer;
    Button buttonPlay;
    Button buttonpause;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayebare);

        buttonPlay =(Button) findViewById(R.id.button);
        //buttonPlay.setOnClickListener(getApplicationContext(),R.raw.omusheshe);
      /*  buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
      textView=findViewById(R.id.text1);
        AssetManager  assetManager=getAssets();
        InputStream files = null;
        {
            try{
                files = assetManager.open("cathy.txt");
            }catch (IOException e){
                e.printStackTrace();
            }
            textView.setText((CharSequence) files);
        }
    }
}
