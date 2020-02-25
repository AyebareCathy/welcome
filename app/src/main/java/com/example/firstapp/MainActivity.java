package com.example.firstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaring variables
    MediaPlayer mPlayer;
    Button buttonplay;
    Button buttonpause;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //calling variables inside the main method
        buttonplay = (Button) findViewById(R.id.button);
        buttonplay.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.omusheshe);
                if (mPlayer != null && mPlayer.isPlaying()) {
                    mPlayer.stop();
                }
                mPlayer.start();


            }
        });
        buttonpause = (Button) findViewById(R.id.button2);
        buttonpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.stop();
            }
        });

    }
        public void sendMessage (View view){
            EditText message = (EditText) findViewById(R.id.message);
            //Toast.makeText (this, "Sending DisplayMessageActivity.class);
            Intent intent = new Intent(MainActivity.this,DisplayMessageActivity.class);
            intent.putExtra("MESSAGE", message.getText().toString());
            message.setText("");
            startActivity(intent);
    }
    // this is where menus are inflated

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.ayeba,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemx=item.getItemId();
        switch (itemx){
            case R.id.mbarara:
           Intent myintent1=new Intent(MainActivity.this,ayebare.class);
           startActivity(myintent1);
                Toast.makeText(this, "Mbarara is selected", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.makerere:
                Intent myintent2=new Intent(MainActivity.this,DisplayMessageActivity.class);
                startActivity(myintent2);
                Toast.makeText(this, "Makerere is selected", Toast.LENGTH_SHORT).show();
                return true;

                default:

                    return true;

        }


    }
}