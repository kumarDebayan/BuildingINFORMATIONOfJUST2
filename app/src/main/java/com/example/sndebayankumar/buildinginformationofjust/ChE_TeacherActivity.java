package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChE_TeacherActivity extends AppCompatActivity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_e__teacher);


        listView = (ListView) findViewById(R.id.TeachersRoomId);

        final String[] ChEDeptTeacherRoom = getResources().getStringArray(R.array.ChEdept_Teacher_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(ChE_TeacherActivity.this, R.layout.list_segment1, R.id.listview1id, ChEDeptTeacherRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
