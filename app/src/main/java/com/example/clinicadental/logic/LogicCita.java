package com.example.clinicadental.logic;

import android.content.Context;
import android.util.Log;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.clinicadental.R;
import com.example.clinicadental.controllers.recyclerView.CitaAdapter;
import com.example.clinicadental.controllers.recyclerView.RecetaAdapter;
import com.example.clinicadental.models.Cita;
import com.example.clinicadental.models.CitaStore;
import com.example.clinicadental.models.Farmacopea;
import com.example.clinicadental.models.Paciente;
import com.example.clinicadental.models.Receta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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

                            Log.d("juan", CitaStore.listCita.size() + "");
                        }

                    }

                }, volleyError -> {
            Log.d("Volley Error", volleyError.toString());
        }
        ));

    }

}
