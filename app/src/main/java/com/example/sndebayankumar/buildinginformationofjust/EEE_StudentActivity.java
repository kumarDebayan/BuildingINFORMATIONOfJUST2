package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EEE_StudentActivity extends AppCompatActivity {

    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee__student);

        listView = (ListView) findViewById(R.id.StudentsRoomId);

        final String[] EEEDeptStudentRoom = getResources().getStringArray(R.array.EEEdept_Student_Room);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(EEE_StudentActivity.this, R.layout.list_segment1,R.id.listview1id,EEEDeptStudentRoom);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String value = EEEDeptStudentRoom[position];
                // Toast.makeText(EEE_StudentActivity.this,value+" "+position,Toast.LENGTH_SHORT).show();


            }
        });
    }
}
