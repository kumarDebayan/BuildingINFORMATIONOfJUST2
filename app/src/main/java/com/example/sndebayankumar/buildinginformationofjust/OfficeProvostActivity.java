package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class OfficeProvostActivity extends AppCompatActivity {

    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_provost);

        listView = (ListView) findViewById(R.id.OfficeProvostRoomId);

        final String[] OfficeprovostRoom = getResources().getStringArray(R.array.Office_Provost_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(OfficeProvostActivity.this, R.layout.list_segment1,R.id.listview1id,OfficeprovostRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
