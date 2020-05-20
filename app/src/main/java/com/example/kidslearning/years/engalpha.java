package com.example.kidslearning.years;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.R;
import com.example.kidslearning.oneyear.ABC;
import com.example.kidslearning.oneyear.ONETWO;
import com.example.kidslearning.oneyear.Urdualif;

public class engalpha extends AppCompatActivity {
    LinearLayout abc,c123,urdu;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engalpha);
        abc=(LinearLayout)findViewById(R.id.abc);
        c123=(LinearLayout)findViewById(R.id.c123);
        urdu=(LinearLayout)findViewById(R.id.urdu);
        mp=MediaPlayer.create(this,R.raw.press);
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(engalpha.this, ABC.class);
                startActivity(intent);
            }
        });

        c123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(engalpha.this, ONETWO.class);
                startActivity(intent);

            }
        });

        urdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(engalpha.this, Urdualif.class);
                startActivity(intent);

            }
        });
    }
}
