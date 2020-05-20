package com.example.kidslearning.twoyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.years.Twoyears;

public class BodyPart extends AppCompatActivity {
    LinearLayout qbp,lbp;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_part);
    qbp=(LinearLayout)findViewById(R.id.qbp);
    lbp=(LinearLayout)findViewById(R.id.lbp);
    mp=MediaPlayer.create(this,R.raw.press);
    lbp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(BodyPart.this, VideoActivity.class);
            //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/parts%20of%20body.mp4?alt=media&token=f3dec1ea-16af-4d5f-9f06-da7377006392");
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FBady%20Parts.mp4?alt=media&token=00a32446-67f2-4395-ae43-a57afc3c9cd0");
            startActivity(intent);
        }
    });

    qbp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            startActivity(new Intent(BodyPart.this,BodyPartQuiz.class));
        }
    });
    }
}
