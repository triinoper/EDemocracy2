package com.example.focus.e_democracy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;



public class MainActivity extends AppCompatActivity {

    private Home homeFragment;
    private Search searchFragment;
    private Bookmarks bookmarksFragment;
    private Profile profileFragment;
    private BottomNavigationView mMainNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //getActionBar().setDisplayHomeAsUpEnabled(true);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeFragment = new Home();
        final android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_id, homeFragment);
        fragmentTransaction.commit();
        mMainNav = findViewById(R.id.main_nav_ID);

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                android.app.FragmentManager fragmentManager = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                switch (item.getItemId()){

                    case R.id.nav_home :
                        homeFragment = new Home();
                        fragmentTransaction.replace(R.id.frame_id, homeFragment);
                        getSupportActionBar().setTitle("E-Democracy");
                        fragmentTransaction.commit();
                        return true;
                    case R.id.nav_search:
                        searchFragment = new Search();
                        fragmentTransaction.replace(R.id.frame_id, searchFragment);
                        getSupportActionBar().setTitle("Search proposals");
                        fragmentTransaction.commit();
                        return true;
                    case R.id.nav_create:
                        //setFragment(createFragment);
                        Intent intent = new Intent(getApplicationContext(), ProjectBuilderActivity.class);
                        startActivity(intent);
                        return true;
                    case R.id.nav_bookmarks:
                        bookmarksFragment = new Bookmarks();
                        fragmentTransaction.replace(R.id.frame_id, bookmarksFragment);
                        getSupportActionBar().setTitle("Bookmarks");
                        fragmentTransaction.commit();
                        return true;
                    case R.id.nav_profile:
                        profileFragment = new Profile();
                        fragmentTransaction.replace(R.id.frame_id, profileFragment);
                        getSupportActionBar().setTitle("Profile");
                        fragmentTransaction.commit();
                        return true;
                    default:
                        return false;

                }
            }
        });

        //pressing on the card leads to the full card view


    }

}
