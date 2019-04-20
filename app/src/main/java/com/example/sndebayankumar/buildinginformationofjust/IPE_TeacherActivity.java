package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IPE_TeacherActivity extends AppCompatActivity {
    public ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipe__teacher);

        listView = (ListView) findViewById(R.id.TeachersRoomId);

        final String[] IPEDeptTeacherRoom = getResources().getStringArray(R.array.IPEdept_Teacher_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(IPE_TeacherActivity.this, R.layout.list_segment1, R.id.listview1id, IPEDeptTeacherRoom);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String value = IPEDeptTeacherRoom[position];
                //Toast.makeText(IPE_TeacherActivity.this, value + " " + position, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
