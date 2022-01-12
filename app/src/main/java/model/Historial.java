package model;

public class Historial {

    private int id_Consulta; //PK
    private String operacion; //NN
    private String observaciones; //NN
    private int id_Paciente; //FK

    public Historial(int id_Consulta) {
        this.id_Consulta = id_Consulta;
    }

    public Historial(int id_Consulta, String operacion, String observaciones, int id_Paciente) {
        this.id_Consulta = id_Consulta;
        this.operacion = operacion;
        this.observaciones = observaciones;
        this.id_Paciente = id_Paciente;
    }

    public int getId_Consulta() {
        return id_Consulta;
    }

    public void setId_Consulta(int id_Consulta) {
        this.id_Consulta = id_Consulta;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getId_Paciente() {
        return id_Paciente;
    }

    public void setId_Paciente(int id_Paciente) {
        this.id_Paciente = id_Paciente;
    }

    @Override
    public String toString() {
        return "Historial{" +
                "id_Consulta=" + id_Consulta +
                ", operacion='" + operacion + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", id_Paciente=" + id_Paciente +
                '}';
    }
}
