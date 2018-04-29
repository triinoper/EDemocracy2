package com.example.focus.e_democracy;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class ProjectBuilderPageTwo extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_createproject2);
        getSupportActionBar().setTitle("Create proposal");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //add location button code

        //take a photo button code
        final ImageView takePhoto = findViewById(R.id.take_photo_id);
        takePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_IMAGE_CAPTURE = 1;
                 Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                        startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                    }
                }

        });

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
                Intent intent = new Intent(getApplicationContext(), ProjectBuilderPageThree.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}