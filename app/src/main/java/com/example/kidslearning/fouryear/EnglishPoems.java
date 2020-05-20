package com.example.kidslearning.fouryear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.threeyear.UrduPoems;

public class EnglishPoems extends AppCompatActivity {
    LinearLayout p1,p2,p3,p4,p5;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_poems);
        p1=(LinearLayout)findViewById(R.id.pe1);
        p2=(LinearLayout)findViewById(R.id.pe2);
        p3=(LinearLayout)findViewById(R.id.pe3);
        p4=(LinearLayout)findViewById(R.id.pe4);
        p5=(LinearLayout)findViewById(R.id.pe5);
        mp=MediaPlayer.create(this,R.raw.press);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(EnglishPoems.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Baa%20Baa%20Black%20Sheep.mp4?alt=media&token=f8a79446-0ff8-4d10-be12-f3c62a08669d");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fenglish%20poems%2FBaa%20baa%20black%20sheep.mp4?alt=media&token=2dbba749-2609-4af9-86dd-1030a03c8bfb");
                startActivity(intent);
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(EnglishPoems.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Humpty%20dampty%201.mp4?alt=media&token=8ee87036-bb36-4fc0-9073-bb66bbecdb1f");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fenglish%20poems%2Fhumpty%20dumpty.mp4?alt=media&token=dbe5df01-d438-4ca0-b6c3-6ab9134b1096");
                startActivity(intent);
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(EnglishPoems.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Jack%20and%20Jill.mp4?alt=media&token=6e2b266e-3984-4ba3-8b96-4ad02fc0b954");
                startActivity(intent);
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(EnglishPoems.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Jhony.mp4?alt=media&token=fb41bbd1-1660-4ee7-a652-63b050cbb78a");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fenglish%20poems%2Fjohny.mp4?alt=media&token=1ea18881-a60f-4161-b8ed-3c73b35ab001");
                startActivity(intent);
            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(EnglishPoems.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Twinkle%20Twinkle%20Little%20star.mp4?alt=media&token=2aa14cc2-12c8-420a-ae10-c806b716c2e4");
                startActivity(intent);
            }
        });
    }
}
