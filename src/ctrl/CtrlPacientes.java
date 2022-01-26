package ctrl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import model.Medico;
import model.Paciente;

public class CtrlPacientes {
	
public static String getNombrePaciente(int id) throws Exception {
		String sNombre = "";
		String url ="http://loschavalesdental.atwebpages.com/proyecto/Paciente/get_paciente_nombre.php?iID_Paciente="+id;
		String requestHttp = peticionHttp(url);
		sNombre = stringToNombre(requestHttp);
		
		return sNombre;
	}

private static String stringToNombre(String requestHttp) throws Exception{
	
	//Medico m = new Medico();
	String sNombre="";
	JSONObject jsonObject = new JSONObject(requestHttp);
	sNombre = objJson2Medico(jsonObject);

	
	return sNombre;
}


private static String objJson2Medico(JSONObject jsonObj) {
	//Extraer los values del objeto JSON

	String Nombre = jsonObj.getString("Nombre"); 

	return Nombre;
}


	
	
	//LISTA----------------
	public static List<Paciente> getPacientes() throws Exception {
		
		String url ="http://loschavalesdental.atwebpages.com/proyecto/Paciente/lst_paciente.php";
		String requestHttp = peticionHttp(url);
		List<Paciente> lstPacientes = stringToListPacientes(requestHttp);
		
		return lstPacientes;
	}

	//LISTA----------------
	private static List<Paciente> stringToListPacientes(String requestHttp) {

		List<Paciente> lstPacientes = new ArrayList<>();
		
		JSONArray jsonArray = new JSONArray("["+requestHttp+"]");
		System.out.println(jsonArray.length());
		for(int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObj = jsonArray.getJSONObject(i);
			Paciente p = objJson2Paciente(jsonObj);
			lstPacientes.add(p);
		}
		
		return lstPacientes;
	}
	
	private static Paciente objJson2Paciente(JSONObject jsonObj) {
		//Extraer los values del objeto JSON

		Integer ID_Paciente = jsonObj.getInt("ID_Paciente"); //PK
		String Usuario = jsonObj.getString("Usuario"); //NN
		String Password= jsonObj.getString("Password"); //NN
		String Correo= jsonObj.getString("Correo"); //NN
		String Nombre= jsonObj.getString("Nombre"); //NN
		String Apellidos= jsonObj.getString("Apellidos"); //NN
		String Telefono= jsonObj.getString("Telefono"); //NN
		String Direccion= jsonObj.getString("Direccion"); //NN
		String DNI = jsonObj.getString("DNI"); //NN
		//Crear el objeto Coche con los values extraidos
		
		Paciente p = new Paciente();
		
		p.setID_Paciente(ID_Paciente);
		p.setNombre(Nombre);
		p.setApellidos(Apellidos);
		p.setUsuario(Usuario);
		p.setPassword(Password);
		p.setCorreo(Correo);
		p.setDireccion(Direccion);
		p.setTelefono(Telefono);
	
		
		return p;
	}
	private static String peticionHttp(String urlWebService) throws Exception {

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
