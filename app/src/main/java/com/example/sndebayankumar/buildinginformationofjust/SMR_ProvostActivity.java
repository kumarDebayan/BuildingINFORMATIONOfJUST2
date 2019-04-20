package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SMR_ProvostActivity extends AppCompatActivity {
      public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smr__provost);

        listView = (ListView) findViewById(R.id.SMRProvostRoomId);

        final String[] SMRProvostRoom = getResources().getStringArray(R.array.SMR_Provost_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SMR_ProvostActivity.this, R.layout.list_segment1,R.id.listview1id,SMRProvostRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
