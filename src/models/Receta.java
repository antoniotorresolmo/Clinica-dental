package models;

public class Receta {
	
	private int ID_Receta; //PK
	private String Descripcion; //NN
	private int ID_Medico; //FK
	private int ID_Paciente; //FK
	
	public Receta() {}
	
	public Receta(int ID_Receta) {
		
		this.ID_Receta = ID_Receta;
	}

	public Receta(int ID_Receta, String Descripcion, int ID_Medico, int ID_Paciente) {
		
		setID_Receta(ID_Receta);
		setDescripcion(Descripcion);
		setID_Medico(ID_Medico);
		setID_Paciente(ID_Paciente);
	}

	public int getID_Receta() {
		return ID_Receta;
	}

	public void setID_Receta(int ID_Receta) {
		this.ID_Receta = ID_Receta;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		if (Descripcion != null && Descripcion.length() <= 1000) {
			this.Descripcion = Descripcion;
		}
	}

	public int getID_Medico() {
		return ID_Medico;
	}

	public void setID_Medico(int ID_Medico) {
		this.ID_Medico = ID_Medico;
	}

	public int getID_Paciente() {
		return ID_Paciente;
	}

	public void setID_Paciente(int ID_Paciente) {
		this.ID_Paciente = ID_Paciente;
	}

	@Override
	public String toString() {
		return "Receta [ID_Receta=" + ID_Receta + ", Descripcion=" + Descripcion + ", ID_Medico=" + ID_Medico
				+ ", ID_Paciente=" + ID_Paciente + "]";
	}

}
