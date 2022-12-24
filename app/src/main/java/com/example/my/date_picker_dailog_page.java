package com.example.my;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class date_picker_dailog_page extends AppCompatActivity {

    private TextView textView;
    private Button datePickerButton;
    private DatePickerDialog datePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_dailog_page);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textView =findViewById(R.id.date_picker_text_id);
        datePickerButton = findViewById(R.id.date_picker_button_id);



        datePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                DatePicker datePicker = new DatePicker(date_picker_dailog_page.this);
                int currentDate = datePicker.getDayOfMonth();
                int currentMonth = (datePicker.getMonth()+1);
                int currentYear = datePicker.getYear();




                datePickerDialog = new DatePickerDialog(date_picker_dailog_page.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        textView.setText("Date : "+dayOfMonth+"/"+(month+1)+"/"+year);

                    }


                },currentYear,currentMonth,currentDate);
                datePickerDialog.show();


            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}