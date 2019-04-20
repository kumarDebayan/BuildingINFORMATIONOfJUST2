package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SCGActivity extends AppCompatActivity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scg);

        listView = (ListView) findViewById(R.id.SCGRoomId);

        final String[] SCGRoom = getResources().getStringArray(R.array.Office_SCG_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SCGActivity.this, R.layout.list_segment1,R.id.listview1id,SCGRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
