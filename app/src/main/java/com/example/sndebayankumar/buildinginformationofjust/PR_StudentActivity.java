package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PR_StudentActivity extends AppCompatActivity {
     public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr__student);

        listView = (ListView) findViewById(R.id.StudentsRoomId);

        final String[] PRDeptStudentRoom = getResources().getStringArray(R.array.PRdept_Student_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(PR_StudentActivity.this, R.layout.list_segment1,R.id.listview1id,PRDeptStudentRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
