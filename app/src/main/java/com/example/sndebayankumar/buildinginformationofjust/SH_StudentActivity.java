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

public class SH_StudentActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
   public ListView listView;
    public ArrayAdapter<String> adapter;
    String[] SHStudetRoom;
    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sh__student);

        listView = (ListView) findViewById(R.id.SHStudentsRoomId);

        SHStudetRoom = getResources().getStringArray(R.array.SH_Student_ROOM);

        final String[] SHStudentRoom = getResources().getStringArray(R.array.SH_Student_ROOM);

        adapter = new ArrayAdapter<>(SH_StudentActivity.this, R.layout.sample_view, R.id.textViewId, SHStudentRoom);
        listView.setAdapter(adapter);

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
