package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HC_DoctorActivity extends AppCompatActivity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hc__doctor);

        listView = (ListView) findViewById(R.id.DoctorsRoomId);

        final String[] HCDoctorRoom = getResources().getStringArray(R.array.HC_Doctor_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(HC_DoctorActivity.this, R.layout.list_segment1, R.id.listview1id, HCDoctorRoom);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });
    }
}
