package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SH_ProvostActivity extends AppCompatActivity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sh__provost);

        listView = (ListView) findViewById(R.id.SHProvostRoomId);

        final String[] SHProvostRoom = getResources().getStringArray(R.array.SH_Provost_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SH_ProvostActivity.this, R.layout.list_segment1,R.id.listview1id,SHProvostRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
