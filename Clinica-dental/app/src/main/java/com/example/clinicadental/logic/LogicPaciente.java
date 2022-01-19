package com.example.clinicadental.logic;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.clinicadental.R;
import com.example.clinicadental.controllers.BottomNav;
import com.example.clinicadental.models.Paciente;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LogicPaciente {

    private static Paciente oPaciente1;
    public static void insert(Paciente oPaciente, Context oContext){

        String url = ILogic.hosting + "proyecto/Paciente/ins_paciente.php?" +
                "&sUsuario=" + oPaciente.getUsuario() +
                "&sPassword=" + oPaciente.getPassword() +
                "&sCorreo=" + oPaciente.getCorreo() +
                "&sNombre=" + oPaciente.getNombre() +
                "&sApellidos=" + oPaciente.getApellidos() +
                "&sTelefono=" + oPaciente.getTelefono() +
                "&sDireccion=" + oPaciente.getDireccion() +
                "&sDNI=" + oPaciente.getDNI();

        Volley.newRequestQueue(oContext).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    if (s.equals("null") || s.contains("Duplicate")) {
                        Log.d("juan",s);
                        Toast.makeText(oContext, "No se ha podido crear el usuario", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(oContext, "El usuario ha sido creado con éxito", Toast.LENGTH_SHORT).show();
                        BottomNav.oPaciente = oPaciente;
                        Intent ventana = new Intent(oContext, BottomNav.class);
                        oContext.startActivity(ventana);
                    }
                }, volleyError -> {
            Toast.makeText(oContext, volleyError.getMessage(), Toast.LENGTH_SHORT).show();
        }
        ));

    }

    public static void getByIdUser(Context oContext) {

        String url = ILogic.hosting +   "proyecto/Paciente/get_idpaciente_by_user.php?" +
                                        "sUsuario=" + BottomNav.oPaciente.getUsuario();

        Volley.newRequestQueue(oContext).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    if (s.equals("null") || s.contains("Duplicate")) {
                        Log.d("juan",s);
                    } else {
                        Paciente oPaciente = new Gson().fromJson(s, new TypeToken<Paciente>() {}.getType());
                    }
                }, volleyError -> {
            Toast.makeText(oContext, volleyError.getMessage(), Toast.LENGTH_SHORT).show();
        }
        ));

    }

    public static Object obtenerUsuario(Context oContext, String sUsuario){


        String url = ILogic.hosting + "/proyecto/Paciente/get_usuario.php?sUsuario=" + sUsuario;

        Volley.newRequestQueue(oContext).add(new StringRequest(Request.Method.GET, url,

                s -> {

                    if (s.equals("null")) {
                        Toast.makeText(oContext, "No se ha encontrado.", Toast.LENGTH_SHORT).show();
                    } else {

                       oPaciente1  = new Gson().fromJson(s, new TypeToken<Paciente>() {
                        }.getType());

                        Log.d("Antonio",oPaciente1.toString());

                    }

                }, volleyError -> {

        }


        ));


        return oPaciente1;
    }



    public static void update(Context oContext){

        String url = ILogic.hosting + "proyecto/Paciente/upd_paciente.php?" +
                "&sUsuario=" +  BottomNav.oPaciente.getUsuario() +
                "&sPassword=" +  BottomNav.oPaciente.getPassword() +
                "&sCorreo=" +  BottomNav.oPaciente.getCorreo() +
                "&sNombre=" +  BottomNav.oPaciente.getNombre() +
                "&sApellidos=" +  BottomNav.oPaciente.getApellidos() +
                "&sTelefono=" +  BottomNav.oPaciente.getTelefono() +
                "&sDireccion=" +  BottomNav.oPaciente.getDireccion() +
                "&sDNI=" +  BottomNav.oPaciente.getDNI() +
                "&sID_Paciente=" +  BottomNav.oPaciente.getID_Paciente();

        Volley.newRequestQueue(oContext).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    if (s.equals("null") || s.contains("Duplicate")) {
                        Log.d("juan",s);
                        Toast.makeText(oContext, "No se ha podido actualizar el usuario", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(oContext, "El usuario ha sido actualizado con éxito", Toast.LENGTH_SHORT).show();
                        Log.d("pepe",s);
                    }
                }, volleyError -> {
            Toast.makeText(oContext, volleyError.getMessage(), Toast.LENGTH_SHORT).show();
        }
        ));

    }


}
