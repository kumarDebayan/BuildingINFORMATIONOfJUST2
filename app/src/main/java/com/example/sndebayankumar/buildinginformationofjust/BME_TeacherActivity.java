package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BME_TeacherActivity extends AppCompatActivity {
   public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bme__teacher);

        listView = (ListView) findViewById(R.id.TeachersRoomId);

        final String[] BMEDeptTeacherRoom = getResources().getStringArray(R.array.BMEdept_Teacher_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(BME_TeacherActivity.this, R.layout.list_segment1, R.id.listview1id, BMEDeptTeacherRoom);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String value = BMEDeptTeacherRoom[position];
                //Toast.makeText(BME_TeacherActivity.this, value + " " + position, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
