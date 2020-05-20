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

public class Vegitable extends AppCompatActivity {
    LinearLayout qveg,lveg;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegitable);
    qveg=(LinearLayout)findViewById(R.id.qveg);
    lveg=(LinearLayout)findViewById(R.id.lveg);
    mp=MediaPlayer.create(this,R.raw.press);
    lveg.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(Vegitable.this, VideoActivity.class);
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Vegetable%20Song1.mp4?alt=media&token=54c19b2f-6ff8-4ef1-be77-a4fac5b00b10");
            startActivity(intent);
        }
    });

    qveg.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            startActivity(new Intent(Vegitable.this,VegitableQuiz.class));
        }
    });
    }
}
