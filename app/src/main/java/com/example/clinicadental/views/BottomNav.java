package com.example.clinicadental.views;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.clinicadental.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        loadFragment(new FrInicio());

    }

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.itemInicio:
                    loadFragment(new FrInicio());
                    return true;
                case R.id.itemCogerCita:
                    loadFragment(new FrCogerCita());
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment oFragment){

        FragmentManager oFragmentManager = getSupportFragmentManager();
        FragmentTransaction oFragmentTransaction = oFragmentManager.beginTransaction();
        oFragmentTransaction.add(R.id.frame_container, oFragment);
        //FragmentTransaction.addToBackStack(null);

        oFragmentTransaction.commit();

    }

}