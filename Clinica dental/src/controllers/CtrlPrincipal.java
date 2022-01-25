package controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

import models.Paciente;
import views.JDialogLogin;
import models.Medico;

public class CtrlPrincipal {

	static final String URI = "http://loschavalesdental.atwebpages.com/proyecto/Medico/";

	public static void inicio() {
		
		new views.JDialogLogin();
		
	}
	
	public static void finalizar() {
		
		System.exit(0);
		
	}
	public static void getPaciente(String usuario, String pass) throws Exception {

		String url = URI + "get_medico_login.php?Usuario=" + usuario+"&Password="+pass;
		String requestHttp = peticionHttp(url);
		JDialogLogin.oMedico = stringToMedico(requestHttp);
		
	}

	//Esto va en la capa logica
	private static Medico stringToMedico(String requestHttp) throws Exception{
		Medico m = new Medico();

		JSONObject jsonObject = new JSONObject(requestHttp);
		 m = objJson2Medico(jsonObject);

		

		return m;
	}
	
	
	private static Medico objJson2Medico(JSONObject jsonObj) {
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

	public static String peticionHttp(String urlWebService) throws Exception {

		StringBuilder resultado = new StringBuilder();
		
		//Realizar la peticion PHP
		URL url = new URL(urlWebService);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		
		//Recoger los datos de respuesta
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String linea;
		while((linea = rd.readLine()) != null) {
			resultado.append(linea);
		}
		
		return resultado.toString();
	}
	
	public static void camposEditables() {
		
		views.PnlPerfil.txtNombreMedico.setEditable(true);
		views.PnlPerfil.txtApellidosMedico.setEditable(true);
		views.PnlPerfil.txtUsuarioMedico.setEditable(true);
		views.PnlPerfil.txtPasswordMedico.setEditable(true);
		views.PnlPerfil.txtCorreoMedico.setEditable(true);
		views.PnlPerfil.txtDireccionMedico.setEditable(true);
		views.PnlPerfil.txtTelefonoMedico.setEditable(true);
		
	}
	
	
	

}