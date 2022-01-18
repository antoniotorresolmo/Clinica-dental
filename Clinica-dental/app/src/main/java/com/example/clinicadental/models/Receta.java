package com.example.clinicadental.models;

public class Receta {

    private int id_Receta; //PK
    private String descripcion; //NN
    private Medico id_Medico; //NN
    private Paciente id_Paciente; //FK

}
