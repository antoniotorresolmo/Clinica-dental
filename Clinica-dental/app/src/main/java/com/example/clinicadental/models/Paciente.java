package com.example.clinicadental.models;

import java.util.Objects;

public class Paciente {

    private int iID_Paciente; // PK
    private String sUsuario; // NN U
    private String sPassword; // NN
    private String sCorreo; // NN
    private String sNombre; // NN
    private String sApellidos;// NN
    private String sTelefono; // NN
    private String sDireccion; // NN
    private String sDNI; // NN

    public Paciente(){}

    public Paciente(int iID_Paciente) {
        this.setiID_Paciente(iID_Paciente);
    }

    public Paciente(String sUsuario, String sPassword) {
        this.sUsuario = sUsuario;
        this.sPassword = sPassword;
    }

    public Paciente(int iID_Paciente, String sUsuario, String sPassword, String sCorreo) {
        this.setiID_Paciente(iID_Paciente);
        this.setsUsuario(sUsuario);
        this.setsPassword(sPassword);
        this.setsCorreo(sCorreo);
    }

    public Paciente(int iID_Paciente, String sUsuario, String sPassword, String sCorreo, String sNombre, String sApellidos, String sTelefono, String sDireccion, String sDNI) {
        this.setiID_Paciente(iID_Paciente);
        this.setsUsuario(sUsuario);
        this.setsPassword(sPassword);
        this.setsCorreo(sCorreo);
        this.setsNombre(sNombre);
        this.setsApellidos(sApellidos);
        this.setsTelefono(sTelefono);
        this.setsDireccion(sDireccion);
        this.setsDNI(sDNI);
    }

    public int getiID_Paciente() {
        return iID_Paciente;
    }

    public void setiID_Paciente(int iID_Paciente) {
        if(iID_Paciente > 0){
            this.iID_Paciente = iID_Paciente;
        }
    }

    public String getsUsuario() {
        return sUsuario;
    }

    public void setsUsuario(String sUsuario) {
        if(!sUsuario.isEmpty() && sUsuario.length() < 255){
            this.sUsuario = sUsuario;
        }
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        if(!sUsuario.isEmpty() && sUsuario.length() < 20){
            this.sUsuario = sUsuario;
        }
    }

    public String getsCorreo() {
        return sCorreo;
    }

    public void setsCorreo(String sCorreo) {
        if(!sCorreo.isEmpty() && sCorreo.length() < 255){
            this.sCorreo = sCorreo;
        }
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        if(!sNombre.isEmpty() && sNombre.length() < 255){
            this.sNombre = sNombre;
        }
    }

    public String getsApellidos() {
        return sApellidos;
    }

    public void setsApellidos(String sApellidos) {
        if(!sApellidos.isEmpty() && sApellidos.length() < 255){
            this.sApellidos = sApellidos;
        }
    }

    public String getsTelefono() {
        return sTelefono;
    }

    public void setsTelefono(String sTelefono) {
        if(!sTelefono.isEmpty() && sTelefono.length() == 9){
            this.sTelefono = sTelefono;
        }
    }

    public String getsDireccion() {
        return sDireccion;
    }

    public void setsDireccion(String sDireccion) {
        if(!sDireccion.isEmpty() && sDireccion.length() < 255){
            this.sDireccion = sDireccion;
        }
    }

    public String getsDNI() {
        return sDNI;
    }

    public void setsDNI(String sDNI) {
        if(!sDNI.isEmpty() && sDNI.length() == 9){
            this.sDNI = sDNI;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return iID_Paciente == paciente.iID_Paciente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(iID_Paciente);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "iID_Paciente=" + iID_Paciente +
                ", sUsuario='" + sUsuario + '\'' +
                ", sPassword='" + sPassword + '\'' +
                ", sCorreo='" + sCorreo + '\'' +
                ", sNombre='" + sNombre + '\'' +
                ", sApellidos='" + sApellidos + '\'' +
                ", sTelefono='" + sTelefono + '\'' +
                ", sDireccion='" + sDireccion + '\'' +
                ", sDNI='" + sDNI + '\'' +
                '}';
    }
}
