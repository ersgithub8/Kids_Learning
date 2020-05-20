package com.example.kidslearning.fiveyears;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.media.RemoteController;
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

public class QuizMaths extends AppCompatActivity implements View.OnClickListener {
    TextView alphabet,img1,img2,img3;
    View toastlayout;
    int counter=1,score;
    LayoutInflater layoutInflater;
    Vibrator vibrator;
    MediaPlayer mediaPlayer,mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_maths);
        img1=(TextView) findViewById(R.id.qmimg1);
        img2=(TextView)findViewById(R.id.qmimg2);
        mediaPlayer=MediaPlayer.create(this,R.raw.welldone);
        vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        img3=(TextView) findViewById(R.id.qmimg3);
        alphabet=(TextView)findViewById(R.id.tvqm);
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
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {
                alphabet.setText("4x2");
                mediaPlayer.start();
                img1.setText("5");
                img2.setText("9");
                img3.setText("8");
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
                alphabet.setText("8-1");
                mediaPlayer.start();
                img1.setText("7");
                img2.setText("9");
                img3.setText("5");
                counter++;
            }
        } else if (counter == 3) {
            if (v == img1) {
                alphabet.setText("10÷5");
                img1.setText("7");
                img2.setText("4");
                mediaPlayer.start();
                img3.setText("2");
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
                alphabet.setText("8+1");
                mediaPlayer.start();
                img1.setText("3");
                img2.setText("9");
                img3.setText("2");
                counter++;
            }
        } else if (counter == 5) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {
                alphabet.setText("5x3");
                mediaPlayer.start();
                img1.setText("15");
                img2.setText("12");
                img3.setText("31");
                counter++;
            } else if (v == img3) {mp.start();
                customToastClick(v);
            }
        } else if (counter == 6) {
            if (v == img1) {
                alphabet.setText("19-12");
                mediaPlayer.start();
                img1.setText("12");
                img2.setText("1");
                img3.setText("7");
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
                alphabet.setText("12÷6");
                img1.setText("4");
                mediaPlayer.start();
                img2.setText("2");
                img3.setText("7");
                counter++;

            }
        } else if (counter == 8) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {
                alphabet.setText("5+4");
                img1.setText("9");
                img2.setText("7");
                mediaPlayer.start();
                img3.setText("54");
                counter++;

            } else if (v == img3) {
                mp.start();
                customToastClick(v);
            }
        } else if (counter == 9) {
            if (v == img1) {
                alphabet.setText("12x2");
                img1.setText("24");
                img2.setText("12");
                mediaPlayer.start();
                img3.setText("112");
                counter++;
            } else if (v == img2) {mp.start();
                customToastClick(v);
            } else if (v == img3) {
                customToastClick(v);
            }
        } else if (counter == 10) {mp.start();
            if (v == img1) {
                score=100;
                Savedata();
                startActivity(new Intent(this, QuizComplete.class));
                finish();
            } else if (v == img2) {mp.start();
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
        toast.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        },500);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {
            vibrator.vibrate(VibrationEffect.createOneShot(100,VibrationEffect.DEFAULT_AMPLITUDE));
        }else{
            vibrator.vibrate(100);
        }

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
