package com.example.clinicadental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    TextView txtUsuario, txtPasswordRegistro, txtCorreo, txtTelefono, txtDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        findViewById(R.id.btnRegistrar).setOnClickListener(v->{
            cogerDatos();
        });

    }

    private void cogerDatos() {
        String usuario = txtUsuario.getText().toString();
        String pass = txtPasswordRegistro.getText().toString();
        String correo = txtCorreo.getText().toString();
        String telefono = txtTelefono.getText().toString();
        String direccion = txtDireccion.getText().toString();

        Paciente oPaciente = new
    }
}