package com.example.kidslearning.fouryear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.fiveyears.ScienceandComputer;

public class Animalandgk extends AppCompatActivity {
    LinearLayout gk,animal1,animal2,quiz;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animalandgk);



        mp=MediaPlayer.create(this,R.raw.press);
        gk=(LinearLayout)findViewById(R.id.gkgk);
        animal1=(LinearLayout)findViewById(R.id.animal1);
        quiz=(LinearLayout)findViewById(R.id.quizgk);
        animal2=(LinearLayout)findViewById(R.id.animal2);

        gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Animalandgk.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/k2%20computer.mp4?alt=media&token=f0c08cab-01d2-4d02-878b-19204ab2f917");
                startActivity(intent);
            }
        });

        animal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Animalandgk.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fanimals%2FAnimals.mp4?alt=media&token=47580aa3-8098-4c71-94f8-6b0fb99abb6e");
                startActivity(intent);
            }
        });

        animal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Animalandgk.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fanimals%2FAnimals2.mp4?alt=media&token=fe44c6bb-8d50-4ce4-8f66-2124c30e1e2e");
                startActivity(intent);
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Animalandgk.this, AnimalQuiz.class);
                startActivity(intent);
            }
        });
    }
}
