package com.example.kidslearning.oneyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.kidslearning.R;
import com.example.kidslearning.VideoActivity;

public class Alphabets extends AppCompatActivity {
    LinearLayout a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,z;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);


        a=(LinearLayout)findViewById(R.id.a);
        b=(LinearLayout)findViewById(R.id.b);
        c=(LinearLayout)findViewById(R.id.c);
        d=(LinearLayout)findViewById(R.id.d);
        e=(LinearLayout)findViewById(R.id.e);
        f=(LinearLayout)findViewById(R.id.f);
        g=(LinearLayout)findViewById(R.id.g);
        h=(LinearLayout)findViewById(R.id.h);
        i=(LinearLayout)findViewById(R.id.i);
        j=(LinearLayout)findViewById(R.id.j);
        k=(LinearLayout)findViewById(R.id.k);
        l=(LinearLayout)findViewById(R.id.l);
        m=(LinearLayout)findViewById(R.id.m);
        n=(LinearLayout)findViewById(R.id.n);
        o=(LinearLayout)findViewById(R.id.o);
        p=(LinearLayout)findViewById(R.id.p);
        q=(LinearLayout)findViewById(R.id.q);
        r=(LinearLayout)findViewById(R.id.r);
        s=(LinearLayout)findViewById(R.id.s);
        t=(LinearLayout)findViewById(R.id.t);
        u=(LinearLayout)findViewById(R.id.u);
        v=(LinearLayout)findViewById(R.id.v);
        w=(LinearLayout)findViewById(R.id.w);
        x=(LinearLayout)findViewById(R.id.x);
        z=(LinearLayout)findViewById(R.id.z);

        mp=MediaPlayer.create(this,R.raw.press);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FA.mp4?alt=media&token=f37e9af7-d373-4229-a80d-4244b2bdfee1");
                startActivity(intent);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FB.mp4?alt=media&token=da13f5ac-b0d9-4dd0-9539-51235cc6c160");
                startActivity(intent);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FC.mp4?alt=media&token=17536c81-2afd-41d9-9025-9a95554feeb9");
                startActivity(intent);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FD.mp4?alt=media&token=7619bb24-210c-49bd-b16e-d75060141b42");
                startActivity(intent);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FE.mp4?alt=media&token=7b7733d0-c875-47c3-8237-933dc3992ad5");
                startActivity(intent);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FF.mp4?alt=media&token=6b2cfc56-b124-4365-b091-99f180faafb1");
                startActivity(intent);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FG.mp4?alt=media&token=18323cf6-8d6f-42c9-bee2-b4ff8900deff");
                startActivity(intent);
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FH.mp4?alt=media&token=6131678f-2291-4bcc-975f-e740da6a3444");
                startActivity(intent);
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FI.mp4?alt=media&token=39997e90-57c3-4071-8606-5a7ad3b2be36");
                startActivity(intent);
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FJ.mp4?alt=media&token=198864f5-0f15-432e-89c0-c80076959d4e");
                startActivity(intent);
            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FK.mp4?alt=media&token=fe0fa6b9-0bb2-44ad-950e-b6f3b85e825a");
                startActivity(intent);
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FL.mp4?alt=media&token=1c20e4b5-300d-4271-97e4-5a5b47894f6d");
                startActivity(intent);
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FM.mp4?alt=media&token=a3fa2cab-5308-4da2-aace-6ba8b7658ed3");
                startActivity(intent);
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FN.mp4?alt=media&token=726fec43-8ae4-4db8-a813-4212a60919c0");
                startActivity(intent);
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FO.mp4?alt=media&token=f1bd4cf9-e442-4c21-88c2-83e2eb8167cb");
                startActivity(intent);
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FP.mp4?alt=media&token=7b3d8928-b0c3-4cd2-a7f6-e43d16ee2a8b");
                startActivity(intent);
            }
        });

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FQ.mp4?alt=media&token=0ae4c838-6f69-4178-bd46-510238e5a01b");
                startActivity(intent);
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FR.mp4?alt=media&token=b1e0ca80-ede4-469c-bd8b-b5dcc820db52");
                startActivity(intent);
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FS.mp4?alt=media&token=01a84a81-3f97-4b54-bfbc-91f689d9627f");
                startActivity(intent);
            }
        });

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FT.mp4?alt=media&token=48247350-eff3-42bc-b067-f49b157ad697");
                startActivity(intent);
            }
        });

        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FU.mp4?alt=media&token=0bd09fac-56af-43ff-b5e9-613a233fdc32");
                startActivity(intent);
            }
        });

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FV.mp4?alt=media&token=f8f45065-ec5c-4780-a3fe-5dbabb93d374");
                startActivity(intent);
            }
        });

        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FW.mp4?alt=media&token=bfebdf0e-3812-40f3-b860-d46c89f9a823");
                startActivity(intent);
            }
        });

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FX.mp4?alt=media&token=6e8888e5-3055-4a79-8991-c46277aff1d0");
                startActivity(intent);
            }
        });

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(Alphabets.this, VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/new-apps-69.appspot.com/o/kids%20learning%20new%20videos%2FAlphabets%2FZ.mp4?alt=media&token=954aa691-f84c-48bd-9e27-33ae492fa7cd");
                startActivity(intent);
            }
        });


    }
}
