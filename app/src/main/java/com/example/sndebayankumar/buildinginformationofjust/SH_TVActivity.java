package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SH_TVActivity extends AppCompatActivity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sh__tv);

        listView = (ListView) findViewById(R.id.SHTVRoomId);

        final String[] SHTVRoom = getResources().getStringArray(R.array.SH_TV_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SH_TVActivity.this, R.layout.list_segment,R.id.listviewid,SHTVRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
