package com.example.sndebayankumar.buildinginformationofjust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EEEActivity extends AppCompatActivity implements View.OnClickListener {
    public Button Btn1,Btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);

        Btn1 = findViewById(R.id.StudentroomId);
        Btn2 = findViewById(R.id.TeacherroomId);

        Btn1.setOnClickListener(this);
        Btn2.setOnClickListener(this);

        Btn1 = (Button) findViewById(R.id.StudentroomId);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEActivity.this,EEE_StudentActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.StudentroomId){

            Intent intent = new Intent(EEEActivity.this,EEE_StudentActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.TeacherroomId){

            Intent intent = new Intent(EEEActivity.this,EEE_TeacherActivity.class);
            startActivity(intent);
        }
    }
}
