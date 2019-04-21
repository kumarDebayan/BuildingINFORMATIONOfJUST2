package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SH_ReadingActivity extends AppCompatActivity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sh__reading);

        listView = (ListView) findViewById(R.id.SHReadingRoomId);

        final String[] SHReadingRoom = getResources().getStringArray(R.array.SH_Reading_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SH_ReadingActivity.this, R.layout.list_segment,R.id.listviewid,SHReadingRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
