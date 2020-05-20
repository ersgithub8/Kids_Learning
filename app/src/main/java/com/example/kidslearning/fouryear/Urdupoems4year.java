package com.example.kidslearning.fouryear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;

public class Urdupoems4year extends AppCompatActivity {
LinearLayout pu1,pu2,pu3,pu4,pu5;
MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urdupoems4year);
    pu1=(LinearLayout)findViewById(R.id.pu1);
        pu2=(LinearLayout)findViewById(R.id.pu2);
        pu3=(LinearLayout)findViewById(R.id.pu3);
        pu4=(LinearLayout)findViewById(R.id.pu4);
        pu5=(LinearLayout)findViewById(R.id.pu5);
        mp=MediaPlayer.create(this,R.raw.press);
        pu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {mp.start();
                Intent intent=new Intent(Urdupoems4year.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Alo%20mia.mp4?alt=media&token=8415d105-be9c-4646-83a1-88a76ed703f4");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Furdu%20poems%2FAloo%20Main.mp4?alt=media&token=daa7a3d6-af22-4dcb-9207-b27ac8fd824d");
                startActivity(intent);
            }
        });
        pu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Urdupoems4year.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Terar%20or%20bater.mp4?alt=media&token=a662bf43-a1d5-4ff3-9355-caf320c776b4c");
                startActivity(intent);
            }
        });
        pu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Urdupoems4year.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Tota%20mena.mp4?alt=media&token=5fb818c7-b85c-4273-97e1-0a90bb13d277");
                startActivity(intent);
            }
        });
        pu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Urdupoems4year.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Nani_teri_morni.mp4?alt=media&token=5f108e34-348e-4828-8890-d7a92ae9ab59");
                startActivity(intent);
            }
        });
        pu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Urdupoems4year.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/ami%20ki%20roti.mp4?alt=media&token=a3ebbab2-e70b-405e-b58c-ed9fbae472d5");
                startActivity(intent);
            }
        });
    }
}
