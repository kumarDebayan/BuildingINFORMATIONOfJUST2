package com.example.sndebayankumar.buildinginformationofjust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AB_Activity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab_);

        listView = (ListView)findViewById(R.id.ABId);

        final String[] ABRooms = getResources().getStringArray(R.array.AB_rooms);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(AB_Activity.this,R.layout.list_segment,R.id.listviewid,ABRooms);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0) {
                    startActivity(new Intent(AB_Activity.this,AgraniBankActivity.class));
                }
                if (position==1) {
                    startActivity(new Intent(AB_Activity.this,CyberCenterActivity.class));
                }
                if (position==2) {
                    startActivity(new Intent(AB_Activity.this,ConferenceRoomActivity.class));
                }
                if (position==3) {
                    startActivity(new Intent(AB_Activity.this,VCActivity.class));
                }
                if (position==4) {
                    startActivity(new Intent(AB_Activity.this,TreasurerActivity.class));
                }
                if (position==5) {
                    startActivity(new Intent(AB_Activity.this,RegisterActivity.class));
                }
                if (position==8) {
                    startActivity(new Intent(AB_Activity.this,OfficeProvostActivity.class));
                }
                if (position==9) {
                    startActivity(new Intent(AB_Activity.this,OfficeProctorActivity.class));
                }
                if (position==10) {
                    startActivity(new Intent(AB_Activity.this,SCGActivity.class));
                }


               // String value = ABRooms[position];
               // Toast.makeText(AB_Activity.this,value+" "+position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
