package com.example.focus.e_democracy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ProjectBuilderPageThree extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_createproject3);
        getSupportActionBar().setTitle("Create proposal");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final Button PublishButton = findViewById(R.id.btn_publish);
        PublishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override  //--Method to enable menu on top bar
    public boolean onCreateOptionsMenu( Menu menu )
    {
        getMenuInflater().inflate( R.menu.menu_tabbed, menu );
        MenuItem next = menu.findItem(R.id.next);
        next.setVisible(false);
        return true;
    }

    @Override  //--Method to control buttons on top bar
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            //case R.id.next:
                //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //startActivity(intent);
                //return true;
        }
        return super.onOptionsItemSelected(item);
    }


}