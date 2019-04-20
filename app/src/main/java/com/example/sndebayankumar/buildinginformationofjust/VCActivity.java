package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VCActivity extends AppCompatActivity {

    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vc);

        listView = (ListView) findViewById(R.id.VCRoomId);

        final String[] VCRoom = getResources().getStringArray(R.array.Vice_Chancellor_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(VCActivity.this, R.layout.list_segment1,R.id.listview1id,VCRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
