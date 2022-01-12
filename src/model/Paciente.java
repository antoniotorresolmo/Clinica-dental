package model;

public class Paciente {
	
	private int id_Paciente; //PK
	private String usuario; //NN
	private String password; //NN
	private String correo; //NN
	private String nombre; //NN
	private String apellidos; //NN
	private String telfono; //NN
	private String direccion; //NN
	private String dni; //NN
	
	public Paciente(int id_Paciente) {
		
		this.id_Paciente = id_Paciente;
	}

	public Paciente(int id_Paciente, String usuario, String password, String correo, String nombre, String apellidos,
			String telfono, String direccion, String dni) {
		
		this.id_Paciente = id_Paciente;
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telfono = telfono;
		this.direccion = direccion;
		this.dni = dni;
	}

	public int getId_Paciente() {
		return id_Paciente;
	}

	public void setId_Paciente(int id_Paciente) {
		this.id_Paciente = id_Paciente;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelfono() {
		return telfono;
	}

	public void setTelfono(String telfono) {
		this.telfono = telfono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Paciente [id_Paciente=" + id_Paciente + ", usuario=" + usuario + ", password=" + password + ", correo="
				+ correo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telfono=" + telfono + ", direccion="
				+ direccion + ", dni=" + dni + "]";
	}

}
