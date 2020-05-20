package com.example.kidslearning.twoyear;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;

import androidx.appcompat.app.AppCompatActivity;

public class Kalma extends AppCompatActivity {
    LinearLayout kalma1,kalma2;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalma);
    kalma1=(LinearLayout)findViewById(R.id.kalmaone);
    kalma2=(LinearLayout)findViewById(R.id.kalmatwo);
    mp=MediaPlayer.create(this,R.raw.press);
    kalma1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(Kalma.this, VideoActivity.class);
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Kalima%201.mp4?alt=media&token=7358230c-cc49-4240-acf8-e99926a2e544");
            startActivity(intent);
        }
    });

    kalma2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(Kalma.this, VideoActivity.class);
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Kalima%202.mp4?alt=media&token=b7cd71a0-89d1-49da-94d6-3df6be67b9b9");
            startActivity(intent);
        }
    });
    }
}
