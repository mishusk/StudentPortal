package com.skmishu.studentportal;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.skmishu.studentportal.fragment.FragTodayClassSchedule;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Fragment currentFragment;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentAndToolbarManager();
        initNavigationDrawer();
    }

    private void initToolbarManager(String toolbarTitleName) {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(toolbarTitleName);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorToolbarText));
        setSupportActionBar(toolbar);
    }

    private void initNavigationDrawer() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(MainActivity.this);
    }

    private void fragmentAndToolbarManager() {
        currentFragment = new FragTodayClassSchedule();
        manager = getFragmentManager();
        fragmentTransitionManager(currentFragment);
        initToolbarManager(getResources().getString(R.string.configureClassFragment));
    }

    private void fragmentTransitionManager(Fragment currentFragment) {
        transaction = manager.beginTransaction();
        transaction.replace(R.id.fragmentContainer, currentFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
