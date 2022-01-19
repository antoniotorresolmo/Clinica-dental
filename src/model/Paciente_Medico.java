package model;

public class Paciente_Medico {
	
	private Medico ID_Medico; //FK
	private Paciente ID_Paciente; //FK
	
	public Paciente_Medico() {
		
	}

	public Paciente_Medico(Medico ID_Medico, Paciente ID_Paciente) {
		
		this.ID_Medico = ID_Medico;
		this.ID_Paciente = ID_Paciente;
	}

	public Medico getID_Medico() {
		return ID_Medico;
	}

	public void setID_Medico(Medico ID_Medico) {
		this.ID_Medico = ID_Medico;
	}

	public Paciente getID_Paciente() {
		return ID_Paciente;
	}

	public void setID_Paciente(Paciente ID_Paciente) {
		this.ID_Paciente = ID_Paciente;
	}

	@Override
	public String toString() {
		return "Paciente_Medico [ID_Medico=" + ID_Medico + ", ID_Paciente=" + ID_Paciente + "]";
	}

}
