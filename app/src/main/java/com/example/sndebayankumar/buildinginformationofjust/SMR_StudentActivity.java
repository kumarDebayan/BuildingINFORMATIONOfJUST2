package com.example.sndebayankumar.buildinginformationofjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class SMR_StudentActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public ListView listView;
    public ArrayAdapter<String> adapter;
    String[] SMRStudetRoom;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smr__student);

        listView = (ListView) findViewById(R.id.SMRStudentsRoomId);

        SMRStudetRoom = getResources().getStringArray(R.array.SMR_Student_Room);

        final String[] SMRStudentRoom = getResources().getStringArray(R.array.SMR_Student_Room);
        adapter = new ArrayAdapter<>(SMR_StudentActivity.this,R.layout.sample_view,R.id.textViewId,SMRStudentRoom);
        listView.setAdapter(adapter);

        for(int i=0; i<SMRStudentRoom.length; i++){

        }

        listView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        MenuItem menuItem = menu.findItem(R.id.searhViewId);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String value = adapter.getItem(position);

        //  Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();
    }
}
