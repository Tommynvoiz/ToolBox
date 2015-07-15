package com.example.tomas.myapplication;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.content.Intent;

/**
 * Created by Tomas on 1/20/2015.
 */
public class Splash extends Activity {

    MediaPlayer ourSong;

    @Override
    protected void onCreate(Bundle anyName){
        // TODO Auto-generated method stub
        super.onCreate(anyName);
        setContentView(R.layout.splash);
        ourSong = MediaPlayer.create(Splash.this, R.raw.wahwah);
        ourSong.start();
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent openStartingPoint = new Intent("com.example.tomas.myapplication.Menu");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        ourSong.release();
        finish();
    }
}
