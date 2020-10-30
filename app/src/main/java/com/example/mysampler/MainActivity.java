package com.example.mysampler;

import android.media.AudioManager;
import android.view.View;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import android.media.SoundPool;
import android.widget.Toast;
import android.widget.ImageView;

public class MainActivity extends ComponentActivity {
    public  SoundPool soundPool;
    ImageView imageview;
    public class SheepView
    {

        public SheepView(int viewID, final SoundPool sPool, final int soundID, final float fRate) {


            imageview = findViewById(viewID);
            imageview.setVisibility(View.VISIBLE);
            imageview.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    sPool.play(soundID, 1.0f, 1.0f, 1, 0, fRate);
                }
            });
        }
/*
        public void SetVisibility(int iVisibility)
        { imageview.setVisibility(iVisibility);
        }

 */
    }


    int  SheepSoundID1 ;
    int  SheepSoundID2 ;
    int  SheepSoundID3 ;
/*
    public void MyTouchMsg(String s)
    {
        Toast einToast = Toast.makeText(this,s, Toast.LENGTH_SHORT);
        einToast.show();
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int i, int i1) {
               // MyTouchMsg("Soundpool loaded :-)");

                if (i==SheepSoundID1)
                {
                    SheepView sheepView1 = new SheepView(R.id.SHEEP_ID_1, soundPool, SheepSoundID1, 1.0f);
                    SheepView sheepView1b = new SheepView(R.id.SHEEP_ID_1b, soundPool, SheepSoundID1, 2.0f);
                }
                if (i==SheepSoundID2)
                {
                    SheepView sheepView2 = new SheepView(R.id.SHEEP_ID_2, soundPool, SheepSoundID2, 1.0f);
                    SheepView sheepView2b = new SheepView(R.id.SHEEP_ID_2b, soundPool, SheepSoundID2, 2.0f);
                }
                if (i==SheepSoundID3)
                {
                    SheepView sheepView3 = new SheepView(R.id.SHEEP_ID_3, soundPool, SheepSoundID3, 1.0f);
                    SheepView sheepView3b = new SheepView(R.id.SHEEP_ID_3b, soundPool, SheepSoundID3, 2.0f);
                }
            }
        });

        SheepSoundID1 = soundPool.load(this,R.raw.superschaaf1, 1);
        SheepSoundID2 = soundPool.load(this,R.raw.superschaaf2, 1);
        SheepSoundID3 = soundPool.load(this,R.raw.superschaaf3, 1);


      //  SheepView sheepView1 = new SheepView(R.id.SHEEP_ID_1, soundPool, SheepSoundID1, 1.0f);
        /*
        SheepView sheepView2 = new SheepView(R.id.SHEEP_ID_2, soundPool, SheepSoundID2, 1.0f);
        SheepView sheepView3 = new SheepView(R.id.SHEEP_ID_3, soundPool, SheepSoundID3, 1.0f);

        SheepView sheepView2b = new SheepView(R.id.SHEEP_ID_2b, soundPool, SheepSoundID2, 2.0f);
        SheepView sheepView3b = new SheepView(R.id.SHEEP_ID_3b, soundPool, SheepSoundID3, 2.0f);
        sheepView3b.SetVisibility(View.INVISIBLE);
*/

    };

}