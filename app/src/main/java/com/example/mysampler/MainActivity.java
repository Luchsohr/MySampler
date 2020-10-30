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
import android.widget.ImageView;
//public class MainActivity extends AppCompatActivity {
public class MainActivity extends ComponentActivity {


    private SoundPool soundPool;
    private ImageView SheepView1;
    private ImageView SheepView2;
    private ImageView SheepView3;
    private ImageView SheepView1b;
    private ImageView SheepView2b;
    private ImageView SheepView3b;
    int  SheepSoundID1 ;
    int  SheepSoundID2 ;
    int  SheepSoundID3 ;

    public void MyTouchMsg(String s)
    {
        Toast einToast = Toast.makeText(this,s, Toast.LENGTH_SHORT);
        einToast.show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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


        SheepView1 = findViewById(R.id.SHEEP_ID_1);
        SheepView1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                soundPool.play(SheepSoundID1, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        });
        SheepView2 = findViewById(R.id.SHEEP_ID_2);
        SheepView2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                soundPool.play(SheepSoundID2, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        });
        SheepView3 = findViewById(R.id.SHEEP_ID_3);
        SheepView3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                soundPool.play(SheepSoundID3, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        });

        SheepView1b = findViewById(R.id.SHEEP_ID_1b);
        SheepView1b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                soundPool.play(SheepSoundID1, 1.0f, 1.0f, 1, 0, 2.0f);
            }
        });
        SheepView2b = findViewById(R.id.SHEEP_ID_2b);
        SheepView2b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                soundPool.play(SheepSoundID2, 1.0f, 1.0f, 1, 0, 2.0f);
            }
        });
        SheepView3b = findViewById(R.id.SHEEP_ID_3b);
        SheepView3b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                soundPool.play(SheepSoundID3, 1.0f, 1.0f, 1, 0, 2.0f);
            }
        });
    };



}