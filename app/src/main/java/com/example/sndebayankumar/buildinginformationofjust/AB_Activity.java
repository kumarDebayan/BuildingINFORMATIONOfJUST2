package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AB_Activity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab_);

        listView = (ListView)findViewById(R.id.ABId);

        final String[] ABRooms = getResources().getStringArray(R.array.AB_rooms);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(AB_Activity.this,R.layout.list_segment,R.id.listviewid,ABRooms);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               // String value = ABRooms[position];
               // Toast.makeText(AB_Activity.this,value+" "+position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
