package com.example.vistas_perfil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        FrPerfil frPerfil = new FrPerfil();
        FragmentManager oFragmentManger = getSupportFragmentManager();
        FragmentTransaction oFragmentTransaction = oFragmentManger.beginTransaction();
        oFragmentTransaction.add(R.id.frgContainer, frPerfil, null);
        oFragmentTransaction.commit();
    }
}