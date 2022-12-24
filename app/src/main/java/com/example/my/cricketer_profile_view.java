package com.example.my;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class cricketer_profile_view extends AppCompatActivity implements View.OnClickListener {
    private Button sachinButton,imranButton,laraButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crickter_profile_view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        sachinButton=findViewById(R.id.sachin_tendulkar_id);
        laraButton=findViewById(R.id.brain_lara_id);
        imranButton=findViewById(R.id.brain_lara_id);

        sachinButton.setOnClickListener(this);
        laraButton.setOnClickListener(this);
        imranButton.setOnClickListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.sachin_tendulkar_id){
            Intent intent =new Intent(cricketer_profile_view.this,player_profile.class);
            intent.putExtra("name","sachin");
            startActivity(intent);

        }
        if (v.getId()==R.id.brain_lara_id){
            Intent intent =new Intent(cricketer_profile_view.this,player_profile.class);
            intent.putExtra("name","lara");
            startActivity(intent);

        }
        if (v.getId()==R.id.imran_khan_id){
            Intent intent =new Intent(cricketer_profile_view.this,player_profile.class);
            intent.putExtra("name","imran");
            startActivity(intent);

        }

    }
}