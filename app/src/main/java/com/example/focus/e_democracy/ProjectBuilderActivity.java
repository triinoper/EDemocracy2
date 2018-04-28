package com.example.focus.e_democracy;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class ProjectBuilderActivity extends AppCompatActivity {

    private ProjectBuilderPageOne createProjectPageOneFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_builder);
        getSupportActionBar().setTitle("Create proposals");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().nex

        //replace fragment
        createProjectPageOneFragment = new ProjectBuilderPageOne();
        final android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.builder_frame_layout_id, createProjectPageOneFragment);
        fragmentTransaction.commit();

    }
    @Override
    public boolean onCreateOptionsMenu( Menu menu )
    {
        getMenuInflater().inflate( R.menu.menu_tabbed, menu );
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
