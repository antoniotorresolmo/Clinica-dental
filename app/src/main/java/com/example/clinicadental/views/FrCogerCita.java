package com.example.clinicadental.views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clinicadental.R;


public class FrCogerCita extends Fragment {

    public FrCogerCita() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fr_coger_cita, container, false);

        getActivity().setTitle("Coger cita");

        return view;
    }
}