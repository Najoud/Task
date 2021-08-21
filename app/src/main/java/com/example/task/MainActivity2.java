package com.example.task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;


import com.example.task.Fragment.first_fragment;
import com.example.task.Fragment.out_fragment;
import com.example.task.Fragment.second_fragment;
import com.example.task.Fragment.third_fragment;
import com.example.task.TabLayout.LoginFragment;
import com.example.task.databinding.ActivityMain2Binding;
import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);

//       Toolbar toolbar = findViewById(R.id.toolbar);
//       setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new BlankFragment()).commit();
        }

    }

    private void setSupportActionBar(Toolbar toolbar) {
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.a:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new first_fragment()).commit();
                break;
            case R.id.b:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new second_fragment()).commit();

                break;
            case R.id.c:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new third_fragment()).commit();

                break;
//            case R.id.d:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new third_fragment()).commit();
//
//                break;
//            case R.id.e:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new BlankFragment()).commit();
//
//                break;
//            case R.id.f:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new BlankFragment()).commit();
//
//                break;
            case R.id.g:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new LoginFragment()).commit();
                break;
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }


    }
}
