package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SMRH_Activity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smrh_);

        listView = (ListView) findViewById(R.id.SMRHId);
        final String[] SMRHRooms = getResources().getStringArray(R.array.SMRH_rooms);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(SMRH_Activity.this,R.layout.list_segment,R.id.listviewid,SMRHRooms);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = SMRHRooms[position];
                Toast.makeText(SMRH_Activity.this,value+" "+position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
