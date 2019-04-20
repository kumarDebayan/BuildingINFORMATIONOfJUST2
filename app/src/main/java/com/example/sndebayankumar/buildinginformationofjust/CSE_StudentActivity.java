package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CSE_StudentActivity extends AppCompatActivity {
public ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse__student);

        listview = (ListView) findViewById(R.id.StudentsRoomId);

        final String[] CSEDeptStudentRoom = getResources().getStringArray(R.array.CSEdept_Student_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(CSE_StudentActivity.this, R.layout.list_segment1,R.id.listview1id,CSEDeptStudentRoom);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String value = CSEDeptStudentRoom[position];
               // Toast.makeText(CSE_StudentActivity.this,value+" "+position,Toast.LENGTH_SHORT).show();


            }
        });
    }
}
