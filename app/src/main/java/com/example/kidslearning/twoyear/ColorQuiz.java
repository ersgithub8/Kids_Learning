package com.example.kidslearning.twoyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kidslearning.Dashboard;
import com.example.kidslearning.QuizComplete;
import com.example.kidslearning.R;

public class ColorQuiz extends AppCompatActivity implements View.OnClickListener {
    TextView alphabet;
    ImageView img1,img2,img3;
    View toastlayout;
    int counter=1;
    int score=0;
    MediaPlayer mediaPlayer,mp;
    LayoutInflater layoutInflater;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_quiz);
        img1=(ImageView)findViewById(R.id.coimg1);
        img2=(ImageView)findViewById(R.id.coimg2);
        mediaPlayer=MediaPlayer.create(this,R.raw.welldone);
        vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        img3=(ImageView)findViewById(R.id.coimg3);
        alphabet=(TextView)findViewById(R.id.tvco);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        layoutInflater=getLayoutInflater();
        toastlayout=layoutInflater.inflate(R.layout.toastres,(ViewGroup)findViewById(R.id.toastlayout));
        mp=MediaPlayer.create(this,R.raw.wrong);
    }

    @Override
    public void onClick(View v) {
        if (counter == 1) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {
                alphabet.setText("Which color is red?");
                img1.setImageResource(R.drawable.pink);
                img2.setImageResource(R.drawable.blue);
                img3.setImageResource(R.drawable.red);

                mediaPlayer.start();
                counter++;
            } else if (v == img3) {mp.start();
                customToastClick(v);
            }
        } else if (counter == 2) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {
                customToastClick(v);
                mp.start();
            } else if (v == img3) {
                alphabet.setText("Which color is Pink?");
                img1.setImageResource(R.drawable.pink);
                img2.setImageResource(R.drawable.orange);
                img3.setImageResource(R.drawable.blue);
                mediaPlayer.start();
                counter++;
            }
        } else if (counter == 3) {
            if (v == img1) {
                alphabet.setText("Which color is orange?");
                img1.setImageResource(R.drawable.yellow1);
                img2.setImageResource(R.drawable.red);
                img3.setImageResource(R.drawable.orange);
                mediaPlayer.start();
                counter++;
            } else if (v == img2) {mp.start();
                customToastClick(v);
            } else if (v == img3) {mp.start();
                customToastClick(v);
            }
        } else if (counter == 4) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {
                customToastClick(v);
                mp.start();
            } else if (v == img3) {
                alphabet.setText("Which color is blue?");
                img1.setImageResource(R.drawable.orange);
                img2.setImageResource(R.drawable.blue);
                mediaPlayer.start();
                img3.setImageResource(R.drawable.red);
                counter++;
            }
        } else if (counter == 5) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {
               score=50;
               Savedata();
                //new Dashboard().textView.setText(loadData()+"");
                //Toast.makeText(this,loadData()+"",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, QuizComplete.class));
                finish();
                counter++;
            } else if (v == img3) {mp.start();
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
