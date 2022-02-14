package com.example.clinicadental.logic;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.clinicadental.controllers.BottomNav;
import com.example.clinicadental.models.Paciente_Medico;

public class LogicPacienteMedico {

    public static void getByIdPacient() {

        String url = ILogic.hosting + "proyecto/Paciente/ins_paciente.php?";

    }

    public static void insertar(Paciente_Medico oPacienteMedico, Context oContext){

        String url = ILogic.hosting + "proyecto/Paciente_Medico/ins_paciente_medico.php?iID_Paciente="
                + oPacienteMedico.getoPaciente().getID_Paciente()
                + "&iID_Medico=" + oPacienteMedico.getoMedico().getId_Medico();

        Volley.newRequestQueue(oContext).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    if (s.equals("null") || s.contains("Duplicate")) {
                        Log.d("juan",s);
                    } else {
                        Log.d("juan", "PacienteMedico insertado");
                    }
                }, volleyError -> {
            Toast.makeText(oContext, volleyError.getMessage(), Toast.LENGTH_SHORT).show();
        }
        ));

    }

}
