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
    LinearLayout add,sub,mul,div,quiz,add2,add3,add4,f1,f2,f3;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
        add=(LinearLayout)findViewById(R.id.add);
        add2=(LinearLayout)findViewById(R.id.add2);
        add3=(LinearLayout)findViewById(R.id.add3);
        add4=(LinearLayout)findViewById(R.id.add4);
        sub=(LinearLayout)findViewById(R.id.sub);
        mul=(LinearLayout)findViewById(R.id.mul);
        div=(LinearLayout)findViewById(R.id.div);
        f1=(LinearLayout)findViewById(R.id.f1);
        f2=(LinearLayout)findViewById(R.id.f2);
        f3=(LinearLayout)findViewById(R.id.f3);
        quiz=(LinearLayout)findViewById(R.id.quizm);
        mp=MediaPlayer.create(this,R.raw.press);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Maths.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAddition.mp4?alt=media&token=0bbe2327-b9e6-47ac-ace2-05d0391dbc19");
                startActivity(intent);
            }
        });

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Maths.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Faddition%2FAddition1.mp4?alt=media&token=2e41c85e-ec3c-474c-b26d-7d7ed3234a29");
                startActivity(intent);
            }
        });

        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Maths.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Faddition%2FAddition2.mp4?alt=media&token=c4d6ecbd-f038-409c-82cd-607d5183812d");
                startActivity(intent);
            }
        });

        add4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Maths.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Faddition%2FAddition3.mp4?alt=media&token=72dadcc1-701d-483e-8719-a51e1a4f26e0");
                startActivity(intent);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Maths.this, VideoActivity.class);
                //intent.putExtra("url", "https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Basic%20divition.mp4?alt=media&token=c0cf5f2e-2bfd-4ef6-9acd-821c65c61a1a");
                intent.putExtra("url", "https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FDividing%20Fractions.mp4?alt=media&token=b0099907-b780-4146-8240-bf58cd6247e0");
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
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/basic%20subtraction.mp4?alt=media&token=2276baa1-3c47-4d2b-b70b-25ebad2b3c90\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FSubtraction.mp4?alt=media&token=703c8d92-6cab-42bd-8028-63f2b75f4616");
                startActivity(intent);
            }
        });


        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Maths.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/basic%20subtraction.mp4?alt=media&token=2276baa1-3c47-4d2b-b70b-25ebad2b3c90\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Faddition%2FFraction.mp4?alt=media&token=e8c7dedc-79b2-4fbb-9c2b-1af8f386e4ff");
                startActivity(intent);
            }
        });


        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Maths.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/basic%20subtraction.mp4?alt=media&token=2276baa1-3c47-4d2b-b70b-25ebad2b3c90\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Faddition%2FFractions.mp4?alt=media&token=00da2f9e-1fb2-4330-a39e-988b60ee638a");
                startActivity(intent);
            }
        });


        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Maths.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/basic%20subtraction.mp4?alt=media&token=2276baa1-3c47-4d2b-b70b-25ebad2b3c90\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Faddition%2FImproper%20Fraction.mp4?alt=media&token=54bde9c2-850c-4779-aec5-9860ca288625");
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
