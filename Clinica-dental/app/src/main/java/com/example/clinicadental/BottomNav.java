package com.example.clinicadental;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNav extends AppCompatActivity {

    private boolean firstTime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //navigation.setSelectedItemId(navigation.getSelectedItemId());



    }

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.itemInicio:
                    loadFragment(new FrInicio());
                    return true;
                case R.id.itemContacta:
                    loadFragment(new FrContacta());
                    return true;
                case R.id.itemRecetario:
                    loadFragment(new FrRecetario());
                    return true;
                case R.id.itemPerfil:
                    loadFragment(new FrPerfil());
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