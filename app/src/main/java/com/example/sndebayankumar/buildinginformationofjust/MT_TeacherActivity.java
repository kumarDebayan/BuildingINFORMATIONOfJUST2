package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MT_TeacherActivity extends AppCompatActivity {
    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mt__teacher);

        listView = (ListView) findViewById(R.id.TeachersRoomId);

        final String[] MTDeptTeacherRoom = getResources().getStringArray(R.array.MTdept_Teacher_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(MT_TeacherActivity.this, R.layout.list_segment1, R.id.listview1id, MTDeptTeacherRoom);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String value = MTDeptTeacherRoom[position];
                //Toast.makeText(MT_TeacherActivity.this, value + " " + position, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
