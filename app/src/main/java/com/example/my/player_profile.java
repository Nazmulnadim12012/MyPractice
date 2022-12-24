package com.example.my;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class player_profile extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_profile);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        imageView=findViewById(R.id.player_image_id);
        textView=findViewById(R.id.player_text_id);

        Bundle bundle = getIntent().getExtras();


        if (bundle!=null){
            String playerName = bundle.getString("name");
            showDetails(playerName);
        }



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void showDetails(String playerName) {

        if (playerName.equals("sachin")){
            imageView.setImageResource(R.drawable.tendulkar);
            textView.setText(R.string.sachin_tendulkar_text);
        }
        if (playerName.equals("lara")){
            imageView.setImageResource(R.drawable.brain_lara);
            textView.setText(R.string.brain_lara_text);
        }
        if (playerName.equals("imran")){
            imageView.setImageResource(R.drawable.imran_khan);
            textView.setText(R.string.imran_khan_text);
        }
    }


}