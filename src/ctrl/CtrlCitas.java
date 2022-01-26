package ctrl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import model.Cita;
import model.Paciente;

public class CtrlCitas {

	//LISTA----------------
	public List<Cita> getCitas(String Date) throws Exception {
		
		
		String url ="http://loschavalesdental.atwebpages.com/proyecto/Cita/lst_cita_dia.php?ID_Medico="+1+"&Dia="+Date;
	System.out.println(url);
		String requestHttp = peticionHttp(url);
		List<Cita> lstCitas = stringToListCitas(requestHttp);
		
		return lstCitas;
	}

	//LISTA----------------
	private static List<Cita> stringToListCitas(String requestHttp) {

		List<Cita> lstCitas = new ArrayList<>();
	
		JSONArray jsonArray = new JSONArray(requestHttp);
		System.out.println(jsonArray.length());
		
		
		for(int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObj = jsonArray.getJSONObject(i);
			Cita c = objJson2Citas(jsonObj);
			lstCitas.add(c);
		}
		
		return lstCitas;
	}
	
	private static Cita objJson2Citas(JSONObject jsonObj) {
		//Extraer los values del objeto JSON
		//System.out.println(jsonObj);
		Integer ID_Cita = jsonObj.getInt("ID_Cita"); //PK
		String Dia = jsonObj.getString("Dia"); //NN
		String Hora = jsonObj.getString("Hora"); //NN
		String Operacion = jsonObj.getString("Operacion"); //NN
		Byte Terminada = (byte) jsonObj.getInt("Terminada"); //NN
		Integer ID_Medico = jsonObj.getInt("ID_Medico"); //NN
		Integer ID_Paciente = jsonObj.getInt("ID_Paciente"); //NN

		//Crear el objeto Coche con los values extraidos
		
		Cita c = new Cita();
		
		c.setID_Paciente(ID_Paciente);
		c.setID_Medico(ID_Medico);
		c.setTerminada(Terminada);
		c.setOperacion(Operacion);
		c.setHora(Hora);
		c.setDia(Dia);
		c.setID_Cita(ID_Cita);
	
		
		return c;
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
