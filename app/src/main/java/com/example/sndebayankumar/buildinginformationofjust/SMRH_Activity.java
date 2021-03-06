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

public class SMRH_Activity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smrh_);

        listView = (ListView) findViewById(R.id.SMRHId);
        final String[] SMRHRooms = getResources().getStringArray(R.array.SMRH_rooms);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SMRH_Activity.this,R.layout.list_segment,R.id.listviewid,SMRHRooms);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0) {
                    startActivity(new Intent(SMRH_Activity.this,SMR_ProvostActivity.class));
                }
                if (position==1) {
                    startActivity(new Intent(SMRH_Activity.this,SMR_DiningActivity.class));
                }
                if (position==2) {
                    startActivity(new Intent(SMRH_Activity.this,SMR_ReadingActivity.class));
                }
                if (position==3) {
                    startActivity(new Intent(SMRH_Activity.this,SMR_CommonActivity.class));
                }
                if (position==4) {
                    startActivity(new Intent(SMRH_Activity.this,SMR_TVActivity.class));
                }

                if (position==5) {
                    startActivity(new Intent(SMRH_Activity.this,SMR_StudentActivity.class));
                }

               // String value = SMRHRooms[position];
              //  Toast.makeText(SMRH_Activity.this,value+" "+position, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
