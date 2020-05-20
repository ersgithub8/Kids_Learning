package com.example.kidslearning.years;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.threeyear.Kalma3456;
import com.example.kidslearning.threeyear.UrduPoems;

public class ThreeYears extends AppCompatActivity {
LinearLayout kalma3456,gonamaz,spellings,art,upoem;
MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_years);
        kalma3456=(LinearLayout)findViewById(R.id.kalma2);
        gonamaz=(LinearLayout)findViewById(R.id.gestures);
        spellings=(LinearLayout)findViewById(R.id.spelling);
        art=(LinearLayout)findViewById(R.id.arts);
        upoem=(LinearLayout)findViewById(R.id.upoems);
        mp=MediaPlayer.create(this,R.raw.press);
        kalma3456.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(ThreeYears.this, Kalma3456.class);
                startActivity(intent);
            }
        });

        gonamaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            Intent intent=new Intent(ThreeYears.this, VideoActivity.class);
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Namza%203.mp4?alt=media&token=6bb3bc25-ebcd-497f-973d-ff973d22833d");
            startActivity(intent);
            }
        });
        spellings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            Intent intent=new Intent(ThreeYears.this,VideoActivity.class);
            intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Learn%20Spelling%20-%20ABC%20Songs%20for%20Children.mp4?alt=media&token=b3db1ae1-5f2d-4dc0-b7ac-ebe1251e7e26");
            startActivity(intent);
            }
        });
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(ThreeYears.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Art%201.mp4?alt=media&token=cae60bbb-edae-4bed-8991-bf66aeba11be");
                startActivity(intent);
            }
        });
        upoem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(ThreeYears.this, UrduPoems.class));

            }
        });
    }
}
