package com.example.kidslearning.threeyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;
import com.example.kidslearning.fiveyears.Maths;

public class Art extends AppCompatActivity {
    LinearLayout b,c,h1,h2,p1,p2,s;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);

        b=(LinearLayout)findViewById(R.id.banana);
        c=(LinearLayout)findViewById(R.id.carrot);
        h1=(LinearLayout)findViewById(R.id.house1);
        h2=(LinearLayout)findViewById(R.id.house2);
        p1=(LinearLayout)findViewById(R.id.pencil1);
        p2=(LinearLayout)findViewById(R.id.pencil2);
        s=(LinearLayout)findViewById(R.id.ship);
        mp=MediaPlayer.create(this,R.raw.press);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Art.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fdrawing%2Fbanana.mp4?alt=media&token=723f3e0a-33b3-43ac-897f-821d15522f8e");
                startActivity(intent);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Art.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fdrawing%2Fcarrot.mp4?alt=media&token=ce39fd07-36b2-421e-b3e2-23312233f44e");
                startActivity(intent);
            }
        });

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Art.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fdrawing%2Fhouse1.mp4?alt=media&token=35621bea-9241-466d-8ba8-ef2df957870e");
                startActivity(intent);
            }
        });


        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Art.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fdrawing%2Fhouse2.mp4?alt=media&token=febee5d5-24ab-4a29-93ec-efc3e2fc74fc");
                startActivity(intent);
            }
        });


        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Art.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fdrawing%2Fpencil1.mp4?alt=media&token=4841d956-8dfe-447a-bfdb-420a55a0d546");
                startActivity(intent);
            }
        });


        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Art.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fdrawing%2Fpencil2.mp4?alt=media&token=024603a5-e505-45a9-982f-c16f0f805321");
                startActivity(intent);
            }
        });


        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Art.this, VideoActivity.class);
                //intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/Addition.mp4?alt=media&token=80775bc5-2c33-42c7-a3d0-e82025dbdeea\n");
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2Fdrawing%2Fship.mp4?alt=media&token=638f56ae-246c-42be-be4c-9b211bbc1feb");
                startActivity(intent);
            }
        });


    }
}
