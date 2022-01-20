package com.example.clinicadental.controllers;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clinicadental.R;
import com.example.clinicadental.controllers.recyclerView.RecetaAdapter;
import com.example.clinicadental.logic.LogicReceta;
import com.example.clinicadental.models.Farmacopea;

public class FrRecetario extends Fragment {

    public FrRecetario() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fr_recetario, container, false);

        rellenarLista(view);
        mostrarDatos(view);

        return view;
    }

    public void mostrarDatos(View view) {

        RecyclerView recyclerView = view.findViewById(R.id.rvRecetario);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        RecetaAdapter oRecetaAdapter = new RecetaAdapter(getContext());
        recyclerView.setAdapter(oRecetaAdapter);

    }

    private void rellenarLista(View view) {

        LogicReceta.listByPaciente(BottomNav.oPaciente, getContext(), view);

    }
}