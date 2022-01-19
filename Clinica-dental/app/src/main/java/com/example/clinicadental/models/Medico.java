package com.example.clinicadental.models;

public class Medico {

    private int id_Medico; //PK
    private String usuario; //NN
    private String password; //NN
    private String correo;//NN
    private String direccion; //NN
    private String telefono; //NN

    public Medico(int id_Medico) {
        this.id_Medico = id_Medico;
    }

    public Medico(int id_Medico, String usuario, String password, String correo, String direccion, String telefono) {
        this.id_Medico = id_Medico;
        this.usuario = usuario;
        this.password = password;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId_Medico() {
        return id_Medico;
    }

    public void setId_Medico(int id_Medico) {
        this.id_Medico = id_Medico;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id_Medico=" + id_Medico +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
