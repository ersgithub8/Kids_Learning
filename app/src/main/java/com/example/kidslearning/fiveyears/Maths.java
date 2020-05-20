package com.example.kidslearning.fiveyears;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;

public class Maths extends AppCompatActivity {
    LinearLayout add,sub,mul,div,quiz;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
        add=(LinearLayout)findViewById(R.id.add);
        sub=(LinearLayout)findViewById(R.id.sub);
        mul=(LinearLayout)findViewById(R.id.mul);
        div=(LinearLayout)findViewById(R.id.div);
        quiz=(LinearLayout)findViewById(R.id.quizm);
        mp=MediaPlayer.create(this,R.raw.press);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Maths.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                startActivity(intent);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Maths.this, VideoActivity.class);
                intent.putExtra("url", "https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Basic%20divition.mp4?alt=media&token=c0cf5f2e-2bfd-4ef6-9acd-821c65c61a1a");
                startActivity(intent);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Maths.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/basic%20multi.mp4?alt=media&token=65f1858c-6f02-4df6-a364-eed6baf4b11e");
                startActivity(intent);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Maths.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/basic%20subtraction.mp4?alt=media&token=2276baa1-3c47-4d2b-b70b-25ebad2b3c90\n");
                startActivity(intent);
            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(Maths.this,QuizMaths.class));

            }
        });

    }
}
