package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SH_DiningActivity extends AppCompatActivity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sh__dining);

        listView = (ListView) findViewById(R.id.SHDiningRoomId);

        final String[] SHDiningRoom = getResources().getStringArray(R.array.SH_Dining_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SH_DiningActivity.this, R.layout.list_segment,R.id.listviewid,SHDiningRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
