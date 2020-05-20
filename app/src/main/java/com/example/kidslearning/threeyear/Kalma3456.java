package com.example.kidslearning.threeyear;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;

import androidx.appcompat.app.AppCompatActivity;

public class Kalma3456 extends AppCompatActivity {
LinearLayout k3,k4,k5,k6;
MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalma3456);
    k3=(LinearLayout)findViewById(R.id.k3);
        k4=(LinearLayout)findViewById(R.id.k4);
        k5=(LinearLayout)findViewById(R.id.k5);
        k6=(LinearLayout)findViewById(R.id.k6);
        mp=MediaPlayer.create(this,R.raw.press);
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Kalma3456.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Kalima%203.mp4?alt=media&token=c8b8ce81-c4c4-4419-9e8f-e0241e85a5ae");
                startActivity(intent);
            }
        });

        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Kalma3456.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Kalima%204.mp4?alt=media&token=2ccb5aca-2357-4e87-97f7-2c0fcc857143");
                startActivity(intent);
            }
        });

        k5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Kalma3456.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Kalima%205.mp4?alt=media&token=12ad1173-0971-481c-9f88-413d03676233");
                startActivity(intent);
            }
        });

        k6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Kalma3456.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Kalima%206.mp4?alt=media&token=65f32252-1cbb-44bb-8765-5259baad75a1");
                startActivity(intent);
            }
        });
    }
}
