package com.example.clinicadental.models;

import java.util.Objects;

public class Paciente_Medico {

    Medico oMedico; // PK FK
    Paciente oPaciente; // PK FK

    public Paciente_Medico(){}

    public Paciente_Medico(Medico oMedico, Paciente oPaciente) {
        this.setoMedico(oMedico);
        this.setoPaciente(oPaciente);
    }

    public Medico getoMedico() {
        return oMedico;
    }

    public void setoMedico(Medico oMedico) {
        if(oMedico != null){
            this.oMedico = oMedico;
        }
    }

    public Paciente getoPaciente() {
        return oPaciente;
    }

    public void setoPaciente(Paciente oPaciente) {
        if(oPaciente != null){
            this.oPaciente = oPaciente;
        }
    }

    public boolean equals(Object o) {
        boolean boIgual = false;
        Paciente_Medico that = (Paciente_Medico) o;
        if(that.getoMedico().equals(this.getoMedico()) && that.getoPaciente().equals(this.getoPaciente())){
            boIgual = true;
        }
        return boIgual;
    }

    public int hashCode() {
        return Objects.hash(oMedico, oPaciente);
    }

    public String toString() {
        return "Paciente_Medico{" +
                "oMedico=" + oMedico +
                ", oPaciente=" + oPaciente +
                '}';
    }
}
