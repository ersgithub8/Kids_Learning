package com.example.kidslearning;

import android.Manifest;
import android.app.ActionBar;
import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.VideoView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class VideoActivity extends AppCompatActivity {
    VideoView videoView;
    ProgressBar pd;
    int position;
    ImageButton imageButton;
    String vurl;
    private static final int My_permission=0;
    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        imageButton=(ImageButton)findViewById(R.id.imgbtn1);
        videoView=(VideoView)findViewById(R.id.video);
        pd=(ProgressBar)findViewById(R.id.progressBar);
        View overlay=findViewById(R.id.vview);
        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        vurl=getIntent().getStringExtra("url");
        Uri uri=Uri.parse(vurl);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        //    videoView.requestFocus();
        videoView.start();
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(VideoActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){
                       startDownlaod();
                       imageButton.setVisibility(View.GONE);
                    }else{
                        checkPermission();
                    }
                }else {
                    startDownlaod();
                }

            }
        });
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                pd.setVisibility(View.GONE);
                mp.setOnInfoListener(new MediaPlayer.OnInfoListener() {
                    @Override
                    public boolean onInfo(MediaPlayer mp, int what, int extra) {
                        if(what==MediaPlayer.MEDIA_INFO_BUFFERING_START)
                        {
                            pd.setVisibility(View.VISIBLE);
                        }
                        if(what==MediaPlayer.MEDIA_INFO_BUFFERING_END){
                            pd.setVisibility(View.GONE);
                        }
                        return false;
                    }
                });
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        position=videoView.getCurrentPosition();
        videoView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        pd.setVisibility(View.VISIBLE);
        videoView.start();
        videoView.seekTo(position);
    }

    public void  startDownlaod(){
        DownloadManager.Request request=new DownloadManager.Request(Uri.parse(vurl));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle("Download");
        request.setDescription("Downloading");
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        //request.setDestinationInExternalFilesDir();

        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"Kids Learnig"+System.currentTimeMillis());
        DownloadManager manager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
    }
    public void checkPermission(){
        if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.WRITE_EXTERNAL_STORAGE))
        {ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, My_permission);
        }else{
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, My_permission);
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestcode,String permission[],int[] grantresults)
    {
        switch (requestcode)
        {
            case My_permission:
                if(grantresults.length>0 && grantresults[0]==PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this,"Permission granted",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this,"Permission not granted",Toast.LENGTH_SHORT).show();
                }
        }
    }

}
