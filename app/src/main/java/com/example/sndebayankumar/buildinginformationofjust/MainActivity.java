package com.example.sndebayankumar.buildinginformationofjust;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1,button2,button3,button4,button5,button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button1 = findViewById(R.id.name1_textId);
        button2 = findViewById(R.id.name2_textId);
        button3 = findViewById(R.id.name3_textId);
        button4 = findViewById(R.id.name4_textId);
        button5 = findViewById(R.id.name5_textId);
        button6 = findViewById(R.id.name6_textId);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       MenuInflater menuInflater= getMenuInflater();
       menuInflater.inflate(R.menu.main_menu, menu);
       return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.AdminId) {
            Toast.makeText(MainActivity.this, "Admin is selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.LogoutId) {
            Toast.makeText(MainActivity.this, "Logout is selected",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.name1_textId){
            Intent intent = new Intent(MainActivity.this,BSMA_Activity.class);
            startActivity(intent);
        }

        if(v.getId() == R.id.name2_textId){
            Intent intent = new Intent(MainActivity.this,LBActivity.class);
            startActivity(intent);
        }

        if(v.getId() == R.id.name3_textId){
            Intent intent = new Intent(MainActivity.this,AB_Activity.class);
            startActivity(intent);

        }

        if(v.getId() == R.id.name4_textId){
           Intent intent = new Intent(MainActivity.this,MBActivity.class);
            startActivity(intent);
        }

        if(v.getId() == R.id.name5_textId){
            Intent intent = new Intent(MainActivity.this,SMRH_Activity.class);
            startActivity(intent);
        }

       if(v.getId() == R.id.name6_textId){
            Intent intent = new Intent(MainActivity.this,SHH_Activity.class);
            startActivity(intent);
       }

    }
}
