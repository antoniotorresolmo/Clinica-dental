package com.example.clinicadental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.clinicadental.models.Paciente;
import com.google.android.material.textfield.TextInputLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainActivity extends AppCompatActivity {

    TextInputLayout txtUsuario;
    TextInputLayout txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnEntrar).setOnClickListener(v -> guardarUsuario());

    }

    private void guardarUsuario(){

        txtUsuario = findViewById(R.id.txtUsuario);
        txtPassword = findViewById(R.id.txtPasswordLogin);

        String sUsuario = txtUsuario.getEditText().getText().toString();
        String sPassword = txtPassword.getEditText().getText().toString();

        Paciente oPaciente = new Paciente(sUsuario, sPassword);

        System.out.println(sUsuario);

        try {
            try (FileOutputStream fos = this.openFileOutput(filename, Context.MODE_PRIVATE)) {
                fos.write(fileContents.toByteArray());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}