package com.example.clinicadental;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FrInicio extends Fragment {

    public FrInicio() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fr_inicio, container, false);

        getActivity().setTitle("Inicio");

        return view;
    }
}