package com.example.clinicadental.models;

public class Cita {

    int ID_Cita; //PK
    String Dia; //NN
    String Hora; //NN
    String Operacion; //NN
    byte Terminada; // NN
    int ID_Medico; //FK
    int ID_Paciente; //FK

    public Cita(){}

    public Cita(int ID_Cita) {
        this.ID_Cita = ID_Cita;
    }

    public Cita(int ID_Cita, String Dia, String Hora, String Operacion, byte Terminada, int IDMedico, int ID_Paciente) {
        this.ID_Cita = ID_Cita;
        this.Dia = Dia;
        this.Hora = Hora;
        this.Operacion = Operacion;
        this.Terminada = Terminada;
        this.ID_Medico = IDMedico;
        this.ID_Paciente = ID_Paciente;
    }
    public Cita(String Dia, String Hora, String Operacion, byte Terminada, int IDMedico, int ID_Paciente) {
        this.Dia = Dia;
        this.Hora = Hora;
        this.Operacion = Operacion;
        this.Terminada = Terminada;
        this.ID_Medico = IDMedico;
        this.ID_Paciente = ID_Paciente;
    }

    public int getId_Cita() {
        return ID_Cita;
    }

    public void setId_Cita(int id_Cita) {
        this.ID_Cita = id_Cita;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getOperacion() {
        return Operacion;
    }

    public void setOperacion(String Operacion) {
        this.Operacion = Operacion;
    }

    public byte getTerminada() {
        return Terminada;
    }

    public void setTerminada(byte terminada) {
        Terminada = terminada;
    }

    public int getId_Medico() {
        return ID_Medico;
    }

    public void setId_Medico(int IDMedico) {
        this.ID_Medico = IDMedico;
    }

    public int getId_Paciente() {
        return ID_Paciente;
    }

    public void setId_Paciente(int ID_Paciente) {
        this.ID_Paciente = ID_Paciente;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "id_Cita=" + ID_Cita +
                ", dia='" + Dia + '\'' +
                ", hora='" + Hora + '\'' +
                ", operacion='" + Operacion + '\'' +
                ", id_Medico=" + ID_Medico +
                ", id_Paciente=" + ID_Paciente +
                '}';
    }
}
