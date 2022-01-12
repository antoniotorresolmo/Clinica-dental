package model;

public class Cita {
	
	private int id_Cita; //PK
	private String dia; //NN
	private String hora; //NN
	private String operacion; //NN
	private int id_Medico; //FK
	private int id_Paciente; //FK
	
	public Cita(int id_Cita) {
		
		this.id_Cita = id_Cita;
	}

	public Cita(int id_Cita, String dia, String hora, String operacion, int id_Medico, int id_Paciente) {
		
		this.id_Cita = id_Cita;
		this.dia = dia;
		this.hora = hora;
		this.operacion = operacion;
		this.id_Medico = id_Medico;
		this.id_Paciente = id_Paciente;
	}

	public int getId_Cita() {
		return id_Cita;
	}

	public void setId_Cita(int id_Cita) {
		this.id_Cita = id_Cita;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public int getId_Medico() {
		return id_Medico;
	}

	public void setId_Medico(int id_Medico) {
		this.id_Medico = id_Medico;
	}

	public int getId_Paciente() {
		return id_Paciente;
	}

	public void setId_Paciente(int id_Paciente) {
		this.id_Paciente = id_Paciente;
	}

	@Override
	public String toString() {
		return "Cita [id_Cita=" + id_Cita + ", dia=" + dia + ", hora=" + hora + ", operacion=" + operacion
				+ ", id_Medico=" + id_Medico + ", id_Paciente=" + id_Paciente + "]";
	}

}
