package com.example.kidslearning.years;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.twoyear.BodyPart;
import com.example.kidslearning.twoyear.Color;
import com.example.kidslearning.twoyear.Fruit;
import com.example.kidslearning.twoyear.Kalma;
import com.example.kidslearning.twoyear.Vegitable;

public class Twoyears extends AppCompatActivity {
    LinearLayout kalma12,bodypart,fruit,vegitable,color,greetings;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoyears);
        kalma12=(LinearLayout)findViewById(R.id.kalma);
        vegitable=(LinearLayout)findViewById(R.id.vegitable);
        fruit=(LinearLayout)findViewById(R.id.fruit);
        bodypart=(LinearLayout)findViewById(R.id.body);
        color=(LinearLayout)findViewById(R.id.colorn);
        greetings=(LinearLayout)findViewById(R.id.greetings);
        mp=MediaPlayer.create(this,R.raw.press);
        kalma12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();
                startActivity(new Intent(Twoyears.this, Kalma.class));
            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Twoyears.this, Color.class);
                startActivity(intent);

            }
        });

        vegitable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Twoyears.this, Vegitable.class);
            startActivity(intent);
            }
        });

        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Twoyears.this, Fruit.class);
                startActivity(intent);

            }
        });

        bodypart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Twoyears.this, BodyPart.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/parts%20of%20body.mp4?alt=media&token=f3dec1ea-16af-4d5f-9f06-da7377006392");
                startActivity(intent);

            }
        });

        greetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Twoyears.this,VideoActivity.class);
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Greeting.mp4?alt=media&token=40d297f9-a516-4342-82d3-974e5670371f");
            startActivity(intent);
            }
        });

    }
}
