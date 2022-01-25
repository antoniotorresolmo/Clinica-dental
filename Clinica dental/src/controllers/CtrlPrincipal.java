package controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;
import models.Paciente;
import views.JDialogLogin;
import models.Medico;

public class CtrlPrincipal {

	public static void inicio() {
		
		new views.JDialogLogin();
		
	}
	
	public static void finalizar() {
		
		System.exit(0);
		
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