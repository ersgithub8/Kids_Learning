package com.example.kidslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    Database database=new Database(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Cursor res=database.viewAll();
                if(res.getCount()==0)
                {
                    Intent intent=new Intent(MainActivity.this,Register.class);
                    startActivity(intent);
                    finish();
                }else {
                    Intent intent=new Intent(MainActivity.this,Dashboard.class);
                    startActivity(intent);
                    finish();
                }
            }
        },3000);
    }
}
