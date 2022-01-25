package logic;

import org.json.JSONObject;
import models.Medico;

public class LogicMedico implements ILogic{
	
	public static void insertar() throws Exception {
		
		String nombre, apellidos, usuario, password, correo, direccion, telefono;
		
		nombre = views.JDialogRegistro.txtNombre.getText();
		apellidos = views.JDialogRegistro.txtApellidos.getText();
		usuario = views.JDialogRegistro.txtUsuario.getText();
		password = views.JDialogRegistro.txtPassword.getText();
		correo = views.JDialogRegistro.txtCorreo.getText();
		direccion = views.JDialogRegistro.txtDireccion.getText();
		telefono = views.JDialogRegistro.txtTelefono.getText();
		
		String url = URI + "proyecto/Medico/ins_medico.php?sNombre=" + nombre +"&sApellidos=" + apellidos + "&sUsuario=" + usuario + "&sPassword=" + password + "&sCorreo=" + correo + "&sDireccion=" + direccion + "&sTelefono=" + telefono;
		
		controllers.CtrlPrincipal.peticionHttp(url);
		
	}

	public static Medico stringToMedico(String requestHttp) throws Exception{
		Medico m = new Medico();

		JSONObject jsonObject = new JSONObject(requestHttp);
		 m = objJson2Medico(jsonObject);		

		return m;
	}
	
	
	public static Medico objJson2Medico(JSONObject jsonObj) {

		//Extraer los values del objeto JSON
		Integer ID_Medico = jsonObj.getInt("ID_Medico"); //PK
		String Nombre = jsonObj.getString("Nombre"); //NN
		String Apellidos= jsonObj.getString("Apellidos"); //NN
		String Usuario= jsonObj.getString("Usuario"); //NN
		String Password= jsonObj.getString("Password"); //NN
		String Correo= jsonObj.getString("Correo"); //NN
		String Direccion= jsonObj.getString("Direccion"); //NN
		String Telefono= jsonObj.getString("Telefono"); //NN
		
		//Crear el objeto Coche con los values extraidos
		Medico m = new Medico();
		m.setId_Medico(ID_Medico);
		m.setNombre(Nombre);
		m.setApellidos(Apellidos);
		m.setUsuario(Usuario);
		m.setPassword(Password);
		m.setCorreo(Correo);
		m.setDireccion(Direccion);
		m.setTelefono(Telefono);
	
		return m;
	}

}
