package ctrl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CtrlPrincipal {
		
	public static void inicio() {
		
		new view.JDialogLogin();
		
	}
	
	public static void finalizar() {
		
		System.exit(0);
		
	}
	
	public static void camposEditables() {
		
		view.PnlPerfil.txtNombreMedico.setEditable(true);
		view.PnlPerfil.txtApellidosMedico.setEditable(true);
		view.PnlPerfil.txtUsuarioMedico.setEditable(true);
		view.PnlPerfil.txtPasswordMedico.setEditable(true);
		view.PnlPerfil.txtCorreoMedico.setEditable(true);
		view.PnlPerfil.txtDireccionMedico.setEditable(true);
		view.PnlPerfil.txtTelefonoMedico.setEditable(true);
		
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

}
