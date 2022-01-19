package model;

public class Medico {
	
	private int ID_Medico; //PK
	private String Nombre; //NN
	private String Apellidos; //NN
	private String Usuario; //NN
	private String Password; //NN
	private String Correo; //NN
	private String Direccion; //NN
	private String Telefono; //NN
	
	public Medico(int ID_Medico) {
		
		this.ID_Medico = ID_Medico;
	}

	public Medico(int ID_Medico, String Nombre, String Apellidos, String Usuario, String Password, String Correo, String Direccion, String Telefono) {
		
		setId_Medico(ID_Medico);
		setNombre(Nombre);
		setApellidos(Apellidos);
		setUsuario(Usuario);
		setPassword(Password);
		setCorreo(Correo);
		setDireccion(Direccion);
		setTelefono(Telefono);
	}

	public int getId_Medico() {
		return ID_Medico;
	}

	public void setId_Medico(int ID_Medico) {
		this.ID_Medico = ID_Medico;
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		if (Nombre != null && Nombre.length() <= 255) {
			Nombre = Nombre;
		}
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String Apellidos) {
		if (Apellidos != null && Apellidos.length() <= 255) {
			Apellidos = Apellidos;
		}
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String Usuario) {
		if (Usuario != null && Usuario.length() <= 255) {
			Usuario = Usuario;
		}
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		if (Password != null && Password.length() <= 20) {
			Password = Password;
		}
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String Correo) {
		if (Correo != null && Correo.length() <= 255) {
			Correo = Correo;
		}
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String Direccion) {
		if (Direccion != null && Direccion.length() <= 255) {
			Direccion = Direccion;
		}
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String Telefono) {
		if (Telefono != null && Telefono.length() == 9) {
			Telefono = Telefono;
		}
	}

	@Override
	public String toString() {
		return "Medico [ID_Medico=" + ID_Medico + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", usuario="
				+ Usuario + ", password=" + Password + ", correo=" + Correo + ", direccion=" + Direccion + ", telefono="
				+ Telefono + "]";
	}
	
}
