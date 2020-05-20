package com.example.kidslearning.years;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.fiveyears.Maths;
import com.example.kidslearning.fiveyears.ScienceandComputer;

import androidx.appcompat.app.AppCompatActivity;

public class Fiveyears extends AppCompatActivity {
    LinearLayout maths,knowledge;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiveyears);
    maths=(LinearLayout)findViewById(R.id.maths);
    knowledge=(LinearLayout)findViewById(R.id.kaworld);
    mp=MediaPlayer.create(this,R.raw.press);
    maths.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(Fiveyears.this, Maths.class);
            startActivity(intent);
        }
    });
    knowledge.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent intent=new Intent(Fiveyears.this, ScienceandComputer.class);
            startActivity(intent);
        }
    });
    }
}
