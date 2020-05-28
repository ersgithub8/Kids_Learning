package com.example.kidslearning.fiveyears;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.years.Weather;

public class ScienceandComputer extends AppCompatActivity {
    LinearLayout science,computer,shape,weather,month;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scienceand_computer);
    science=(LinearLayout)findViewById(R.id.science);
    computer=(LinearLayout)findViewById(R.id.computer);
        shape=(LinearLayout)findViewById(R.id.shape);
        weather=(LinearLayout)findViewById(R.id.weather);
        month=(LinearLayout)findViewById(R.id.month);
    mp=MediaPlayer.create(this,R.raw.press);
    science.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(ScienceandComputer.this, VideoActivity.class);
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/k1.mp4?alt=media&token=9a35089c-7832-4903-bdcc-3140eddbe9f3");
            startActivity(intent);
        }
    });

    computer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(ScienceandComputer.this, VideoActivity.class);
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/k2%20computer.mp4?alt=media&token=f0c08cab-01d2-4d02-878b-19204ab2f917");
            startActivity(intent);
        }
    });

        shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mp.start();
                Intent intent=new Intent(ScienceandComputer.this, Shapes.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fshapes%2FShapes.mp4?alt=media&token=37907b99-20dd-4211-b060-94b363e590b5");
                startActivity(intent);
            }
        });

        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mp.start();
                Intent intent=new Intent(ScienceandComputer.this, Weather.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fweather%2FWeather.mp4?alt=media&token=be1eb848-bfd1-495b-b320-1a3e5aa31ac1");
                startActivity(intent);
            }
        });

        month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mp.start();
                Intent intent=new Intent(ScienceandComputer.this, MonthOfYear.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fmonth%20name%2FMonths%20of%20the%20year.mp4?alt=media&token=4be4b6cf-2c65-45d7-8f98-21b3b947d9b4");
                startActivity(intent);
            }
        });


    }
}
