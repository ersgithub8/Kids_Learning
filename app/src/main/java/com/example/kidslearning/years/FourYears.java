package com.example.kidslearning.years;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.fouryear.EnglishPoems;
import com.example.kidslearning.fouryear.Urdupoems4year;

import androidx.appcompat.app.AppCompatActivity;

public class FourYears extends AppCompatActivity {
    LinearLayout gk,upoems,epoems;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_years);
        gk=(LinearLayout)findViewById(R.id.gk);
        upoems=(LinearLayout)findViewById(R.id.urpoems);
        epoems=(LinearLayout)findViewById(R.id.epoems);
        mp=MediaPlayer.create(this,R.raw.press);

        gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent =new Intent(FourYears.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/gk2.mp4?alt=media&token=a37ddb49-a358-44cc-84a2-7a7492728f2f");
                startActivity(intent);
            }
        });

        epoems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent =new Intent(FourYears.this, EnglishPoems.class);
                startActivity(intent);
            }
        });

        upoems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent =new Intent(FourYears.this, Urdupoems4year.class);
                startActivity(intent);
            }
        });


    }
}
