package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;
   Button buttonplay;
    Button buttonpause;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonplay =(Button) findViewById(R.id.button);
        buttonplay.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                mPlayer = MediaPlayer.create(getApplicationContext(),R.raw.omusheshe);


            }
        });
        buttonpause =(Button) findViewById(R.id.button2);
        buttonpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    public void sendMessage (View view) {
        EditText message = (EditText)findViewById(R.id.message);
        //Toast.makeText (this, "Sending message " + message.getText().toString(), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra("MESSAGE", message.getText().toString());
        message.setText("");
        startActivity(intent);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }
}
