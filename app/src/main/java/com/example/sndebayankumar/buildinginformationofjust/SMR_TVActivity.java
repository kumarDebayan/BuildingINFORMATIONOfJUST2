package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SMR_TVActivity extends AppCompatActivity {
public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smr__tv);

        listView = (ListView) findViewById(R.id.SMRTVRoomId);

        final String[] SMRTVRoom = getResources().getStringArray(R.array.SMR_TV_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SMR_TVActivity.this, R.layout.list_segment,R.id.listviewid,SMRTVRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
