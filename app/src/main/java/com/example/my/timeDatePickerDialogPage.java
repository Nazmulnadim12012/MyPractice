package com.example.my;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class timeDatePickerDialogPage extends AppCompatActivity implements View.OnClickListener {
    private TextView timeText, dateText;
    private Button timeButton, dataButton;
    private TimePickerDialog timePickerDialog;
    private DatePickerDialog datePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_date_picker_dialog_page);


        timeText =findViewById(R.id.showTime_id);
        dateText =findViewById(R.id.showDate_id);

        timeButton = findViewById(R.id.timeDialog_id);
        dataButton = findViewById(R.id.dateDialog_id);

        timeButton.setOnClickListener(this);
        dataButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if ( v.getId() == R.id.timeDialog_id){

            TimePicker timePicker = new TimePicker(this);
            int currentHour = timePicker.getCurrentHour();
            int currentMinute = timePicker.getCurrentMinute();

            timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                    timeText.setText(hourOfDay+":"+minute);

                }
            },currentHour,currentMinute,true);
            timePickerDialog.show();







        }
        if (v.getId() == R.id.dateDialog_id){

            DatePicker datePicker = new DatePicker(this);
            int currentDate = datePicker.getDayOfMonth();
            int currentMonth = datePicker.getMonth();
            int currentYear = datePicker.getYear();


            datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    dateText.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                }
            },currentYear,currentMonth,currentDate);

            datePickerDialog.show();






        }


    }
}