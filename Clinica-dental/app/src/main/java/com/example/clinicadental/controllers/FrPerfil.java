package com.example.clinicadental.controllers;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.clinicadental.R;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

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
        View view = inflater.inflate(R.layout.fragment_fr_perfil, container, false);
        Button btnModificar = view.findViewById(R.id.btnModificar);
        Button btnGuardar = view.findViewById(R.id.btnGuardar);
        Button btnCancelar = view.findViewById(R.id.btnCancelar);


        btnGuardar.setVisibility(view.INVISIBLE);
        btnCancelar.setVisibility(view.INVISIBLE);
        editables(view, false, false);
        cargar(view);
        btnModificar.setOnClickListener(v->{

            btnGuardar.setVisibility(view.VISIBLE);
            btnCancelar.setVisibility(view.VISIBLE);
            btnModificar.setVisibility(view.INVISIBLE);

            editables(view, true , false);
        });

        btnGuardar.setOnClickListener(v->{
            editables (view, false, true);
            btnGuardar.setVisibility(view.INVISIBLE);
            btnCancelar.setVisibility(view.INVISIBLE);
            btnModificar.setVisibility(view.VISIBLE);

        });

        btnCancelar.setOnClickListener(v->{
            editables (view, false, false);
            btnGuardar.setVisibility(view.INVISIBLE);
            btnCancelar.setVisibility(view.INVISIBLE);
            btnModificar.setVisibility(view.VISIBLE);

        });
        return view;
    }

    private void editables (View view, Boolean bEdit, Boolean bUpd){

        TextInputLayout txtUsuario = view.findViewById(R.id.txtUsuarioRegistro);
        txtUsuario.setEnabled(bEdit);

        TextInputLayout txtPassword = view.findViewById(R.id.txtContraRegistro);
        if (bEdit == true){
            txtPassword.getEditText().setInputType(0);
        } else {
            txtPassword.getEditText().setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
        txtPassword.setEnabled(bEdit);

        TextInputLayout txtCorreo = view.findViewById(R.id.txtCorreoRegistro);
        txtCorreo.setEnabled(bEdit);

        TextInputLayout txtTelefono = view.findViewById(R.id.txtTlfRegistro);
        txtTelefono.setEnabled(bEdit);

        TextInputLayout txtDirección = view.findViewById(R.id.txtDireccionRegistro);
        txtDirección.setEnabled(bEdit);


        if (bEdit == false && bUpd == true){

            BottomNav.oPaciente.setUsuario(txtUsuario.getEditText().getText().toString());

            BottomNav.oPaciente.setPassword(txtPassword.getEditText().getText().toString());

            BottomNav.oPaciente.setCorreo(txtCorreo.getEditText().getText().toString());

            BottomNav.oPaciente.setTelefono(txtTelefono.getEditText().getText().toString());

            BottomNav.oPaciente.setDireccion(txtDirección.getEditText().getText().toString());

            com.example.clinicadental.logic.LogicPaciente.update(getContext());

        }






    }

    private void cargar (View view){

        TextInputLayout txtUsuario = view.findViewById(R.id.txtUsuarioRegistro);
        txtUsuario.getEditText().setText(BottomNav.oPaciente.getUsuario());

        TextInputLayout txtPassword = view.findViewById(R.id.txtContraRegistro);
        txtPassword.getEditText().setText(BottomNav.oPaciente.getPassword());

        TextInputLayout txtCorreo = view.findViewById(R.id.txtCorreoRegistro);
        txtCorreo.getEditText().setText(BottomNav.oPaciente.getCorreo());

        TextInputLayout txtTelefono = view.findViewById(R.id.txtTlfRegistro);
        txtTelefono.getEditText().setText(BottomNav.oPaciente.getTelefono());

        TextInputLayout txtDirección = view.findViewById(R.id.txtDireccionRegistro);
        txtDirección.getEditText().setText(BottomNav.oPaciente.getDireccion());

    }

}