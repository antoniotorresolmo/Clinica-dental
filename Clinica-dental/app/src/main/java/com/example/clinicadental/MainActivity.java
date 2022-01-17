package com.example.clinicadental;

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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String Hosting = "http://loschavalesden;tal.atwebpages.com"
    EditText txtId;
    TextView lblResultado;
    coche Coche;
    List<coche> lCoche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btnRegistrar).setOnClickListener(v-> {
            Intent ventana = new Intent(MainActivity.this, Registro.class);
            startActivity(ventana);
        });

        findViewById(R.id.btnEntrar).setOnClickListener(v-> {

        });

    }



    private void obtenerEste() {

        String url = Hosting + "/ansony/get-coche.php?txtId=" + txtId.getText().toString();
        Log.i("DAVI", url);

        Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, url,

                s -> {

                    if (s.equals("null")) {
                        Toast.makeText(getApplicationContext(), "No se ha encontrado.", Toast.LENGTH_SHORT).show();
                    } else {

                        Coche = new Gson().fromJson(s, new TypeToken<coche>() {
                        }.getType());
                        mostrarEste();

                    }


                }, volleyError -> {


        }


        ));
    }

    private void obtenerTodos() {

        String url = Hosting + "/ansony/lst-coche.php";
        Log.i("DAVI", url);

        Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, url,

                s -> {

                    if (s.equals("null")) {
                        Toast.makeText(getApplicationContext(), "No se ha encontrado.", Toast.LENGTH_SHORT).show();
                    } else {
                        lCoche = new ArrayList<>();
                        lCoche = new Gson().fromJson(s, new TypeToken<List<coche>>() {
                        }.getType());
                        mostrarTodos();

                    }


                }, volleyError -> {


        }


        ));
    }

    private void mostrarEste() {
        lblResultado.setText(Coche.toString());
    }

    private void mostrarTodos() {
        StringBuffer sb = new StringBuffer();

        lCoche.forEach(coche ->
                sb.append(coche.toString() + "\n"));
        lblResultado.setText(sb);
    }

}