package com.example.kidslearning.fiveyears;

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

import androidx.appcompat.app.AppCompatActivity;

import com.example.kidslearning.QuizComplete;
import com.example.kidslearning.R;

public class MonthOfYearQuiz extends AppCompatActivity implements View.OnClickListener {
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
        setContentView(R.layout.activity_month_of_year_quiz);
        img1=(ImageView)findViewById(R.id.icon1);
        img2=(ImageView)findViewById(R.id.icon2);
        mediaPlayer=MediaPlayer.create(this,R.raw.welldone);
        vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        img3=(ImageView)findViewById(R.id.icon3);
        alphabet=(TextView)findViewById(R.id.textw);
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
                alphabet.setText("Which Month have 28 days?");
                img1.setImageResource(R.drawable.apr);

                mediaPlayer.start();

                img2.setImageResource(R.drawable.jun);
                img3.setImageResource(R.drawable.feb);
                counter++;
            } else if (v == img3) {
                mp.start();
                customToastClick(v);
            }
        } else if (counter == 2) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {mp.start();
                customToastClick(v);
            } else if (v == img3) {
                alphabet.setText("Which Month comes at 3rd?");
                img1.setImageResource(R.drawable.mar);
                mediaPlayer.start();
                img2.setImageResource(R.drawable.nov);
                img3.setImageResource(R.drawable.sep);
                counter++;
            }
        } else if (counter == 3) {
            if (v == img1) {
                alphabet.setText("Which month have Independence day?");
                img1.setImageResource(R.drawable.jan);
                img2.setImageResource(R.drawable.may);
                img3.setImageResource(R.drawable.aug);
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
            } else if (v == img2) {mp.start();
                customToastClick(v);

            } else if (v == img3) {
                alphabet.setText("Which month Comes in Winter");
                mediaPlayer.start();
                img1.setImageResource(R.drawable.jun);
                img2.setImageResource(R.drawable.dec);
                img3.setImageResource(R.drawable.jul);
                counter++;
            }
        } else if (counter == 5) {
            if (v == img1) {mp.start();
                customToastClick(v);
            } else if (v == img2) {
                alphabet.setText("Which month have birthday of Quid e Azam");
                img1.setImageResource(R.drawable.dec);
                mediaPlayer.start();
                img2.setImageResource(R.drawable.oct);
                img3.setImageResource(R.drawable.feb);
                counter++;
            } else if (v == img3) {mp.start();
                customToastClick(v);
            }
        } else if (counter == 6) {
            if (v == img1) {
                score=60;
                Savedata();
                startActivity(new Intent(this, QuizComplete.class));
                finish();
            } else if (v == img2) {mp.start();
                customToastClick(v);
            } else if (v == img3) {mp.start();
                customToastClick(v);
            }
        }

    }

    public void customToastClick(View v){
        final Toast  toast = Toast.makeText(this,"Toast:Gravity.TOP",Toast.LENGTH_SHORT);
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
