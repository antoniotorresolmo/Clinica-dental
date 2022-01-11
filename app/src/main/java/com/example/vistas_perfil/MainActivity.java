package com.example.vistas_perfil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        FrPerfil frPerfil = new FrPerfil();
        FragmentManager oFragmentManger = getSupportFragmentManager();
        FragmentTransaction oFragmentTransaction = oFragmentManger.beginTransaction();
        oFragmentTransaction.add(R.id.frgContainer, frPerfil, null);
        oFragmentTransaction.commit();
    }
}