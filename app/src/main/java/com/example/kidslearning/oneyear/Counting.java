package com.example.kidslearning.oneyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.fiveyears.Maths;

public class Counting extends AppCompatActivity {
    LinearLayout c1,c2,c3,c4;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting);

        c1=(LinearLayout)findViewById(R.id.c1);
        c2=(LinearLayout)findViewById(R.id.c2);
        c3=(LinearLayout)findViewById(R.id.c3);
        c4=(LinearLayout)findViewById(R.id.c4);


        mp=MediaPlayer.create(this,R.raw.press);



        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Counting.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FCounting.mp4?alt=media&token=3f50f842-8cbc-4281-83d1-94c20bb1bbd4");
                startActivity(intent);
            }
        });



        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Counting.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fcounting%2FCounting%20Animals.mp4?alt=media&token=3435d42f-ff49-4fd9-a1fc-58a9a8cc1b84");
                startActivity(intent);
            }
        });



        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Counting.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fcounting%2FCounting%20Workbook.mp4?alt=media&token=5aea2a00-8a2a-4883-88a0-a0594e22b5f2");
                startActivity(intent);
            }
        });



        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Counting.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fcounting%2FCounting%20to%2020.mp4?alt=media&token=7db24dcb-7f2c-4214-81a8-344bdc9e47ae");
                startActivity(intent);
            }
        });

    }
}
