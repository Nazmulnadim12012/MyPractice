package com.example.my;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

public class zoomControlPage extends AppCompatActivity {
    private ImageView imageView;
    private ZoomControls zoomControls;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_control_page);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        imageView = findViewById(R.id.imageViewId);
        zoomControls = findViewById(R.id.zoomControl_id);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                if (x<3&&y<3){

                    imageView.setScaleX((float)x+1);
                    imageView.setScaleY((float)y+1);

                }



            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                if (x>1&&y>1){

                    imageView.setScaleX((float)x-1);
                    imageView.setScaleY((float)y-1);

                }




            }
        });

    }
}