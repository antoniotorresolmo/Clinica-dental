package com.example.clinicadental.controllers;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import com.example.clinicadental.R;
import com.example.clinicadental.controllers.BottomNav;
import com.example.clinicadental.controllers.Registro;
import com.example.clinicadental.logic.LogicPaciente;
import com.example.clinicadental.models.Paciente;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextInputLayout txtUsuario;
    TextInputLayout txtPassword;
    Paciente oPaciente;
    CheckBox chbRecordar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsuario =  findViewById(R.id.txtUsuario);
        txtPassword = findViewById(R.id.txtPasswordLogin);

        cargarPreferencias();

        findViewById(R.id.btnRegistrar).setOnClickListener(v-> {
            Intent ventana = new Intent(MainActivity.this, Registro.class);
            startActivity(ventana);
        });

        findViewById(R.id.btnEntrar).setOnClickListener(v-> {
            LogicPaciente.obtenerUsuario(MainActivity.this, txtUsuario.getEditText().getText().toString(), txtPassword.getEditText().getText().toString());


            guardarPreferencias();
        });

    }

    private void cargarPreferencias(){

        chbRecordar = findViewById(R.id.chbRecordar);

        SharedPreferences oSharedPreferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);

        String sUsuario = oSharedPreferences.getString("sUsuario", "");
        String sPassword = oSharedPreferences.getString("sPassword", "");

        if(!sUsuario.isEmpty()){
            chbRecordar.setChecked(true);
        }

        txtUsuario.getEditText().setText(sUsuario);
        txtPassword.getEditText().setText(sPassword);

    }

    private void guardarPreferencias(){

        SharedPreferences oSharedPreferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);

        String sUsuario = txtUsuario.getEditText().getText().toString();
        String sPassword = txtPassword.getEditText().getText().toString();

        SharedPreferences.Editor oSPEditor = oSharedPreferences.edit();

        oSPEditor.putString("sUsuario", sUsuario);
        oSPEditor.putString("sPassword", sPassword);

        oSPEditor.commit();

    }

    private void mostrarEste() {
        Toast.makeText(getApplicationContext(), oPaciente.toString(), Toast.LENGTH_SHORT).show();
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