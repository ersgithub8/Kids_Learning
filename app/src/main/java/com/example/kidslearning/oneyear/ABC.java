package com.example.kidslearning.oneyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.years.engalpha;

public class ABC extends AppCompatActivity {
    LinearLayout labc,qabc;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);
    labc=(LinearLayout)findViewById(R.id.labc);
    qabc=(LinearLayout)findViewById(R.id.qabc);
    mp=MediaPlayer.create(this,R.raw.press);
    labc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(ABC.this, VideoActivity.class);
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Kapwing%20-%20Where%20Content%20Creation%20Happens.mp4?alt=media&token=efa48da2-6777-45e8-ad67-ced1b344f5c6");
            startActivity(intent);
        }
    });
    qabc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(ABC.this, Quizabc.class);
            startActivity(intent);
        }
    });

    }
}
