package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CyberCenterActivity extends AppCompatActivity {
    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyber_center);

        listView = (ListView) findViewById(R.id.CyberCenterRoomId);

        final String[] CybercenterRoom = getResources().getStringArray(R.array.Cyber_Center_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(CyberCenterActivity.this, R.layout.list_segment,R.id.listviewid,CybercenterRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
