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

public class Urdualif extends AppCompatActivity {
    LinearLayout lur,qur;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urdualif);
    lur=(LinearLayout)findViewById(R.id.lur);
    qur=(LinearLayout)findViewById(R.id.qur);
    mp=MediaPlayer.create(this,R.raw.press);
    lur.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(Urdualif.this, VideoActivity.class);
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/ALIF%20BAY%20PAY%20-%20Title%20Song%20-%20YouTube.mp4?alt=media&token=caa6cc7b-e24c-4ee0-9ef2-981fec808638");
            startActivity(intent);
        }
    });
    qur.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(Urdualif.this,QuizUrdu.class);
            startActivity(intent);
        }
    });
    }
}
