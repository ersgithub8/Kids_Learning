package com.example.kidslearning.fiveyears;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.fiveyears.QuizWeather;
import com.example.kidslearning.twoyear.Fruit;
import com.example.kidslearning.twoyear.FruitQuiz;

public class Shapes extends AppCompatActivity {

    LinearLayout lesson,quiz;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        lesson=(LinearLayout)findViewById(R.id.lesson);
        quiz=(LinearLayout)findViewById(R.id.quiz);
        mp=MediaPlayer.create(this,R.raw.press);

        lesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Shapes.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fshapes%2FShapes.mp4?alt=media&token=37907b99-20dd-4211-b060-94b363e590b5");
                startActivity(intent);
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(Shapes.this, ShapesQuiz.class));
            }
        });
    }
}
