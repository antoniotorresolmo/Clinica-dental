package com.example.clinicadental.controllers;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.clinicadental.R;
import com.example.clinicadental.models.Paciente;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNav extends AppCompatActivity {

    private boolean firstTime = true;
    public static Paciente oPaciente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

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

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == event.KEYCODE_BACK) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setMessage("¿Desea salir de Clinica Dental Los Chavales?")
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent intent = new Intent(Intent.ACTION_MAIN);
                            intent.addCategory(Intent.CATEGORY_HOME);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                            startActivity(intent);

                        }
                    })
                    .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });

            builder.show();
        }

        return super.onKeyDown(keyCode, event);
    }

}