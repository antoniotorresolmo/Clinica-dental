package model;

public class Receta {
	
	private int id_Receta; //PK
	private String descripcion; //NN
	private Medico id_Medico; //FK
	private Paciente id_Paciente; //FK
	
	public Receta(int id_Receta) {
		
		this.id_Receta = id_Receta;
	}

	public Receta(int id_Receta, String descripcion, Medico id_Medico, Paciente id_Paciente) {
		
		this.id_Receta = id_Receta;
		this.descripcion = descripcion;
		this.id_Medico = id_Medico;
		this.id_Paciente = id_Paciente;
	}

	public int getId_Receta() {
		return id_Receta;
	}

	public void setId_Receta(int id_Receta) {
		this.id_Receta = id_Receta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Medico getId_Medico() {
		return id_Medico;
	}

	public void setId_Medico(Medico id_Medico) {
		this.id_Medico = id_Medico;
	}

	public Paciente getId_Paciente() {
		return id_Paciente;
	}

	public void setId_Paciente(Paciente id_Paciente) {
		this.id_Paciente = id_Paciente;
	}

	@Override
	public String toString() {
		return "Receta [id_Receta=" + id_Receta + ", descripcion=" + descripcion + ", id_Medico=" + id_Medico
				+ ", id_Paciente=" + id_Paciente + "]";
	}

}
