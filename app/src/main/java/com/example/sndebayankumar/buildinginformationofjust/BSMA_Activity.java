package com.example.sndebayankumar.buildinginformationofjust;

import android.content.Intent;
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

                if (position==1) {
                    startActivity(new Intent(BSMA_Activity.this,CSEActivity.class));
                }
                if (position==2) {
                    startActivity(new Intent(BSMA_Activity.this,EEEActivity.class));
                }
                if (position==3) {
                    startActivity(new Intent(BSMA_Activity.this,IPEActivity.class));
                }
                if (position==4) {
                    startActivity(new Intent(BSMA_Activity.this,ChEActivity.class));
                }
                if (position==5) {
                    startActivity(new Intent(BSMA_Activity.this,PMEActivity.class));
                }
                if (position==8) {
                    startActivity(new Intent(BSMA_Activity.this,ChemActivity.class));
                }
                if (position==9) {
                    startActivity(new Intent(BSMA_Activity.this,PhyActivity.class));
                }
                if (position==10) {
                    startActivity(new Intent(BSMA_Activity.this,MathActivity.class));
                }
                if (position==13) {
                    startActivity(new Intent(BSMA_Activity.this,PharmachyActivity.class));
                }
                if (position==14) {
                    startActivity(new Intent(BSMA_Activity.this,MicroBActivity.class));
                }
                if (position==15) {
                    startActivity(new Intent(BSMA_Activity.this,FMBActivity.class));
                }
                if (position==16) {
                    startActivity(new Intent(BSMA_Activity.this,GEBTActivity.class));
                }
                if (position==19) {
                    startActivity(new Intent(BSMA_Activity.this,ESTActivity.class));
                }
                if (position==20) {
                    startActivity(new Intent(BSMA_Activity.this,NFTActivity.class));
                }
                if (position==21) {
                    startActivity(new Intent(BSMA_Activity.this,APPTActivity.class));
                }




                //String value = BSMADeptNames[position];
               // Toast.makeText(BSMA_Activity.this,value+" "+position,Toast.LENGTH_SHORT).show();
             
            }
        });
    }
}
