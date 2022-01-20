package com.example.clinicadental.models;

public class Receta {

    private int ID_Receta; // PK
    private String Descripcion; // NN
    private int ID_Medico; // NN
    private int ID_Paciente; // FK

    public int getID_Receta() {
        return ID_Receta;
    }

    public void setID_Receta(int ID_Receta) {
        if(ID_Receta > 0) {
            this.ID_Receta = ID_Receta;
        }
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        if(!descripcion.isEmpty() && descripcion.length() < 255){
            Descripcion = descripcion;
        }
    }

    public int getID_Medico() {
        return ID_Medico;
    }

    public void setID_Medico(int ID_Medico) {
        if(ID_Medico > 0){
            this.ID_Medico = ID_Medico;
        }
    }

    public int getID_Paciente() {
        return ID_Paciente;
    }

    public void setID_Paciente(int ID_Paciente) {
        if(ID_Paciente > 0){
            this.ID_Paciente = ID_Paciente;
        }
    }
}
