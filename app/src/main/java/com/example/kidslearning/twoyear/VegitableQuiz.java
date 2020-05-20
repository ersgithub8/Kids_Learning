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

import com.example.kidslearning.QuizComplete;
import com.example.kidslearning.R;

public class VegitableQuiz extends AppCompatActivity implements View.OnClickListener {
    TextView alphabet;
    ImageView img1,img2,img3;
    View toastlayout;
    MediaPlayer mediaPlayer,mp;
    int counter=1,score=0;
    LayoutInflater layoutInflater;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegitable_quiz);
        img1=(ImageView)findViewById(R.id.vegimg1);
        img2=(ImageView)findViewById(R.id.vegimg2);
        mediaPlayer=MediaPlayer.create(this,R.raw.welldone);
        mp=MediaPlayer.create(this,R.raw.wrong);
        vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        img3=(ImageView)findViewById(R.id.vegimg3);
        alphabet=(TextView)findViewById(R.id.tvveg);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        layoutInflater=getLayoutInflater();
        toastlayout=layoutInflater.inflate(R.layout.toastres,(ViewGroup)findViewById(R.id.toastlayout));

    }

    @Override
    public void onClick(View v) {
        if (counter == 1) {
            if (v == img1) {
                mp.start();
                customToastClick(v);
            } else if (v == img2) {
                alphabet.setText("Which one is carrot?");
                img1.setImageResource(R.drawable.leek);
                img2.setImageResource(R.drawable.celery);
                img3.setImageResource(R.drawable.carrot);
                mediaPlayer.start();
                counter++;
            } else if (v == img3) {mp.start();
                customToastClick(v);
            }
        } else if (counter == 2) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {
                mp.start();
                customToastClick(v);
            } else if (v == img3) {
                alphabet.setText("Which one is celery?");
                img1.setImageResource(R.drawable.celery);
                img2.setImageResource(R.drawable.potato);
                img3.setImageResource(R.drawable.broccoli);
                mediaPlayer.start();
                counter++;
            }
        } else if (counter == 3) {
            if (v == img1) {
                alphabet.setText("Which one is garlic?");
                img1.setImageResource(R.drawable.leek);
                img2.setImageResource(R.drawable.cabbage);
                img3.setImageResource(R.drawable.garlic);
                mediaPlayer.start();
                counter++;
            } else if (v == img2) {
                mp.start();
                customToastClick(v);
            } else if (v == img3) {
                mp.start();
                customToastClick(v);
            }
        } else if (counter == 4) {
            if (v == img1) {
                mp.start();
                customToastClick(v);
            } else if (v == img2) {
                customToastClick(v);
                mp.start();
            } else if (v == img3) {
                alphabet.setText("Which one is leek?");
                img1.setImageResource(R.drawable.onion);
                img2.setImageResource(R.drawable.leek);
                mediaPlayer.start();

                img3.setImageResource(R.drawable.spinach);
                counter++;
            }
        } else if (counter == 5) {
            if (v == img1) {
                mp.start();
                customToastClick(v);
            } else if (v == img2) {
                alphabet.setText("Which one is onion?");
                img1.setImageResource(R.drawable.onion);
                img2.setImageResource(R.drawable.carrot);
                mediaPlayer.start();

                img3.setImageResource(R.drawable.garlic);
                counter++;
            } else if (v == img3) {
                mp.start();
                customToastClick(v);
            }
        } else if (counter == 6) {
            if (v == img1) {
                alphabet.setText("Which one is potato?");
                img1.setImageResource(R.drawable.garlic);
                img2.setImageResource(R.drawable.carrot);
                mediaPlayer.start();

                img3.setImageResource(R.drawable.potato);
                counter++;
            } else if (v == img2) {
                mp.start();
                customToastClick(v);
            } else if (v == img3) {
                mp.start();
                customToastClick(v);
            }
        } else if (counter == 7) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {
                mp.start();
                customToastClick(v);
            } else if (v == img3) {
                alphabet.setText("Which one is spinach?");
                img1.setImageResource(R.drawable.onion);
                img2.setImageResource(R.drawable.spinach);
                mediaPlayer.start();

                img3.setImageResource(R.drawable.celery);
                counter++;

            }
        } else if (counter == 8) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {
                alphabet.setText("Which one is Cabbage?");
                mediaPlayer.start();

                img1.setImageResource(R.drawable.cabbage);
                img2.setImageResource(R.drawable.celery);
                img3.setImageResource(R.drawable.potato);
                counter++;

            } else if (v == img3) {
                mp.start();
                customToastClick(v);
            }
        } else if (counter == 9) {
            if (v == img1) {
                score=90;
                Savedata();
                startActivity(new Intent(this, QuizComplete.class));
                finish();
            } else if (v == img2) {
                mp.start();
                customToastClick(v);
            } else if (v == img3) {
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
