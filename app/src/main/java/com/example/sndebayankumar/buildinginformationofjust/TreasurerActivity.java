package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class TreasurerActivity extends AppCompatActivity {

    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasurer);

        listView = (ListView) findViewById(R.id.TreasurerRoomId);

        final String[] TreasurerRoom = getResources().getStringArray(R.array.Treasurer_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(TreasurerActivity.this, R.layout.list_segment1,R.id.listview1id,TreasurerRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
