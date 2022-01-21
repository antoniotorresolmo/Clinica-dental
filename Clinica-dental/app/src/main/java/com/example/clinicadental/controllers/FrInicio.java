package com.example.clinicadental.controllers;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clinicadental.R;
import com.example.clinicadental.logic.LogicCita;
import com.example.clinicadental.models.CitaStore;

public class FrInicio extends Fragment {

    TextView lblTituloInicio;
    RecyclerView rvCitasInicio;

    public FrInicio() {

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fr_inicio, container, false);

        lblTituloInicio = view.findViewById(R.id.lblTituloInicio);
        rvCitasInicio = view.findViewById(R.id.rvCitasInicio);

        lblTituloInicio.setText("Hola " + BottomNav.oPaciente.getNombre());

        comprobarCitas(view);

        return view;
    }

    public static void confirmarCancelacion(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Confirmación");
        builder.setMessage("¿Desea cancelar esta cita?");

        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                //cancelarCita();
            }
        });
        builder.setNegativeButton("Cancelar", null);
        builder.show();

    }

    private void cancelarCita() {

        LogicCita.borrar(3, getContext());

    }

    public void comprobarCitas(View view) {

        LogicCita.listByCita(BottomNav.oPaciente, getContext(), view);

    }
}