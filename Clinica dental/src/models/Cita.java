package models;

public class Cita {
	
	private int ID_Cita; //PK
	private String Dia; //NN
	private String Hora; //NN
	private String Operacion; //NN
	private boolean Terminada; //NN
	private int ID_Medico; //FK
	private int ID_Paciente; //FK
	
	public Cita() {
		
		
	}
	
	public Cita(int ID_Cita) {
		
		setID_Cita(ID_Cita);
	}

	public Cita(String dia, String hora, String operacion, boolean terminada, int iD_Medico, int iD_Paciente) {
		
		setDia(Dia);
		setHora(Hora);
		setOperacion(Operacion);
		setTerminada(Terminada);
		setID_Medico(ID_Medico);
		setID_Paciente(ID_Paciente);
	}

	public Cita(int ID_Cita, String Dia, String Hora, String Operacion, boolean Terminada, int ID_Medico,
			int ID_Paciente) {
		
		setID_Cita(ID_Cita);
		setDia(Dia);
		setHora(Hora);
		setOperacion(Operacion);
		setTerminada(Terminada);
		setID_Medico(ID_Medico);
		setID_Paciente(ID_Paciente);
	}

	public int getID_Cita() {
		return ID_Cita;
	}

	public void setID_Cita(int ID_Cita) {
		this.ID_Cita = ID_Cita;
	}

	public String getDia() {
		return Dia;
	}

	public void setDia(String Dia) {
		this.Dia = Dia;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String Hora) {
		this.Hora = Hora;
	}

	public String getOperacion() {
		return Operacion;
	}

	public void setOperacion(String Operacion) {
		if (Operacion != null && Operacion.length() <= 255) {
			this.Operacion = Operacion;
		}
	}

	public boolean isTerminada() {
		return Terminada;
	}

	public void setTerminada(boolean terminada) {
		this.Terminada = terminada;
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
		return "Cita [ID_Cita=" + ID_Cita + ", Dia=" + Dia + ", Hora=" + Hora + ", Operacion=" + Operacion
				+ ", Terminada=" + Terminada + ", ID_Medico=" + ID_Medico + ", ID_Paciente=" + ID_Paciente + "]";
	}

}
