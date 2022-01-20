package com.example.clinicadental.controllers;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;

import com.example.clinicadental.R;
import com.example.clinicadental.logic.LogicCita;
import com.example.clinicadental.models.Cita;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FrCogerCita extends Fragment {

    final String OPERACION = "Consulta";
    String sFechaSeleccionada;
    String sFechaActual;
    CalendarView calendarView;
    public static Button btn10;
    public static Button btn11;
    public static Button btn12;
    public static Button btn13;
    public static Button btn14;
    public static Button btn15;
    public static Button btn16;
    public static Button btn17;

    public FrCogerCita() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fr_coger_cita, container, false);

        calendarView = view.findViewById(R.id.calendarView);
        btn10 = view.findViewById(R.id.btn10);
        btn11 = view.findViewById(R.id.btn11);
        btn12 = view.findViewById(R.id.btn12);
        btn13 = view.findViewById(R.id.btn13);
        btn14 = view.findViewById(R.id.btn14);
        btn15 = view.findViewById(R.id.btn15);
        btn16 = view.findViewById(R.id.btn16);
        btn17 = view.findViewById(R.id.btn17);

        // Deshabilitar fechas anteriores

        calendarView.setMinDate(System.currentTimeMillis() - 1000);

        // Evento calendario

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {

                String sDia = String.valueOf(dayOfMonth);
                String sMes;

                if(month < 10){
                    sMes = "0" + String.valueOf(month+1);
                }else{
                    sMes = String.valueOf(month+1);
                }

                String sYear = String.valueOf(year);

                sFechaSeleccionada = sDia + "/" + sMes + "/" + sYear;

                mostrarHorasDisponibles(sFechaSeleccionada, view);

            }
        });

        // Eventos botones

        btn10.setOnClickListener(v -> {

            horaSeleccionada("10:00", view);

        });

        btn11.setOnClickListener(v -> {

            horaSeleccionada("11:00", view);

        });

        btn12.setOnClickListener(v -> {

            horaSeleccionada("12:00", view);

        });

        btn13.setOnClickListener(v -> {

            horaSeleccionada("13:00", view);

        });

        btn14.setOnClickListener(v -> {

            horaSeleccionada("14:00", view);

        });

        btn15.setOnClickListener(v -> {

            horaSeleccionada("15:00", view);

        });

        btn16.setOnClickListener(v -> {

            horaSeleccionada("16:00", view);

        });

        btn17.setOnClickListener(v -> {

            horaSeleccionada("17:00", view);

        });

        getFechaActual();
        mostrarHorasDisponibles(sFechaActual, view);

        return view;
    }

    private void horaSeleccionada(String sHora, View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Confirmación");
        builder.setMessage("¿Desea coger cita a esta hora?");

        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                String sFecha = insertarCita(sHora, view);
                mostrarHorasDisponibles(sFecha, view);
            }
        });
        builder.setNegativeButton("Cancelar", null);
        builder.show();

    }

    private String insertarCita(String sHora, View view) {

        String sFecha;

        if(sFechaSeleccionada != null){
            sFecha = sFechaSeleccionada;
        }else{
            sFecha = sFechaActual;
        }

        LogicCita.insertar(new Cita(sFecha, sHora, OPERACION, (byte) 0, 1, BottomNav.oPaciente.getID_Paciente()), getContext(), view);

        return sFecha;

    }

    private void getFechaActual(){

        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        sFechaActual = df.format(c);

    }

    private void mostrarHorasDisponibles(String sDia, View view){

        LogicCita.listByDia(sDia, getContext(), view);

    }

}