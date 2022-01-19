package model;

public class Paciente {
	
	private int ID_Paciente; //PK
	private String Usuario; //NN
	private String Password; //NN
	private String Correo; //NN
	private String Nombre; //NN
	private String Apellidos; //NN
	private String Telefono; //NN
	private String Direccion; //NN
	private String DNI; //NN
	
	public Paciente(int ID_Paciente) {
		
		this.ID_Paciente = ID_Paciente;
	}

	public Paciente(int ID_Paciente, String Usuario, String Password, String Correo, String Nombre, String Apellidos,
			String Telefono, String Direccion, String DNI) {
		
		setID_Paciente(ID_Paciente);
		setUsuario(Usuario);
		setPassword(Password);
		setCorreo(Correo);
		setNombre(Nombre);
		setApellidos(Apellidos);
		setTelefono(Telefono);
		setDireccion(Direccion);
		setDNI(DNI);
	}

	public int getID_Paciente() {
		return ID_Paciente;
	}

	public void setID_Paciente(int ID_Paciente) {
		this.ID_Paciente = ID_Paciente;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String Usuario) {
		if (Usuario != null && Usuario.length() <= 255) {
			this.Usuario = Usuario;
		}
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		if (Password != null && Password.length() <= 20) {
			this.Password = Password;
		}
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String Correo) {
		if (Correo != null && Correo.length() <= 255) {
			this.Correo = Correo;
		}
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		if (Nombre != null && Nombre.length() <= 255) {
			this.Nombre = Nombre;
		}
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String Apellidos) {
		if (Apellidos != null && Apellidos.length() <= 255) {
			this.Apellidos = Apellidos;
		}
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String Telefono) {
		if (Telefono != null && Telefono.length() == 9) {
			this.Telefono = Telefono;
		}
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String Direccion) {
		if (Direccion != null && Direccion.length() <= 255) {
			this.Direccion = Direccion;
		}
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		if (DNI != null && DNI.length() == 9) {
			this.DNI = DNI;
		}
	}

	@Override
	public String toString() {
		return "Paciente [ID_Paciente=" + ID_Paciente + ", Usuario=" + Usuario + ", Password=" + Password + ", Correo="
				+ Correo + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Telefono=" + Telefono + ", Direccion="
				+ Direccion + ", DNI=" + DNI + "]";
	}

}
