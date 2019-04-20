package com.example.sndebayankumar.buildinginformationofjust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class CSEActivity extends AppCompatActivity implements View.OnClickListener {
    public Button Bttn1,Bttn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

        Bttn1 = findViewById(R.id.StudentroomId);
        Bttn2 = findViewById(R.id.TeacherroomId);

        Bttn1.setOnClickListener(this);
        Bttn2.setOnClickListener(this);

        Bttn1 = (Button) findViewById(R.id.StudentroomId);
        Bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEActivity.this,CSE_StudentActivity.class);
                startActivity(intent);
                }
        });
}

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.StudentroomId){

            Intent intent = new Intent(CSEActivity.this,CSE_StudentActivity.class);
            startActivity(intent);
    }
        if(v.getId() == R.id.TeacherroomId){

            Intent intent = new Intent(CSEActivity.this,CSE_TeacherActivity.class);
            startActivity(intent);
        }
}

}
