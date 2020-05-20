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

public class ONETWO extends AppCompatActivity {
    LinearLayout lot,qot;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onetwo);
    lot=(LinearLayout)findViewById(R.id.lot);
    qot=(LinearLayout)findViewById(R.id.qot);
    mp=MediaPlayer.create(this,R.raw.press);
    lot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(ONETWO.this, VideoActivity.class);
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Our%20Favorite%20Numbers%20Songs%20-%20Kids%20Songs%20-%20Super%20Simple%20Songs_2.mp4?alt=media&token=f9b177a7-9633-4f49-8492-fc1179e0ca05");
            startActivity(intent);
        }
    });
    qot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(ONETWO.this,QuizOneTwo.class);
            startActivity(intent);
        }
    });
    }
}
