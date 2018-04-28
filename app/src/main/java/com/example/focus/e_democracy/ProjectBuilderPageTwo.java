package com.example.focus.e_democracy;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class ProjectBuilderPageTwo extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_createproject2);
        getSupportActionBar().setTitle("Create proposal");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override  //--Method to enable menu on top bar
    public boolean onCreateOptionsMenu( Menu menu )
    {
        getMenuInflater().inflate( R.menu.menu_tabbed, menu );
        return true;
    }

    @Override  //--Method to control buttons on top bar
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            case R.id.next:
                //Intent intent = new Intent(getApplicationContext(), ProjectBuilderPageTwo.class);
                //startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}