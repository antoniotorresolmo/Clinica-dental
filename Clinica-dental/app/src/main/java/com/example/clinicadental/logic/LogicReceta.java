package com.example.clinicadental.logic;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.clinicadental.R;
import com.example.clinicadental.controllers.BottomNav;
import com.example.clinicadental.controllers.recyclerView.RecetaAdapter;
import com.example.clinicadental.models.Farmacopea;
import com.example.clinicadental.models.Paciente;
import com.example.clinicadental.models.Receta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class LogicReceta {

    public static void listByPaciente(Paciente oPaciente, Context oContext, View view){

        String url = ILogic.hosting + "proyecto/Receta/lst_receta_by_idpaciente.php?iID_Paciente=" + oPaciente.getID_Paciente();
        Log.d("juan", url);

        Volley.newRequestQueue(oContext).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    if (s.equals("null")) {
                        Log.d("juan", s);
                        //Toast.makeText(oContext, "No se ha podido crear el usuario", Toast.LENGTH_SHORT).show();
                    } else {
                        Log.d("juan", s);
                        Farmacopea.lRecetas = new Gson().fromJson(s, new TypeToken<List<Receta>>() {}.getType());

                        if(Farmacopea.lRecetas.size() > 0){
                            view.findViewById(R.id.lblRecetarioVacio).setVisibility(View.INVISIBLE);

                            RecyclerView recyclerView = view.findViewById(R.id.rvRecetario);
                            recyclerView.setLayoutManager(new LinearLayoutManager(oContext));

                            RecetaAdapter oRecetaAdapter = new RecetaAdapter(oContext);
                            recyclerView.setAdapter(oRecetaAdapter);

                            Log.d("juan", Farmacopea.lRecetas.size() + "");
                        }

                    }

                }, volleyError -> {
                    Log.d("Volley Error", volleyError.toString());
                }
        ));

    }

}
