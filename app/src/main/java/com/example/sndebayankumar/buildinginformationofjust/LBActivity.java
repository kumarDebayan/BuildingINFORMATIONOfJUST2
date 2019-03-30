package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LBActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lb);

        listView = (ListView) findViewById(R.id.LBId);

        final String[] Lbnames = getResources().getStringArray(R.array.LBDept_names);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(LBActivity.this,R.layout.list_segment,R.id.listviewid,Lbnames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = Lbnames[position];
                Toast.makeText(LBActivity.this,value+" "+position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
