package com.example.clinicadental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.clinicadental.models.Paciente;

public class Registro extends AppCompatActivity {

    TextView txtNombreRegistro, txtApellidosRegistro, txtDniRegistro, txtUsuarioRegistro, txtContraRegistro, txtCorreoRegistro, txtTelefonoRegistro, txtDireccionRegistro;
    String hosting = "http://loschavalesdental.atwebpages.com/";
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

        String url = hosting + "proyecto/Paciente/ins_paciente.php?sId_Paciente=NULL" +
                "&sUsuario=" + oPaciente.getsUsuario() +
                "&sPassword=" + oPaciente.getsPassword() +
                "&sCorreo=" + oPaciente.getsCorreo() +
                "&sNombre=" + oPaciente.getsNombre() +
                "&sApellidos=" + oPaciente.getsApellidos() +
                "&sTelefono=" + oPaciente.getsTelefono() +
                "&sDireccion=" + oPaciente.getsDireccion() +
                "&sDNI=" + oPaciente.getsDNI();
        Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    if (s.equals("null")) {
                        Toast.makeText(getApplicationContext(), "No se ha podido crear el usuario", Toast.LENGTH_SHORT).show();
                    } else {
                        Log.d("prueba", s.toString());
                        Toast.makeText(getApplicationContext(), "El usuario ha sido creado con éxito", Toast.LENGTH_SHORT).show();
                    }
                }, volleyError -> {
            Toast.makeText(getApplicationContext(), volleyError.getMessage(), Toast.LENGTH_SHORT).show();
        }
        ));


    }

}