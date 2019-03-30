package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class BSMA_Activity extends AppCompatActivity {
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsma_);
        listView = (ListView) findViewById(R.id.BSMAbuildingId);

        final String[] BSMADeptNames = getResources().getStringArray(R.array.BSMADept_names);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(BSMA_Activity.this,R.layout.list_segment,R.id.listviewid,BSMADeptNames);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


             String value = BSMADeptNames[position];
                Toast.makeText(BSMA_Activity.this,value+" "+position,Toast.LENGTH_SHORT).show();
             
            }
        });
    }
}
