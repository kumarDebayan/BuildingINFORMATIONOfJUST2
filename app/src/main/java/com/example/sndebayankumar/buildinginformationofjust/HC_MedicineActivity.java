package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HC_MedicineActivity extends AppCompatActivity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hc__medicine);

        listView = (ListView) findViewById(R.id.MedicineRoomId);

        final String[] MedicineRoom = getResources().getStringArray(R.array.HC_Medicine_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(HC_MedicineActivity.this, R.layout.list_segment, R.id.listviewid, MedicineRoom);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });
    }
}
