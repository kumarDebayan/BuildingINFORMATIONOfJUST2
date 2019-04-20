package com.example.sndebayankumar.buildinginformationofjust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MBActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mb);
        listView = (ListView)findViewById(R.id.MBId);

        final String[] MBDeptNames = getResources().getStringArray(R.array.MBDept_names);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(MBActivity.this,R.layout.list_segment,R.id.listviewid,MBDeptNames);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==1) {
                    startActivity(new Intent(MBActivity.this,BMEActivity.class));
                }

                if (position==2) {
                    startActivity(new Intent(MBActivity.this,TEActivity.class));
                }
                if (position==3) {
                    startActivity(new Intent(MBActivity.this,LEActivity.class));
                }
                if (position==6) {
                    startActivity(new Intent(MBActivity.this,PRActivity.class));
                }
                if (position==8) {
                    startActivity(new Intent(MBActivity.this,HCActivity.class));
                }

                //String value = MBDeptNames[position];
                //Toast.makeText(MBActivity.this,value+" "+position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
