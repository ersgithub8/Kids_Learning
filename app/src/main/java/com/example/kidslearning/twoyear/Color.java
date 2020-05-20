package com.example.kidslearning.twoyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.years.Twoyears;

public class Color extends AppCompatActivity {
    LinearLayout qco,lco;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
    qco=(LinearLayout)findViewById(R.id.qco);
    lco=(LinearLayout)findViewById(R.id.lco);
    mp=MediaPlayer.create(this,R.raw.press);
    lco.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(Color.this, VideoActivity.class);
            //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Color%20name.mp4?alt=media&token=5ade96fa-b410-4185-bdbc-ce5963c17a7c");
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FColors.mp4?alt=media&token=8e4f9a6e-a343-49e6-9975-1b1e1d01f26c");
            startActivity(intent);
        }
    });

    qco.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            startActivity(new Intent(Color.this,ColorQuiz.class));
        }
    });
    }
}
