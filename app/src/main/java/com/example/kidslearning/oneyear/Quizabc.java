package com.example.kidslearning.oneyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kidslearning.QuizComplete;
import com.example.kidslearning.R;

import java.awt.font.TextAttribute;

public class Quizabc extends AppCompatActivity implements View.OnClickListener {
    TextView alphabet;
    ImageView img1,img2,img3;
    int counter=1,score;
    View toastlayout;
    MediaPlayer mediaPlayer,mp;
    LayoutInflater layoutInflater;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizabc);
    alphabet=(TextView)findViewById(R.id.tvqa);
    mediaPlayer=MediaPlayer.create(this,R.raw.welldone);
    img1=(ImageView)findViewById(R.id.qabcimg1);
    img2=(ImageView)findViewById(R.id.qabcimg2);
    img3=(ImageView)findViewById(R.id.qabcimg3);
    vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
    mp=MediaPlayer.create(this,R.raw.wrong);
    img1.setOnClickListener(this);
    img2.setOnClickListener(this);
    img3.setOnClickListener(this);
    layoutInflater=getLayoutInflater();
    toastlayout=layoutInflater.inflate(R.layout.toastres,(ViewGroup)findViewById(R.id.toastlayout));
    }

    @Override
    public void onClick(View v) {
    if(counter==1){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            alphabet.setText("B");
            img1.setImageResource(R.drawable.hat);
            img2.setImageResource(R.drawable.cat);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.ball);
            counter++;
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==2){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            alphabet.setText("C");
            img1.setImageResource(R.drawable.cat);
            mediaPlayer.start();
            img2.setImageResource(R.drawable.dog);
            img3.setImageResource(R.drawable.quail);
            counter++;
        }
    }else if(counter==3){
        if (v==img1){
            alphabet.setText("D");
            img1.setImageResource(R.drawable.zebra);
            mediaPlayer.start();
            img2.setImageResource(R.drawable.sun);
            img3.setImageResource(R.drawable.dog);
            counter++;
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==4){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            mp.start();
            customToastClick(v);

        }else if (v==img3){
            alphabet.setText("E");
            img1.setImageResource(R.drawable.yellow);
            img2.setImageResource(R.drawable.egg);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.rat);
            counter++;
        }
        }else if(counter==5){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            alphabet.setText("F");
            img1.setImageResource(R.drawable.fish);
            img2.setImageResource(R.drawable.goat);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.ball);
            counter++;
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==6){
        if (v==img1){
            alphabet.setText("G");
            img1.setImageResource(R.drawable.jar);
            mediaPlayer.start();
            img2.setImageResource(R.drawable.ink);
            img3.setImageResource(R.drawable.goat);
            counter++;
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==7){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            alphabet.setText("H");
            img1.setImageResource(R.drawable.nose);
            img2.setImageResource(R.drawable.hat);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.monkey);
            counter++;

        }
    }else if(counter==8){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            alphabet.setText("I");
            img1.setImageResource(R.drawable.ink);
            img2.setImageResource(R.drawable.ball);
            img3.setImageResource(R.drawable.egg);
            mediaPlayer.start();
            counter++;

        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==9){
        if (v==img1){
            alphabet.setText("J");
            img1.setImageResource(R.drawable.leaf);
            img2.setImageResource(R.drawable.violin);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.jar);
            counter++;
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==10){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            alphabet.setText("K");
            img1.setImageResource(R.drawable.apple);
            img2.setImageResource(R.drawable.kite);
            img3.setImageResource(R.drawable.quail);
            mediaPlayer.start();
            counter++;

        }
    }else if(counter==11){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            alphabet.setText("L");
            img1.setImageResource(R.drawable.fox);
            img2.setImageResource(R.drawable.leaf);
            img3.setImageResource(R.drawable.dog);
            mediaPlayer.start();
            counter++;
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==12){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            alphabet.setText("M");
            img1.setImageResource(R.drawable.leaf);
            img2.setImageResource(R.drawable.monkey);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.jar);
            counter++;
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==13){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            alphabet.setText("N");
            img1.setImageResource(R.drawable.nose);
            mediaPlayer.start();
            img2.setImageResource(R.drawable.tap);
            img3.setImageResource(R.drawable.sun);
            counter++;
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==14){
        if (v==img1){
            alphabet.setText("O");
            img1.setImageResource(R.drawable.goat);
            img2.setImageResource(R.drawable.ocean);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.water);
            counter++;
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==15){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            alphabet.setText("P");
            img1.setImageResource(R.drawable.parrot);
            img2.setImageResource(R.drawable.leaf);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.jar);
            counter++;
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==16){
        if (v==img1){
            alphabet.setText("Q");
            img1.setImageResource(R.drawable.quail);
            img2.setImageResource(R.drawable.zebra);
            img3.setImageResource(R.drawable.parrot);
            mediaPlayer.start();
            counter++;
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==17){
        if (v==img1){
            alphabet.setText("R");
            img1.setImageResource(R.drawable.hat);
            mediaPlayer.start();
            img2.setImageResource(R.drawable.water);
            img3.setImageResource(R.drawable.rat);
            counter++;
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==18){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            alphabet.setText("S");
            img1.setImageResource(R.drawable.goat);
            img2.setImageResource(R.drawable.sun);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.parrot);
            counter++;
        }
    }else if(counter==19){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            alphabet.setText("T");
            img1.setImageResource(R.drawable.tap);
            img2.setImageResource(R.drawable.ink);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.apple);
            counter++;
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==20){
        if (v==img1){
            alphabet.setText("U");
            img1.setImageResource(R.drawable.ball);
            img2.setImageResource(R.drawable.umbrella);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.zebra);
            counter++;
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==21){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            alphabet.setText("V");
            img1.setImageResource(R.drawable.violin);
            img2.setImageResource(R.drawable.parrot);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.rat);
            counter++;
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==22){
        if (v==img1){
            alphabet.setText("W");
            img1.setImageResource(R.drawable.egg);
            img2.setImageResource(R.drawable.water);
            mediaPlayer.start();
            img3.setImageResource(R.drawable.cat);
            counter++;
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==23){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            alphabet.setText("X");
            img1.setImageResource(R.drawable.fox);
            mediaPlayer.start();
            img2.setImageResource(R.drawable.hat);
            img3.setImageResource(R.drawable.jar);
            counter++;
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==24){
        if (v==img1){
            alphabet.setText("Y");
            img1.setImageResource(R.drawable.violin);
            img2.setImageResource(R.drawable.yellow);
            img3.setImageResource(R.drawable.dog);
            mediaPlayer.start();
            counter++;
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==25){
        if (v==img1){
            mp.start();
            customToastClick(v);
        }else if(v==img2){
            alphabet.setText("Z");
            img1.setImageResource(R.drawable.zebra);
            img2.setImageResource(R.drawable.tap);
            img3.setImageResource(R.drawable.parrot);
            mediaPlayer.start();
            counter++;
        }else if (v==img3){
            mp.start();
            customToastClick(v);
        }
    }else if(counter==26){
        if (v==img1){
            score=260;
            Savedata();
            startActivity(new Intent(this, QuizComplete.class));
            finish();
        }else if(v==img2){
            mp.start();
            customToastClick(v);
        }else if (v==img3){
            mp.start();

            customToastClick(v);
        }
    }

    }
    public void customToastClick(View v){
        	        final Toast toast = Toast.makeText(this,"Toast:Gravity.TOP",Toast.LENGTH_SHORT);
        	        toast.setGravity(Gravity.CENTER,0,0);
        	        toast.setView(toastlayout);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {
            vibrator.vibrate(VibrationEffect.createOneShot(100,VibrationEffect.DEFAULT_AMPLITUDE));
        }else{
            vibrator.vibrate(100);
        }
        	        toast.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        },500);
    }
    public  void Savedata(){
        SharedPreferences sharedPreferences=getSharedPreferences("savescore",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        int totalscore=(loadData()+score);
        editor.putInt("scoreValue",totalscore);
        editor.apply();
    }

    public int loadData(){
        SharedPreferences sharedPreferences=getSharedPreferences("savescore",MODE_PRIVATE);
        return  sharedPreferences.getInt("scoreValue",MODE_PRIVATE);

    }
}
