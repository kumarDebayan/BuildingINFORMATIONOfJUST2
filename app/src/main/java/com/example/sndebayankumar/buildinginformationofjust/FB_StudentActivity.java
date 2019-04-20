package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FB_StudentActivity extends AppCompatActivity {
    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fb__student);

        listView = (ListView) findViewById(R.id.StudentsRoomId);

        final String[] FBDeptStudentRoom = getResources().getStringArray(R.array.FBdept_Student_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(FB_StudentActivity.this, R.layout.list_segment1,R.id.listview1id,FBDeptStudentRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
