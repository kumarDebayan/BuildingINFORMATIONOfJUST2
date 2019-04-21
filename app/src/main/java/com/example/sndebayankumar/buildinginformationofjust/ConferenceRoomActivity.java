package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ConferenceRoomActivity extends AppCompatActivity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conference_room);

        listView = (ListView) findViewById(R.id.ConferenceRoomId);

        final String[] ConferenceRoom = getResources().getStringArray(R.array.Conference_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(ConferenceRoomActivity.this, R.layout.list_segment,R.id.listviewid,ConferenceRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
