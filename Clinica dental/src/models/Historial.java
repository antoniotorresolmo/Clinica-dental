package models;

public class Historial {
	
	private int ID_Consulta; //PK
	private String Operacion; //NN
	private String Observacines; //NN
	private int ID_Paciente; //FK
	
	public Historial(int ID_Consulta) {
		
		this.ID_Consulta = ID_Consulta;
	}

	public Historial(int ID_Consulta, String Operacion, String Observacines, int ID_Paciente) {
		
		setId_Consulta(ID_Consulta);
		setOperacion(Operacion);
		setObservacines(Observacines);
		setId_Paciente(ID_Paciente);
	}

	public int getId_Consulta() {
		return ID_Consulta;
	}

	public void setId_Consulta(int ID_Consulta) {
		this.ID_Consulta = ID_Consulta;
	}

	public String getOperacion() {
		return Operacion;
	}

	public void setOperacion(String Operacion) {
		if (Operacion != null && Operacion.length() <= 255) {
			this.Operacion = Operacion;
		}
	}

	public String getObservacines() {
		return Observacines;
	}

	public void setObservacines(String Observacines) {
		if (Observacines != null && Observacines.length() <= 1000) {
			this.Observacines = Observacines;
		}
	}

	public int getId_Paciente() {
		return ID_Paciente;
	}

	public void setId_Paciente(int ID_Paciente) {
		this.ID_Paciente = ID_Paciente;
	}

	@Override
	public String toString() {
		return "Historial [id_Consulta=" + ID_Consulta + ", operacion=" + Operacion + ", observacines=" + Observacines
				+ ", id_Paciente=" + ID_Paciente + "]";
	}

}
