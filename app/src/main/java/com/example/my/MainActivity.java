package com.example.my;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private EditText editText1,editText2;
    private Button addbtn,subbtn,mulbtn,divbtn,Cbtn,nextbtn,datePickerDialog,
            timePicker,timePickerDialog,timeDatePickerDialog,zoomControl,videoView,intentData,intentProject,
            intentDataPassingResult;
    private TextView resulttextView;
    private AlertDialog.Builder builder;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        editText1 = findViewById(R.id.edittxt1);
        editText2 = findViewById(R.id.edittxt2);
        addbtn = findViewById(R.id.btn1);
        subbtn = findViewById(R.id.btn2);
        mulbtn = findViewById(R.id.btn3);
        divbtn = findViewById(R.id.btn4);
        Cbtn = findViewById(R.id.btn5);
        resulttextView = findViewById(R.id.txtId);
        nextbtn = findViewById(R.id.nextPage_id);
        datePickerDialog = findViewById(R.id.date_picker_dialog);
        timePicker = findViewById(R.id.time_picker_id);
        timePickerDialog = findViewById(R.id.time_picker_dialog_id);
        timeDatePickerDialog =findViewById(R.id.timeDatePickerDialog_id);
        zoomControl =findViewById(R.id.zoomControl_id);
        videoView=findViewById(R.id.videoView_id);
        intentData=findViewById(R.id.intent_View_id);
        intentProject=findViewById(R.id.intentProject_View_id);
        intentDataPassingResult=findViewById(R.id.intentDataPassingResult_id);



         addbtn.setOnClickListener(this);
         subbtn.setOnClickListener(this);
         mulbtn.setOnClickListener(this);
         divbtn.setOnClickListener(this);
         Cbtn.setOnClickListener(this);
         nextbtn.setOnClickListener(this);
         datePickerDialog.setOnClickListener(this);
         timePicker.setOnClickListener(this);
         timePickerDialog.setOnClickListener(this);
         timeDatePickerDialog.setOnClickListener(this);
         zoomControl.setOnClickListener(this);
         videoView.setOnClickListener(this);
         intentData.setOnClickListener(this);
         intentProject.setOnClickListener(this);
         intentDataPassingResult.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {



        try {

            String num1 = editText1.getText().toString();
            String num2 = editText2.getText().toString();

            double number1 = Double.parseDouble(num1);
            double number2 = Double.parseDouble(num2);

            if (v.getId()==R.id.btn1){
                double sum = number1 + number2;
                resulttextView.setText("Result ="+sum);


            }if (v.getId()==R.id.btn2){
                double sum = number1 - number2;
                resulttextView.setText("Result ="+sum);


            }if (v.getId()==R.id.btn3){
                double sum = number1 * number2;
                resulttextView.setText("Result = "+sum);


            }if (v.getId()==R.id.btn4){
                double sum = number1 / number2;
                resulttextView.setText("Result = "+sum);


            }if (v.getId()==R.id.btn5){

                editText1.getText().clear();
                editText2.getText().clear();
                resulttextView.setText("");


            }




        }catch (Exception e){

            if (v.getId()==R.id.nextPage_id){

                Intent intent = new Intent(MainActivity.this,date_picker_page.class);
                startActivity(intent);


            } if (v.getId()==R.id.date_picker_dialog){

                Intent intent = new Intent(MainActivity.this,date_picker_dailog_page.class);
                startActivity(intent);

            } if (v.getId()==R.id.time_picker_id){

                Intent intent = new Intent(MainActivity.this,timePickerPage.class);
                startActivity(intent);

            } if (v.getId()==R.id.time_picker_dialog_id){

                Intent intent = new Intent(MainActivity.this,timePickerDialogPage.class);
                startActivity(intent);
            } if (v.getId()==R.id.timeDatePickerDialog_id){

                Intent intent = new Intent(MainActivity.this,timeDatePickerDialogPage.class);
                startActivity(intent);
            } if (v.getId()==R.id.zoomControl_id){

                Intent intent = new Intent(MainActivity.this,zoomControlPage.class);
                startActivity(intent);
            } if (v.getId()==R.id.videoView_id){

                Intent intent = new Intent(MainActivity.this,videoView.class);
                startActivity(intent);
            } if (v.getId()==R.id.intent_View_id){

                Intent intent = new Intent(MainActivity.this,profile_view.class);
                intent.putExtra("tag","I love Bangladesh.");
                startActivity(intent);
            } if (v.getId()==R.id.intentProject_View_id) {

                Intent intent = new Intent(MainActivity.this, cricketer_profile_view.class);
                intent.putExtra("tag", "I love Bangladesh.");
                startActivity(intent);
            } if (v.getId()==R.id.intentDataPassingResult_id) {

                Intent intent = new Intent(MainActivity.this, intentResult1.class);
                startActivity(intent);
            }

            else{

                LayoutInflater inflater = getLayoutInflater();
                View custom_view = inflater.inflate(R.layout.custom_toast,findViewById(R.id.custom_toast_id));
                Toast toast = new Toast(MainActivity.this);
                toast.setView(custom_view);
                toast.setGravity(Gravity.BOTTOM,0,100);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();


            }

        }

    }

    public void exit(){

        builder=new AlertDialog.Builder(this);
        builder.setTitle("Alert")
                .setIcon(R.drawable.question)
                .setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();



    }

    @Override
    public void onBackPressed() {
        exit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.settingId){
            Intent intent = new Intent(MainActivity.this,settings.class);
            startActivity(intent);
        }
        if (item.getItemId()==R.id.shareId){
            Toast.makeText(this, "Share menu clicked", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId()==R.id.settingId){
            Toast.makeText(this, "About Us menu clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}