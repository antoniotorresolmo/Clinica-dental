package controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

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

		// Realizar la peticion PHP
		URL url = new URL(urlWebService);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");

		// Recoger los datos de respuesta
		BufferedReader rd = new BufferedReader(new InputStreamReader(((HttpURLConnection) (new URL(urlWebService)).openConnection()).getInputStream(), Charset.forName("UTF-8")));
		String linea;
		while ((linea = rd.readLine()) != null) {
			resultado.append(linea);
		}

		return resultado.toString();
	}

	public static void camposEditables() {

		views.PnlPerfil.txtNombre.setEditable(true);
		views.PnlPerfil.txtApellidos.setEditable(true);
		views.PnlPerfil.txtUsuario.setEditable(true);
		views.PnlPerfil.txtPassword.setEditable(true);
		views.PnlPerfil.txtCorreo.setEditable(true);
		views.PnlPerfil.txtDireccion.setEditable(true);
		views.PnlPerfil.txtTelefono.setEditable(true);

	}

}