package model;

public class Paciente_Medico {
	
	private Medico id_Medico; //FK
	private Paciente id_Paciente; //FK
	
	public Paciente_Medico() {
		
	}

	public Paciente_Medico(Medico id_Medico, Paciente id_Paciente) {
		
		this.id_Medico = id_Medico;
		this.id_Paciente = id_Paciente;
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
		return "Paciente_Medico [id_Medico=" + id_Medico + ", id_Paciente=" + id_Paciente + "]";
	}

}
