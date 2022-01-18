package com.example.clinicadental;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import com.example.clinicadental.models.Paciente;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String Hosting = "http://loschavalesdental.atwebpages.com";
    TextInputLayout txtUsuario;
    Paciente oPaciente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btnRegistrar).setOnClickListener(v-> {
            Intent ventana = new Intent(MainActivity.this, Registro.class);
            startActivity(ventana);
        });

        findViewById(R.id.btnEntrar).setOnClickListener(v-> {
        obtenerEste();
        });

    }



    private void obtenerEste() {
        txtUsuario =  findViewById(R.id.txtUsuario);
        String url = Hosting + "/proyecto/Paciente/get_usuario.php?sUsuario=" + txtUsuario.getEditText().getText().toString();


        Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, url,

                s -> {

                    if (s.equals("null")) {
                        Toast.makeText(getApplicationContext(), "No se ha encontrado.", Toast.LENGTH_SHORT).show();
                    } else {

                     
                        oPaciente  = new Gson().fromJson(s, new TypeToken<Paciente>() {
                        }.getType());

                        Log.d("Antonio",oPaciente.toString());
                        Toast.makeText(getApplicationContext(), oPaciente.toString(), Toast.LENGTH_SHORT).show();

                    }

                }, volleyError -> {

        }


        ));
    }


    private void mostrarEste() {
        Toast.makeText(getApplicationContext(), oPaciente.toString(), Toast.LENGTH_SHORT).show();

    }

}