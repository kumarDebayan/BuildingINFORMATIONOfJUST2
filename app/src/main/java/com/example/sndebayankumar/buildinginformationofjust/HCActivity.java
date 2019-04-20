package com.example.sndebayankumar.buildinginformationofjust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HCActivity extends AppCompatActivity implements View.OnClickListener{
    public Button Bttn1,Bttn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hc);

        Bttn1 = findViewById(R.id.doctorsId);
        Bttn2 = findViewById(R.id.medicineId);

        Bttn1.setOnClickListener(this);
        Bttn2.setOnClickListener(this);

        Bttn1 = (Button) findViewById(R.id.doctorsId);
        Bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HCActivity.this,HC_DoctorActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.doctorsId){

            Intent intent = new Intent(HCActivity.this,HC_DoctorActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.medicineId){

            Intent intent = new Intent(HCActivity.this,HC_MedicineActivity.class);
            startActivity(intent);
        }

    }
}
