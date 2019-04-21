package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SH_CommonActivity extends AppCompatActivity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sh__common);

        listView = (ListView) findViewById(R.id.SHCommonRoomId);

        final String[] SHCommonRoom = getResources().getStringArray(R.array.SH_Common_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SH_CommonActivity.this, R.layout.list_segment,R.id.listviewid,SHCommonRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
