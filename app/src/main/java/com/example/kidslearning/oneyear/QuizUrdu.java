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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kidslearning.QuizComplete;
import com.example.kidslearning.R;

public class QuizUrdu extends AppCompatActivity implements View.OnClickListener {
    TextView alphabet;
    ImageView img1,img2,img3;
    View toastlayout;
    int counter=1,score;
    LayoutInflater layoutInflater;
    Vibrator vibrator;
    MediaPlayer mediaPlayer,mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_urdu);
    img1=(ImageView)findViewById(R.id.qurimg1);
        img2=(ImageView)findViewById(R.id.qurimg2);
        mediaPlayer =MediaPlayer.create(this,R.raw.welldone);
        vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        img3=(ImageView)findViewById(R.id.qurimg3);
        alphabet=(TextView)findViewById(R.id.tvqu);
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
                    alphabet.setText("ب");
                    img1.setImageResource(R.drawable.appleee);
                    img2.setImageResource(R.drawable.fish);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.cat);
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
                    alphabet.setText("پ");
                    mediaPlayer.start();
                    img1.setImageResource(R.drawable.kitee);
                    img2.setImageResource(R.drawable.dog);
                    img3.setImageResource(R.drawable.quail);
                    counter++;
                }
            } else if (counter == 3) {
                if (v == img1) {
                    alphabet.setText("ت");
                    img1.setImageResource(R.drawable.zebra);
                    img2.setImageResource(R.drawable.sun);
                    img3.setImageResource(R.drawable.tarboz);
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
                    customToastClick(v);
                } else if (v == img2) {
                    customToastClick(v);

                } else if (v == img3) {
                    alphabet.setText("ٹ");
                    img1.setImageResource(R.drawable.yellow);
                    mediaPlayer.start();
                    img2.setImageResource(R.drawable.tokri);
                    img3.setImageResource(R.drawable.ratt);
                    counter++;
                }
            } else if (counter == 5) {
                if (v == img1) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("ث");
                    img1.setImageResource(R.drawable.samar);
                    mediaPlayer.start();
                    img2.setImageResource(R.drawable.goat);
                    img3.setImageResource(R.drawable.ball);
                    counter++;
                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 6) {
                if (v == img1) {
                    alphabet.setText("ج");
                    img1.setImageResource(R.drawable.jar);
                    mediaPlayer.start();
                    img2.setImageResource(R.drawable.ink);
                    img3.setImageResource(R.drawable.jangle);
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
                } else if (v == img2) {mp.start();
                    customToastClick(v);
                } else if (v == img3) {
                    alphabet.setText("چ");
                    img1.setImageResource(R.drawable.nose);
                    mediaPlayer.start();
                    img2.setImageResource(R.drawable.chand);
                    img3.setImageResource(R.drawable.raja);
                    counter++;

                }
            } else if (counter == 8) {
                if (v == img1) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("ح");
                    img1.setImageResource(R.drawable.haji);
                    mediaPlayer.start();
                    img2.setImageResource(R.drawable.ball);
                    img3.setImageResource(R.drawable.egg);
                    counter++;

                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 9) {
                if (v == img1) {
                    alphabet.setText("خ");
                    img1.setImageResource(R.drawable.leaf);
                    img2.setImageResource(R.drawable.violin);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.khargosh);
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
                    mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img3) {
                    alphabet.setText("د");
                    img1.setImageResource(R.drawable.appleee);
                    mediaPlayer.start();
                    img2.setImageResource(R.drawable.dodh);
                    img3.setImageResource(R.drawable.quail);
                    counter++;

                }
            } else if (counter == 11) {
                if (v == img1) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("ڈ");
                    img1.setImageResource(R.drawable.fox);
                    mediaPlayer.start();
                    img2.setImageResource(R.drawable.dhol);
                    img3.setImageResource(R.drawable.dog);
                    counter++;
                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 12) {
                if (v == img1) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("ذ");
                    img1.setImageResource(R.drawable.leaf);
                    img2.setImageResource(R.drawable.zarra);
                    img3.setImageResource(R.drawable.jar);
                    mediaPlayer.start();
                    counter++;
                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 13) {
                if (v == img1) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("ر");
                    img1.setImageResource(R.drawable.raja);
                    img2.setImageResource(R.drawable.tap);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.sun);
                    counter++;
                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 14) {
                if (v == img1) {
                    alphabet.setText("ڑ");
                    img1.setImageResource(R.drawable.goat);
                    img2.setImageResource(R.drawable.pahar);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.waterr);
                    counter++;
                } else if (v == img2) {mp.start();
                    customToastClick(v);
                } else if (v == img3) {mp.start();
                    customToastClick(v);
                }
            } else if (counter == 15) {
                if (v == img1) {mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("ز");
                    img1.setImageResource(R.drawable.zebra);
                    img2.setImageResource(R.drawable.leaf);
                    img3.setImageResource(R.drawable.jar);
                    mediaPlayer.start();
                    counter++;
                } else if (v == img3) {mp.start();
                    customToastClick(v);
                }
            } else if (counter == 16) {
                if (v == img1) {
                    alphabet.setText("ژ");
                    img1.setImageResource(R.drawable.azdaha);
                    mediaPlayer.start();
                    img2.setImageResource(R.drawable.zebraa);
                    img3.setImageResource(R.drawable.parrot);
                    counter++;
                } else if (v == img2) {mp.start();
                    customToastClick(v);
                } else if (v == img3) {mp.start();
                    customToastClick(v);
                }
            } else if (counter == 17) {
                if (v == img1) {
                    alphabet.setText("س");
                    img1.setImageResource(R.drawable.hat);
                    img2.setImageResource(R.drawable.waterr);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.cycle);
                    counter++;
                } else if (v == img2) {mp.start();
                    customToastClick(v);
                } else if (v == img3) {mp.start();
                    customToastClick(v);
                }
            } else if (counter == 18) {
                if (v == img1) {mp.start();
                    customToastClick(v);
                } else if (v == img2) {mp.start();
                    customToastClick(v);
                } else if (v == img3) {
                    alphabet.setText("ش");
                    img1.setImageResource(R.drawable.goat);
                    img2.setImageResource(R.drawable.sehad);
                    img3.setImageResource(R.drawable.parrot);
                    mediaPlayer.start();
                    counter++;
                }
            } else if (counter == 19) {
                if (v == img1) {mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("ص");
                    img1.setImageResource(R.drawable.saban);
                    img2.setImageResource(R.drawable.ink);
                    img3.setImageResource(R.drawable.appleee);
                    mediaPlayer.start();
                    counter++;
                } else if (v == img3) {mp.start();
                    customToastClick(v);
                }
            } else if (counter == 20) {
                if (v == img1) {
                    alphabet.setText("ض");
                    img1.setImageResource(R.drawable.ball);
                    img2.setImageResource(R.drawable.zaief);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.zebra);
                    counter++;
                } else if (v == img2) {mp.start();
                    customToastClick(v);
                } else if (v == img3) {mp.start();
                    customToastClick(v);
                }
            } else if (counter == 21) {
                if (v == img1) {mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("ط");
                    img1.setImageResource(R.drawable.tota);
                    img2.setImageResource(R.drawable.zaief);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.ratt);
                    counter++;
                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 22) {
                if (v == img1) {
                    alphabet.setText("ظ");
                    img1.setImageResource(R.drawable.egg);
                    img2.setImageResource(R.drawable.zaroof2);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.cat);
                    counter++;
                } else if (v == img2) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 23) {
                if (v == img1) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("ع");
                    img1.setImageResource(R.drawable.aynak);
                    img2.setImageResource(R.drawable.hat);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.jar);
                    counter++;
                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 24) {
                if (v == img1) {
                    alphabet.setText("غ");
                    img1.setImageResource(R.drawable.violin);
                    img2.setImageResource(R.drawable.ghobara);
                    img3.setImageResource(R.drawable.dog);
                    mediaPlayer.start();
                    counter++;
                } else if (v == img2) {mp.start();
                    customToastClick(v);
                } else if (v == img3) {mp.start();
                    customToastClick(v);
                }
            } else if (counter == 25) {
                if (v == img1) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("ف");
                    img1.setImageResource(R.drawable.zebra);
                    img2.setImageResource(R.drawable.fakhta);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.parrot);
                    counter++;
                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 26) {
                if (v == img1) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("ق");
                    img1.setImageResource(R.drawable.hat);
                    img2.setImageResource(R.drawable.cat);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.kenchi);
                    counter++;
                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 27) {
                if (v == img1) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img3) {
                    alphabet.setText("ک");
                    img1.setImageResource(R.drawable.kela);
                    img2.setImageResource(R.drawable.dog);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.quail);
                    counter++;
                }
            } else if (counter == 28) {
                if (v == img1) {
                    alphabet.setText("گ");
                    img1.setImageResource(R.drawable.zebra);
                    mediaPlayer.start();
                    img2.setImageResource(R.drawable.sun);
                    img3.setImageResource(R.drawable.gurya);
                    counter++;
                } else if (v == img2) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 29) {
                if (v == img1) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    mp.start();
                    customToastClick(v);

                } else if (v == img3) {
                    alphabet.setText("ل");
                    img1.setImageResource(R.drawable.yellow);
                    img2.setImageResource(R.drawable.larka);
                    img3.setImageResource(R.drawable.ratt);
                    mediaPlayer.start();
                    counter++;
                }
            } else if (counter == 30) {
                if (v == img1) {
                    mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("م");
                    img1.setImageResource(R.drawable.machli);
                    img2.setImageResource(R.drawable.goat);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.ball);
                    counter++;
                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 31) {
                if (v == img1) {
                    alphabet.setText("ن");
                    img1.setImageResource(R.drawable.jar);
                    mediaPlayer.start();
                    img2.setImageResource(R.drawable.ink);
                    img3.setImageResource(R.drawable.nariyal);
                    counter++;
                } else if (v == img2) {mp.start();
                    customToastClick(v);
                } else if (v == img3) {mp.start();
                    customToastClick(v);
                }
            } else if (counter == 32) {
                if (v == img1) {mp.start();
                    customToastClick(v);
                } else if (v == img2) {mp.start();
                    customToastClick(v);
                } else if (v == img3) {
                    alphabet.setText("و");
                    img1.setImageResource(R.drawable.nose);
                    img2.setImageResource(R.drawable.vegan);
                    img3.setImageResource(R.drawable.monkey);
                    mediaPlayer.start();
                    counter++;

                }
            } else if (counter == 33) {
                if (v == img1) {mp.start();
                    customToastClick(v);
                } else if (v == img2) {
                    alphabet.setText("ہ");
                    img1.setImageResource(R.drawable.hathi);
                    mediaPlayer.start();
                    img2.setImageResource(R.drawable.ball);
                    img3.setImageResource(R.drawable.egg);
                    counter++;

                } else if (v == img3) {mp.start();
                    customToastClick(v);
                }
            } else if (counter == 34) {
                if (v == img1) {
                    alphabet.setText("ی");
                    img1.setImageResource(R.drawable.leaf);
                    img2.setImageResource(R.drawable.violin);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.yakhni);
                    counter++;
                } else if (v == img2) {
                    mp.start();

                    customToastClick(v);
                } else if (v == img3) {
                    mp.start();
                    customToastClick(v);
                }
            } else if (counter == 35) {
                if (v == img1) {mp.start();
                    customToastClick(v);
                } else if (v == img2) {mp.start();
                    customToastClick(v);
                } else if (v == img3) {
                    alphabet.setText("ے");
                    img1.setImageResource(R.drawable.ghory);
                    img2.setImageResource(R.drawable.kite);
                    mediaPlayer.start();
                    img3.setImageResource(R.drawable.quail);
                    counter++;

                }
            }

                else if (counter == 36) {
                if (v == img1) {
                    score=360;
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
