package com.example.kidslearning.oneyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.years.engalpha;

public class ABC extends AppCompatActivity {
    LinearLayout labc,qabc,alpha,labc2,labc3;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);
    labc=(LinearLayout)findViewById(R.id.labc);
        labc2=(LinearLayout)findViewById(R.id.labc2);
        labc3=(LinearLayout)findViewById(R.id.labc3);
    qabc=(LinearLayout)findViewById(R.id.qabc);
        alpha=(LinearLayout)findViewById(R.id.aplha);
    mp=MediaPlayer.create(this,R.raw.press);


    labc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(ABC.this, VideoActivity.class);
            //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Kapwing%20-%20Where%20Content%20Creation%20Happens.mp4?alt=media&token=efa48da2-6777-45e8-ad67-ced1b344f5c6");
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FABC.mp4?alt=media&token=b38e60e9-6ec8-4ed3-b4c9-448fe8275cf5");
            startActivity(intent);
        }
    });

        labc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(ABC.this, VideoActivity.class); //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Kapwing%20-%20Where%20Content%20Creation%20Happens.mp4?alt=media&token=efa48da2-6777-45e8-ad67-ced1b344f5c6");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fabc%2FAlphabets.mp4?alt=media&token=816cd2d8-9ea5-4a9a-a3e3-33dd7f45a080");
                startActivity(intent);
            }
        });

        labc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(ABC.this, VideoActivity.class); //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Kapwing%20-%20Where%20Content%20Creation%20Happens.mp4?alt=media&token=efa48da2-6777-45e8-ad67-ced1b344f5c6");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fabc%2FAlphabets1.mp4?alt=media&token=6fb073d0-0a8b-4afa-a8ad-8b51fac6a8e6");
                startActivity(intent);
            }
        });

        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ABC.this, Alphabets.class);
                startActivity(intent);
            }
        });

    qabc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(ABC.this, Quizabc.class);
            startActivity(intent);
        }
    });

    }
}
