package com.example.clinicadental.logic;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.clinicadental.R;
import com.example.clinicadental.controllers.FrCogerCita;
import com.example.clinicadental.controllers.recyclerView.CitaAdapter;
import com.example.clinicadental.controllers.recyclerView.RecetaAdapter;
import com.example.clinicadental.models.Cita;
import com.example.clinicadental.models.CitaStore;
import com.example.clinicadental.models.Farmacopea;
import com.example.clinicadental.models.Paciente;
import com.example.clinicadental.models.Receta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class LogicCita {

    public static void listByCita(Paciente oPaciente, Context oContext, View view){

        String url = ILogic.hosting + "proyecto/Cita/lst_cita_by_idpaciente.php?iID_Paciente=" + oPaciente.getID_Paciente();
        Log.d("juan", url);

        Volley.newRequestQueue(oContext).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    if (s.equals("null")) {
                        Log.d("juan", s);
                        //Toast.makeText(oContext, "No se ha podido crear el usuario", Toast.LENGTH_SHORT).show();
                    } else {
                        Log.d("juan", s);
                        CitaStore.listCita = new Gson().fromJson(s, new TypeToken<List<Cita>>() {}.getType());

                        if(CitaStore.listCita.size() > 0){
                            view.findViewById(R.id.lblCitasInicio).setVisibility(View.INVISIBLE);

                            RecyclerView recyclerView = view.findViewById(R.id.rvCitasInicio);
                            recyclerView.setLayoutManager(new LinearLayoutManager(oContext));

                            CitaAdapter oCitaAdapter = new CitaAdapter(oContext);
                            recyclerView.setAdapter(oCitaAdapter);

                        }

                    }

                }, volleyError -> {
            Log.d("Volley Error", volleyError.toString());
        }
        ));

    }

    public static void insertar(Cita oCita, Context oContext, View view){

        String url = ILogic.hosting + "proyecto/Cita/ins_cita.php?sDia=" + oCita.getDia()
                + "&sHora=" + oCita.getHora()
                + "&sOperacion=" + oCita.getOperacion()
                + "&bTerminada=" + oCita.getTerminada()
                + "&iID_Medico=" + oCita.getId_Medico()
                + "&iID_Paciente=" + oCita.getId_Paciente();
        Log.d("juan", url);

        Volley.newRequestQueue(oContext).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    if (s.equals("null")) {
                        Log.d("juan", s);
                        //Toast.makeText(oContext, "No se ha podido crear el usuario", Toast.LENGTH_SHORT).show();
                    } else {
                        Log.d("juan", s);

                        Toast.makeText(oContext, "Cita concertada", Toast.LENGTH_SHORT).show();
                        listByDia(oCita.getDia(), oContext, view);

                    }

                }, volleyError -> {
            Log.d("Volley Error", volleyError.toString());
        }
        ));

    }

    public static void borrar(int iID_Cita, Context oContext){

        String url = ILogic.hosting + "proyecto/Cita/del_cita.php?iID_Cita=" + iID_Cita;

        Volley.newRequestQueue(oContext).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    if (s.equals("null")) {
                        Log.d("juan", s);
                        //Toast.makeText(oContext, "No se ha podido crear el usuario", Toast.LENGTH_SHORT).show();
                    } else {
                        Log.d("juan", s);

                    }

                }, volleyError -> {
            Log.d("Volley Error", volleyError.toString());
        }
        ));

    }

    public static void listByDia(String sDia, Context oContext, View view){

        String url = ILogic.hosting + "proyecto/Cita/lst_cita_by_dia.php?sDia=" + sDia;
        Log.d("juan", url);

        Volley.newRequestQueue(oContext).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    if (s.equals("null")) {
                        //Toast.makeText(oContext, "No se ha podido crear el usuario", Toast.LENGTH_SHORT).show();
                    } else {
                        Button[] btnHoras = getBtnHoras();

                        // Reiniciar botones

                        for(Button oButton : btnHoras){
                            oButton.setEnabled(true);
                            oButton.setBackgroundColor(oContext.getResources().getColor(R.color.Azulito));
                        }

                        // Deshabilitar botones si hay cita a esa hora

                        List<Cita> lCitas = new ArrayList<>();
                        lCitas = new Gson().fromJson(s, new TypeToken<List<Cita>>() {}.getType());

                        lCitas.forEach(oCita -> {
                            boolean boSalir = false;
                            byte bContador = 0;

                            while(!boSalir){
                                if(oCita.getHora().equals(btnHoras[bContador].getText())){
                                    boSalir = true;
                                    btnHoras[bContador].setEnabled(false);
                                    btnHoras[bContador].setBackgroundColor(oContext.getResources().getColor(R.color.Rosita));
                                }else{
                                    bContador++;
                                }
                            }
                        });

                    }

                }, volleyError -> {
            Log.d("Volley Error", volleyError.toString());
        }
        ));

    }

    private static Button[] getBtnHoras(){

        return new Button[]{FrCogerCita.btn10, FrCogerCita.btn11, FrCogerCita.btn12, FrCogerCita.btn13,
                FrCogerCita.btn14, FrCogerCita.btn15, FrCogerCita.btn16, FrCogerCita.btn17};

    }

}
