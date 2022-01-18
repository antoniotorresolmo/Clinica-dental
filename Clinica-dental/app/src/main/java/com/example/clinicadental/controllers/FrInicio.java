package com.example.clinicadental.controllers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.clinicadental.R;

public class FrInicio extends Fragment {

    TextView lblTituloInicio;

    public FrInicio() {

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fr_inicio, container, false);

        lblTituloInicio = view.findViewById(R.id.lblTituloInicio);
        lblTituloInicio.setText("Hola " + BottomNav.oPaciente.getsNombre());

        getActivity().setTitle("Inicio");

        return view;
    }

    public void comprobarCitas() {



    }
}