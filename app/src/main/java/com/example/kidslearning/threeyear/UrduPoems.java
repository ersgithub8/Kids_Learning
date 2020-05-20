package com.example.kidslearning.threeyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;

public class UrduPoems extends AppCompatActivity {
    LinearLayout p1,p2,p3,p4,p5;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urdu_poems);
    p1=(LinearLayout)findViewById(R.id.p1);
        p2=(LinearLayout)findViewById(R.id.p2);
        p3=(LinearLayout)findViewById(R.id.p3);
        p4=(LinearLayout)findViewById(R.id.p4);
        p5=(LinearLayout)findViewById(R.id.p5);
        mp=MediaPlayer.create(this,R.raw.press);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UrduPoems.this, VideoActivity.class);
                mp.start();
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Bulbul%20ka%20bacha.mp4?alt=media&token=0fc11e61-eabb-49a3-9906-2eff3bdc0385");
                startActivity(intent);
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(UrduPoems.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Machli%20ka%20bacha.mp4?alt=media&token=9cd87831-87db-44b3-ab91-33a5a392fc58");
                startActivity(intent);
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(UrduPoems.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Bhalo%20mia.mp4?alt=media&token=c2346fe7-e31c-4d4a-b95f-d666abb81cce");
                startActivity(intent);
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(UrduPoems.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Chu%20Chu%20Cha%20Cha.mp4?alt=media&token=5f6b6bb5-d842-4b92-8ae7-9c5f1bbba767");
                startActivity(intent);
            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(UrduPoems.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Abu%20lay%20motor%20car.mp4?alt=media&token=ff690114-bace-4bf0-937b-1263815aaa7e");
                startActivity(intent);
            }
        });
    }
}
