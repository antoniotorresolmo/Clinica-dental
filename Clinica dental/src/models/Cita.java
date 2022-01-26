package models;

public class Cita {
	
	private int ID_Cita; //PK
	private String Dia; //NN
	private String Hora; //NN
	private String Operacion; //NN
	private byte Terminada; //NN
	private int ID_Medico; //FK
	private int ID_Paciente; //FK
	
	public Cita() {
		
	}
	public Cita(int ID_Cita) {
		
		this.ID_Cita = ID_Cita;
	}
	public Cita(int iD_Cita, String dia, String hora, String operacion, byte terminada, int iD_Medico,
			int iD_Paciente) {

		ID_Cita = iD_Cita;
		Dia = dia;
		Hora = hora;
		Operacion = operacion;
		Terminada = terminada;
		ID_Medico = iD_Medico;
		ID_Paciente = iD_Paciente;
	}
	public int getID_Cita() {
		return ID_Cita;
	}
	public void setID_Cita(int iD_Cita) {
		ID_Cita = iD_Cita;
	}
	public String getDia() {
		return Dia;
	}
	public void setDia(String dia) {
		Dia = dia;
	}
	public String getHora() {
		return Hora;
	}
	public void setHora(String hora) {
		Hora = hora;
	}
	public String getOperacion() {
		return Operacion;
	}
	public void setOperacion(String operacion) {
		Operacion = operacion;
	}
	public byte getTerminada() {
		return Terminada;
	}
	public void setTerminada(byte terminada) {
		Terminada = terminada;
	}
	public int getID_Medico() {
		return ID_Medico;
	}
	public void setID_Medico(int iD_Medico) {
		ID_Medico = iD_Medico;
	}
	public int getID_Paciente() {
		return ID_Paciente;
	}
	public void setID_Paciente(int iD_Paciente) {
		ID_Paciente = iD_Paciente;
	}
	@Override
	public String toString() {
		return "Cita [ID_Cita=" + ID_Cita + ", Dia=" + Dia + ", Hora=" + Hora + ", Operacion=" + Operacion
				+ ", Terminada=" + Terminada + ", ID_Medico=" + ID_Medico + ", ID_Paciente=" + ID_Paciente + "]";
	}


}
