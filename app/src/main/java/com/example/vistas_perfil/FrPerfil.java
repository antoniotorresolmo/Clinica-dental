package com.example.vistas_perfil;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FrPerfil#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FrPerfil extends Fragment {


    public FrPerfil() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FrPerfil newInstance(String param1, String param2) {
        FrPerfil fragment = new FrPerfil();

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
        return inflater.inflate(R.layout.fragment_fr_perfil, container, false);
    }
}