package model;

public class Historial {
	
	private int id_Consulta; //PK
	private String operacion; //NN
	private String observacines; //NN
	private Paciente id_Paciente; //FK
	
	public Historial(int id_Consulta) {
		
		this.id_Consulta = id_Consulta;
	}

	public Historial(int id_Consulta, String operacion, String observacines, Paciente id_Paciente) {
		super();
		this.id_Consulta = id_Consulta;
		this.operacion = operacion;
		this.observacines = observacines;
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

	public String getObservacines() {
		return observacines;
	}

	public void setObservacines(String observacines) {
		this.observacines = observacines;
	}

	public Paciente getId_Paciente() {
		return id_Paciente;
	}

	public void setId_Paciente(Paciente id_Paciente) {
		this.id_Paciente = id_Paciente;
	}

	@Override
	public String toString() {
		return "Historial [id_Consulta=" + id_Consulta + ", operacion=" + operacion + ", observacines=" + observacines
				+ ", id_Paciente=" + id_Paciente + "]";
	}

}
