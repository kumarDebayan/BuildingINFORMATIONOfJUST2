package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AIS_TeacherActivity extends AppCompatActivity {
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ais__teacher);

        listView = (ListView) findViewById(R.id.TeachersRoomId);

        final String[] AISDeptTeacherRoom = getResources().getStringArray(R.array.AISdept_Teacher_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(AIS_TeacherActivity.this, R.layout.list_segment1, R.id.listview1id, AISDeptTeacherRoom);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String value = AISDeptTeacherRoom[position];
                //Toast.makeText(AIS_TeacherActivity.this, value + " " + position, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
