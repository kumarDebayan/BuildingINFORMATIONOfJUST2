package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AgraniBankActivity extends AppCompatActivity {

    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agrani_bank);

        listView = (ListView) findViewById(R.id.AgraniBankRoomId);

        final String[] AgranibankRoom = getResources().getStringArray(R.array.Agrani_Bank_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(AgraniBankActivity.this, R.layout.list_segment,R.id.listviewid,AgranibankRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
