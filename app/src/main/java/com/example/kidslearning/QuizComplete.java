package com.example.kidslearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public class QuizComplete extends AppCompatActivity {
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_complete);
    mediaPlayer=MediaPlayer.create(this,R.raw.clap);
    mediaPlayer.start();
    simple_Notification();
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            finish();
        }
    },5000);
    }
    private void simple_Notification() {
        //declare an id for your notification
        //id is used in many things especially when setting action buttons and their intents
        int notificationId = 0;
        //init notification and declare specifications
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.iconnoti)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.iconnoti))
                .setContentTitle("Congratulation")
//                .setContentText("You have passed the Quiz. \nAnd your score is "+loadData())
                .setStyle(new NotificationCompat.InboxStyle().addLine("You have passed the Quiz.").addLine("Your score is"+loadData()))
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL);

        //set a tone when notification appears
        Uri path = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(path);

        //call notification manager so it can build and deliver the notification to the OS
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        //Android 8 introduced a new requirement of setting the channelId property by using a NotificationChannel.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            String channelId = "YOUR_CHANNEL_ID";
            NotificationChannel channel = new NotificationChannel(channelId,
                    "Channel human readable title",
                    NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(channel);
            builder.setChannelId(channelId);
        }

        notificationManager.notify(notificationId,builder.build());
    }

    public int loadData(){
        SharedPreferences sharedPreferences=getSharedPreferences("savescore",MODE_PRIVATE);
        return  sharedPreferences.getInt("scoreValue",MODE_PRIVATE);
    }

}
