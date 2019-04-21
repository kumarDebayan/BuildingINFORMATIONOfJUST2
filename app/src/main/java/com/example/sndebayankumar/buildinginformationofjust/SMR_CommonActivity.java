package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class SMR_CommonActivity extends AppCompatActivity {
public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smr__common);

        listView = (ListView) findViewById(R.id.SMRCommonRoomId);

        final String[] SMRCommonRoom = getResources().getStringArray(R.array.SMR_Common_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SMR_CommonActivity.this, R.layout.list_segment,R.id.listviewid,SMRCommonRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
