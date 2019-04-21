package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SMR_ReadingActivity extends AppCompatActivity {
public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smr__reading);

        listView = (ListView) findViewById(R.id.SMRReadingRoomId);

        final String[] SMRReadingRoom = getResources().getStringArray(R.array.SMR_Reading_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SMR_ReadingActivity.this, R.layout.list_segment,R.id.listviewid,SMRReadingRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
