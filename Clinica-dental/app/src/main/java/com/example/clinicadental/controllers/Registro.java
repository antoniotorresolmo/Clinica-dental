package com.example.clinicadental.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.clinicadental.R;
import com.example.clinicadental.models.Paciente;
import com.example.*;

public class Registro extends AppCompatActivity {

    TextView txtNombreRegistro, txtApellidosRegistro, txtDniRegistro, txtUsuarioRegistro, txtContraRegistro, txtCorreoRegistro, txtTelefonoRegistro, txtDireccionRegistro;
    public static Paciente oPaciente = new Paciente();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtNombreRegistro = findViewById(R.id.txtNombre);
        txtApellidosRegistro = findViewById(R.id.txtApellidos);
        txtDniRegistro = findViewById(R.id.txtDni);
        txtUsuarioRegistro = findViewById(R.id.txtUsuario);
        txtContraRegistro = findViewById(R.id.txtPasswordLogin);
        txtCorreoRegistro = findViewById(R.id.txtCorreo);
        txtTelefonoRegistro = findViewById(R.id.txtTelefono);
        txtDireccionRegistro = findViewById(R.id.txtDireccion);

        findViewById(R.id.btnRegistro).setOnClickListener(v -> {
            cogerDatos();
            insert();
        });

    }

    private void cogerDatos() {

        oPaciente.setsNombre(txtNombreRegistro.getText().toString());
        oPaciente.setsApellidos(txtApellidosRegistro.getText().toString());
        oPaciente.setsDNI(txtDniRegistro.getText().toString());
        oPaciente.setsUsuario(txtUsuarioRegistro.getText().toString());
        oPaciente.setsPassword(txtContraRegistro.getText().toString());
        oPaciente.setsCorreo(txtCorreoRegistro.getText().toString());
        oPaciente.setsTelefono(txtTelefonoRegistro.getText().toString());
        oPaciente.setsDireccion(txtDireccionRegistro.getText().toString());

    }

    private void insert() {

        com.example.clinicadental.logic.LogicPaciente.insert(oPaciente, this);

    }

}