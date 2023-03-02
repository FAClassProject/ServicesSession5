package com.example.servicessession5;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class MyService extends Service {
    MediaPlayer myPlayer;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Service Created", Toast.LENGTH_LONG).show();
        Log.i("OnCreate","Service Created");
        Log.i("OnCreate","Service Created");
        Log.i("OnCreate","Service Created");
        Log.i("OnCreate","Service Created");

        myPlayer = MediaPlayer.create(this, R.raw.uwa);
        myPlayer.setLooping(false); // Set looping
    }

    @Override
    public void onStart(Intent intent, int startid) {
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        Log.i("onStart","Service Started");
        Log.i("onStart","Service Started");
        Log.i("onStart","Service Started");
        Log.i("onStart","Service Started");
        myPlayer.start();

    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_LONG).show();
        Log.i("onDestroy","Service Destroy");
        Log.i("onDestroy","Service Destroy");
        Log.i("onDestroy","Service Destroy");
        Log.i("onDestroy","Service Destroy");
        myPlayer.stop();
    }


}