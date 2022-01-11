package com.example.vistas_perfil;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FrRegistro#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FrRegistro extends Fragment {


    public FrRegistro() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FrRegistro newInstance(String param1, String param2) {
        FrRegistro fragment = new FrRegistro();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fr_registro, container, false);
    }
}