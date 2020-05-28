package com.example.kidslearning.oneyear;

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

public class QuizOneTwo extends AppCompatActivity implements View.OnClickListener {
    TextView alphabet;
    ImageView img1,img2,img3;
    View toastlayout;
    int counter=1,score;
    MediaPlayer mediaPlayer,mp;
    LayoutInflater layoutInflater;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one_two);
        img1=(ImageView)findViewById(R.id.qotimg1);
        img2=(ImageView)findViewById(R.id.qotimg2);
        mediaPlayer=MediaPlayer.create(this,R.raw.welldone);
        vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        img3=(ImageView)findViewById(R.id.qotimg3);
        alphabet=(TextView)findViewById(R.id.tvqot);
        mp=MediaPlayer.create(this,R.raw.wrong);
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
                alphabet.setText("Tap on two apples");
                img1.setImageResource(R.drawable.five);
                mediaPlayer.start();
                img2.setImageResource(R.drawable.seven);
                img3.setImageResource(R.drawable.two);
                counter++;
            } else if (v == img3) {mp.start();
                customToastClick(v);
            }
        } else if (counter == 2) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {mp.start();
                customToastClick(v);
            } else if (v == img3) {
                alphabet.setText("Tap on three apples");
                img1.setImageResource(R.drawable.three);
                img2.setImageResource(R.drawable.seven);
                img3.setImageResource(R.drawable.four);
                mediaPlayer.start();
                counter++;
            }
        } else if (counter == 3) {
            if (v == img1) {
                alphabet.setText("Tap on four apples");
                img1.setImageResource(R.drawable.one);
                img2.setImageResource(R.drawable.eight);
                mediaPlayer.start();
                img3.setImageResource(R.drawable.four);
                counter++;
            } else if (v == img2) {mp.start();
                customToastClick(v);
            } else if (v == img3) {mp.start();
                customToastClick(v);
            }
        } else if (counter == 4) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {mp.start();
                customToastClick(v);

            } else if (v == img3) {
                alphabet.setText("Tap on five apples");
                img1.setImageResource(R.drawable.two);
                img2.setImageResource(R.drawable.five);
                mediaPlayer.start();
                img3.setImageResource(R.drawable.three);
                counter++;
            }
        } else if (counter == 5) {
            if (v == img1) {
                mp.start();
                customToastClick(v);
            } else if (v == img2) {
                alphabet.setText("Tap on six apples");
                img1.setImageResource(R.drawable.six);
                img2.setImageResource(R.drawable.nine);
                mediaPlayer.start();
                img3.setImageResource(R.drawable.one);
                counter++;
            } else if (v == img3) {
                mp.start();
                customToastClick(v);
            }
        } else if (counter == 6) {
            if (v == img1) {
                alphabet.setText("Tap on seven apples");
                img1.setImageResource(R.drawable.ten);
                mediaPlayer.start();
                img2.setImageResource(R.drawable.four);
                img3.setImageResource(R.drawable.seven);
                counter++;
            } else if (v == img2) {
                mp.start();
                customToastClick(v);
            } else if (v == img3) {
                mp.start();
                customToastClick(v);
            }
        } else if (counter == 7) {
            if (v == img1) {
                mp.start();
                customToastClick(v);
            } else if (v == img2) {
                mp.start();
                customToastClick(v);
            } else if (v == img3) {
                alphabet.setText("Tap on eight apples");
                img1.setImageResource(R.drawable.two);
                mediaPlayer.start();
                img2.setImageResource(R.drawable.eight);
                img3.setImageResource(R.drawable.three);
                counter++;

            }
        } else if (counter == 8) {
            if (v == img1) {
                mp.start();
                customToastClick(v);
            } else if (v == img2) {
                alphabet.setText("Tap on nine apples");
                mediaPlayer.start();
                img1.setImageResource(R.drawable.nine);
                img2.setImageResource(R.drawable.seven);
                img3.setImageResource(R.drawable.four);
                counter++;

            } else if (v == img3) {
                mp.start();
                customToastClick(v);
            }
        } else if (counter == 9) {
            if (v == img1) {
                alphabet.setText("Tap on ten apples");
                img1.setImageResource(R.drawable.ten);
                mediaPlayer.start();
                img2.setImageResource(R.drawable.two);
                img3.setImageResource(R.drawable.seven);
                counter++;
            } else if (v == img2) {
                mp.start();
                customToastClick(v);
            } else if (v == img3) {
                mp.start();
                customToastClick(v);
            }
        } else if (counter == 10) {
            if (v == img1) {
                score=100;
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
