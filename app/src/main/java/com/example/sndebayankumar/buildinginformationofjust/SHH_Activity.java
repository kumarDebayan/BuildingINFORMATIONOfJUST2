package com.example.sndebayankumar.buildinginformationofjust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SHH_Activity extends AppCompatActivity {
     private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shh_);

        listView = (ListView) findViewById(R.id.SHHId);

        final String[] SHHRooms = getResources().getStringArray(R.array.SHH_rooms);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SHH_Activity.this,R.layout.list_segment,R.id.listviewid,SHHRooms);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0) {
                    startActivity(new Intent(SHH_Activity.this,SH_ProvostActivity.class));
                }
                if (position==1) {
                    startActivity(new Intent(SHH_Activity.this,SH_DiningActivity.class));
                }
                if (position==2) {
                    startActivity(new Intent(SHH_Activity.this,SH_ReadingActivity.class));
                }
                if (position==3) {
                    startActivity(new Intent(SHH_Activity.this,SH_CommonActivity.class));
                }
                if (position==4) {
                    startActivity(new Intent(SHH_Activity.this,SH_TVActivity.class));
                }
                if (position==5) {
                    startActivity(new Intent(SHH_Activity.this,SH_StudentActivity.class));
                }
                //String value = SHHRooms[position];
                //Toast.makeText(SHH_Activity.this,value+" "+position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
