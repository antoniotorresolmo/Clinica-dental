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

        File oFile = new File("rem/savedUser.obj");

        txtUsuario = findViewById(R.id.txtUsuario);
        txtPassword = findViewById(R.id.txtPasswordLogin);

        String sUsuario = txtUsuario.getEditText().getText().toString();
        String sPassword = txtPassword.getEditText().getText().toString();

        Paciente oPaciente = new Paciente(sUsuario, sPassword);

        System.out.println(sUsuario);

        try {
            FileOutputStream fosFichero = new FileOutputStream(oFile);
            ObjectOutputStream oosBuffer = new ObjectOutputStream(fosFichero);

            oosBuffer.writeObject(oPaciente);

            oosBuffer.close();
            fosFichero.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}