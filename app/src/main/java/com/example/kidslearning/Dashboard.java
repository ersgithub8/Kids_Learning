package com.example.kidslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kidslearning.years.Fiveyears;
import com.example.kidslearning.years.FourYears;
import com.example.kidslearning.years.ThreeYears;
import com.example.kidslearning.years.Twoyears;
import com.example.kidslearning.years.engalpha;

import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dashboard extends AppCompatActivity {
    LinearLayout b1,b2,b3,b4,b5;
    MediaPlayer mp;
    public Period period;
    public TextView textView,tv3;
    int day,day1,month,month1,year,year1,fd,fm,fy;
    CharSequence s;
    Date ddate,cdate;
    String date,date1;
    String dates[],dates1[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        b1=(LinearLayout)findViewById(R.id.years1);
        b2=(LinearLayout)findViewById(R.id.years2);
        b3=(LinearLayout)findViewById(R.id.years3);
        b4=(LinearLayout)findViewById(R.id.years4);
        b5=(LinearLayout)findViewById(R.id.years5);
        mp=MediaPlayer.create(this,R.raw.press);
        textView=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        date=loadDatad();


        dates=date.split("/");
        day=Integer.parseInt(dates[0]);
        month=Integer.parseInt(dates[1]);
        year=Integer.parseInt(dates[2]);

        Date d = new Date();
        s = DateFormat.format("dd/MM/yyyy", d.getTime());
        date1=String.valueOf(s);
        dates1=date1.split("/");
        day1=Integer.parseInt(dates1[0]);
        month1=Integer.parseInt(dates1[1]);
        year1=Integer.parseInt(dates1[2]);
        String daa,dbb;
        daa=day+"/"+month+"/"+year;
        dbb=day1+"/"+month1+"/"+year1;
        //long date=Date.parse(fy+"/"+fm+"/"+fd);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/mm/yyyy");
        try {
            ddate=simpleDateFormat.parse(daa);
            cdate=simpleDateFormat.parse(dbb);
            long dodate=ddate.getTime();
            long cudate=cdate.getTime();
            period=new org.joda.time.Period(dodate,cudate, PeriodType.yearMonthDay());
            fd=period.getDays();
            fm=period.getMonths();
            fy=period.getYears();

        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(fy>0 && fy <2){
            tv3.setText("Your age is "+fy+" years "+fm+" months "+fd+" days.\n1 year section is recomended for you.");
        }else if(fy>1 && fy <3){
            tv3.setText("Your age is "+fy+" years "+fm+" months "+fd+" days.\n2 years section is recomended for you.");
        }else if (fy>2 && fy <4)
        {
            tv3.setText("Your age is "+fy+" years "+fm+" months "+fd+" days.\n3 years section is recomended for you.");
        }else if(fy>3 && fy <5){
            tv3.setText("Your age is "+fy+" years "+fm+" months "+fd+" days.\n4 years section is recomended for you.");
        }else if(fy>0 && fy <2){
            tv3.setText("Your age is "+fy+" years "+fm+" months "+fd+" days.\n5 years section is recomended for you.");
        }else {
            tv3.setText("Your age is "+fy+" years "+fm+" months "+fd+" days.\nthis app is for kids of 1 to 5 years this app is not recomended for you.");
        }

       // tv3.setText("Your age is "+fy+" years "+fm+" months "+fd+" days");
        textView.setText(loadData()+"");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(Dashboard.this, engalpha.class));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(Dashboard.this, Twoyears.class));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();
                startActivity(new Intent(Dashboard.this, ThreeYears.class));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(Dashboard.this, FourYears.class));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(Dashboard.this, Fiveyears.class));
            }
        });
    }
    public void SaveData( int score){
        SharedPreferences sharedPreferences=getSharedPreferences("savescore",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        int totalscore=loadData()+score;
        editor.putInt("scoreValue",totalscore);
        editor.apply();
    }
    public int loadData(){
        SharedPreferences sharedPreferences=getSharedPreferences("savescore",MODE_PRIVATE);
        return  sharedPreferences.getInt("scoreValue",MODE_PRIVATE);
    }
    public String loadDatad(){
        SharedPreferences sharedPreferences=getSharedPreferences("saveDob",MODE_PRIVATE);
        return sharedPreferences.getString("DOB",null);
        //sharedPreferences.getString("DOB",MODE_PRIVATE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.setText(loadData()+"");
    }
}
