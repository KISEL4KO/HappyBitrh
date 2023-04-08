package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.song); // song - имя файла песни, расположенного в папке res/raw/
        mediaPlayer.start();


            }
        }

