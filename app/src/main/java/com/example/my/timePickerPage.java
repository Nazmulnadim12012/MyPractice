package com.example.my;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class timePickerPage extends AppCompatActivity {
    private TimePicker timePicker;
    private TextView timePickerText;
    private Button timePickerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_page);

        timePicker = findViewById(R.id.timePicker_id);
        timePicker.setIs24HourView(true);

        timePickerText = findViewById(R.id.timePickerText_id);
        timePickerButton = findViewById(R.id.timePickerButton_id);



        timePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = (timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute());

                timePickerText.setText(time);
            }
        });



    }
}