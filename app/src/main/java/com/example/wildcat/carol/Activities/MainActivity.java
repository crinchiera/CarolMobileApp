package com.example.wildcat.carol.Activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.wildcat.carol.Fragments.ChoreBucketFragment;
import com.example.wildcat.carol.Fragments.ChoresFragment;
import com.example.wildcat.carol.Fragments.ChoresFragment2;
import com.example.wildcat.carol.Fragments.GroceriesFragment;
import com.example.wildcat.carol.Fragments.HouseFragment;
import com.example.wildcat.carol.Fragments.MessagesFragment;
import com.example.wildcat.carol.Fragments.ProgressFragment;
import com.example.wildcat.carol.Fragments.SettingsFragment;
import com.example.wildcat.carol.Models.UserProfile;
import com.example.wildcat.carol.R;
import com.mingle.entity.MenuEntity;
import com.mingle.sweetpick.BlurEffect;
import com.mingle.sweetpick.RecyclerViewDelegate;
import com.mingle.sweetpick.SweetSheet;

import java.util.ArrayList;
import java.util.Hashtable;

import roboguice.activity.RoboActionBarActivity;
import roboguice.fragment.support.SupportFragmentUtil;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

public class MainActivity extends RoboActionBarActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static UserProfile michael, danny, jeff, matt, jeremy;
    public static Hashtable bucket = new Hashtable();

    @InjectView(R.id.toolbar) Toolbar toolbar;
    @InjectView(R.id.fab) FloatingActionButton fab;
    @InjectView(R.id.drawer_layout) DrawerLayout drawer;
    @InjectView(R.id.nav_view) NavigationView navigationView;
    @InjectView(R.id.app_bar) CoordinatorLayout rl;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(toolbar);

        michael = new UserProfile();
        danny = new UserProfile();
        jeff = new UserProfile();
        matt = new UserProfile();
        jeremy = new UserProfile();

        michael.toDoList = new Hashtable();
        danny.toDoList = new Hashtable();
        jeff.toDoList = new Hashtable();
        matt.toDoList = new Hashtable();
        jeremy.toDoList = new Hashtable();

        michael.completedList = new Hashtable();
        jeff.completedList = new Hashtable();
        jeremy.completedList = new Hashtable();
        danny.completedList = new Hashtable();
        matt.completedList = new Hashtable();

        michael.toDO = 0;
        matt.toDO = 0;
        jeff.toDO = 0;
        jeremy.toDO = 0;
        danny.toDO = 0;

        michael.coins = 0;
        matt.coins = 10;
        jeff.coins = 24;
        jeremy.coins = 15;
        danny.coins = 0;

        bucket.put("Take Out Trash", "Take Out Trash");
        bucket.put("Do Dishes", "Do Dishes");
        bucket.put("Clean Living Room", "Clean Living Room");
        bucket.put("Clean Kitchen", "Clean Kitchen");
        bucket.put("Clean Bathroom", "Clean Bathroom");




        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction().addToBackStack("choresFragment");
        fragmentTransaction.replace(R.id.frame_layout, new ChoresFragment());
        fragmentTransaction.commit();


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction().addToBackStack("choresFragment");
                fragmentTransaction.replace(R.id.frame_layout, new ChoreBucketFragment());
                fragmentTransaction.commit();
            }
        });

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);


    }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }



        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment fragment;

        int id = item.getItemId();

        if (id == R.id.nav_house) {
            // Handle the camera action
            fragment = new HouseFragment();

        } else if (id == R.id.nav_chores) {
            fragment = new ChoresFragment();

        } else if (id == R.id.nav_groceries) {
            fragment = new GroceriesFragment();

        } else if (id == R.id.nav_messages) {
            fragment = new MessagesFragment();

        } else if (id == R.id.nav_progress) {
            fragment = new ProgressFragment();

        } else if (id == R.id.nav_settings) {
            fragment = new SettingsFragment();
        }
        else{
            fragment = new ChoresFragment();
        }



        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction().addToBackStack("fragment");
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }







}


