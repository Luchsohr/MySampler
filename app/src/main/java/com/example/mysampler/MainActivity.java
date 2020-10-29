package com.example.mysampler;

import android.media.AudioManager;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.SoundPool;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends ComponentActivity {

    private Button Button1;
    private Button Button2;
    private Button Button3;
    private Button Button1b;
    private Button Button2b;
    private Button Button3b;
    private SoundPool soundPool;
    int  SheepSoundID1 ;
    int  SheepSoundID2 ;
    int  SheepSoundID3 ;

    public void MyTouchMsg(String s)
    {
        Toast einToast = Toast.makeText(this,s, Toast.LENGTH_SHORT);
        einToast.show();
    }

    public void PlayMySound(int id)
    {
        MediaPlayer myPlayer = MediaPlayer.create(this,id);
        myPlayer.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button1 = findViewById(R.id.BUTTON_ID_1);
        Button1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v)
           {
               PlayMySound(R.raw.superschaaf1);
           }
        });

        Button2 = findViewById(R.id.BUTTON_ID_2);
        Button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                PlayMySound(R.raw.superschaaf2);
            }
        });

        Button3 = findViewById(R.id.BUTTON_ID_3);
        Button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                PlayMySound(R.raw.superschaaf3);
            }
        });

        soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int i, int i1) {
                MyTouchMsg("Soundpool loaded :-)");
            }
        });

        SheepSoundID1 = soundPool.load(this,R.raw.superschaaf1, 1);
        SheepSoundID2 = soundPool.load(this,R.raw.superschaaf2, 1);
        SheepSoundID3 = soundPool.load(this,R.raw.superschaaf3, 1);


        Button1b = findViewById(R.id.BUTTON_ID_1B);
        Button1b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                soundPool.play(SheepSoundID1, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        });

        Button2b = findViewById(R.id.BUTTON_ID_2B);
        Button2b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                soundPool.play(SheepSoundID2, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        });

        Button3b = findViewById(R.id.BUTTON_ID_3B);
        Button3b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                soundPool.play(SheepSoundID3, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        });
    };



}