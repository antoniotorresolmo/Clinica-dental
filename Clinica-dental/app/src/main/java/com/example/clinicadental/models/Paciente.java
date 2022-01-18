package com.example.clinicadental.models;

import java.util.Objects;

public class Paciente {

    private int ID_Paciente; // PK
    private String Usuario; // NN U
    private String Password; // NN
    private String Correo; // NN
    private String Nombre; // NN
    private String Apellidos;// NN
    private String Telefono; // NN
    private String Direccion; // NN
    private String DNI; // NN

    public Paciente(){}

    public Paciente(int ID_Paciente) {
        this.setID_Paciente(ID_Paciente);
    }

    public Paciente(String sUsuario, String sPassword) {
        this.Usuario = sUsuario;
        this.Password = sPassword;
    }

    public Paciente(int ID_Paciente, String sUsuario, String sPassword, String sCorreo) {
        this.setID_Paciente(ID_Paciente);
        this.setUsuario(sUsuario);
        this.setPassword(sPassword);
        this.setCorreo(sCorreo);
    }

    public Paciente(int ID_Paciente, String sUsuario, String sPassword, String sCorreo, String sNombre, String sApellidos, String sTelefono, String sDireccion, String sDNI) {
        this.setID_Paciente(ID_Paciente);
        this.setUsuario(sUsuario);
        this.setPassword(sPassword);
        this.setCorreo(sCorreo);
        this.setNombre(sNombre);
        this.setApellidos(sApellidos);
        this.setTelefono(sTelefono);
        this.setDireccion(sDireccion);
        this.setDNI(sDNI);
    }

    public int getID_Paciente() {
        return ID_Paciente;
    }

    public void setID_Paciente(int ID_Paciente) {
        if(ID_Paciente > 0){
            this.ID_Paciente = ID_Paciente;
        }
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        if(!usuario.isEmpty() && usuario.length() < 255){
            this.Usuario = usuario;
        }
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        if(!Usuario.isEmpty() && Usuario.length() < 20){
            this.Usuario = Usuario;
        }
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        if(!correo.isEmpty() && correo.length() < 255){
            this.Correo = correo;
        }
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        if(!nombre.isEmpty() && nombre.length() < 255){
            this.Nombre = nombre;
        }
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        if(!apellidos.isEmpty() && apellidos.length() < 255){
            this.Apellidos = apellidos;
        }
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        if(!telefono.isEmpty() && telefono.length() == 9){
            this.Telefono = telefono;
        }
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        if(!direccion.isEmpty() && direccion.length() < 255){
            this.Direccion = direccion;
        }
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        if(!DNI.isEmpty() && DNI.length() == 9){
            this.DNI = DNI;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return ID_Paciente == paciente.ID_Paciente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_Paciente);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "iID_Paciente=" + ID_Paciente +
                ", sUsuario='" + Usuario + '\'' +
                ", sPassword='" + Password + '\'' +
                ", sCorreo='" + Correo + '\'' +
                ", sNombre='" + Nombre + '\'' +
                ", sApellidos='" + Apellidos + '\'' +
                ", sTelefono='" + Telefono + '\'' +
                ", sDireccion='" + Direccion + '\'' +
                ", sDNI='" + DNI + '\'' +
                '}';
    }
}
