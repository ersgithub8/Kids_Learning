package com.example.kidslearning.twoyear;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.years.Twoyears;

public class Fruit extends AppCompatActivity {
    LinearLayout qfr,lfr;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
    qfr=(LinearLayout)findViewById(R.id.qfr);
    lfr=(LinearLayout)findViewById(R.id.lfr);
    mp=MediaPlayer.create(this,R.raw.press);
    lfr.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(Fruit.this, VideoActivity.class);
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/fruits%20name1.mp4?alt=media&token=e5846f92-5d1b-497e-a254-214aa0532151");
            startActivity(intent);
        }
    });

    qfr.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            startActivity(new Intent(Fruit.this, FruitQuiz.class));
        }
    });
    }
}
