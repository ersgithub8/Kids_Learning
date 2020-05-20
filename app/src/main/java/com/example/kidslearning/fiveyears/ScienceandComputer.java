package com.example.kidslearning.fiveyears;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;

public class ScienceandComputer extends AppCompatActivity {
    LinearLayout science,computer;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scienceand_computer);
    science=(LinearLayout)findViewById(R.id.science);
    computer=(LinearLayout)findViewById(R.id.computer);
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
    }
}
