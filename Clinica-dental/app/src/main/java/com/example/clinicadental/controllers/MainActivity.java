package com.example.clinicadental.controllers;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
            obtenerEste();
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

    private void obtenerEste() {

        oPaciente = (Paciente) LogicPaciente.obtenerUsuario(this, txtUsuario.getEditText().getText().toString());
        if (oPaciente != null) {
            comprobarUsuario();
        }
    }

    private void comprobarUsuario() {


        String contraseña = txtPassword.getEditText().getText().toString();

        if (oPaciente.getPassword().equals(contraseña)) {

            BottomNav.oPaciente = oPaciente;
            Intent ventana = new Intent(this, BottomNav.class);
            startActivity(ventana);

        }

    }

    private void mostrarEste() {
        Toast.makeText(getApplicationContext(), oPaciente.toString(), Toast.LENGTH_SHORT).show();
    }

}