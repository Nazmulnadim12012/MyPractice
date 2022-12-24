package com.example.my;

import static com.example.my.R.raw.videoplayback;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoView extends AppCompatActivity {

    private VideoView videoView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        videoView=findViewById(R.id.videoView1_id);

        Uri uri = Uri.parse("android.resources://"+getPackageName()+"/"+ videoplayback);
        videoView.setVideoURI(uri);
        MediaController mediaController =new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
}