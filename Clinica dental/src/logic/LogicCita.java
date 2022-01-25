package logic;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import models.Cita;

public class LogicCita {
	
	private static Cita objJson2Cita(JSONObject jsonObj) {
		//Extraer los values del objeto JSON
		String dia = jsonObj.getString("Dia");
		String hora = jsonObj.getString("Hora");
		String operacion = jsonObj.getString("Operacion");
		boolean terminada = jsonObj.getBoolean("Terminada");
		Integer id_Medico = jsonObj.getInt("ID_Medico");
		Integer id_Paciente = jsonObj.getInt("ID_Paciente");
		
		//Crear el objeto Coche con los values extraidos
		Cita c = new Cita();
		c.setDia(dia);
		c.setHora(hora);
		c.setOperacion(operacion);
		c.setTerminada(terminada);
		c.setID_Medico(id_Medico);
		c.setID_Paciente(id_Paciente);
		
		return c;
	}
	
	private static List<Cita> stringToListCitas(String requestHttp) {

		List<Cita> lstCitas = new ArrayList<>();
		
		JSONArray jsonArray = new JSONArray(requestHttp);
		
		for(int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObj = jsonArray.getJSONObject(i);
			Cita c = objJson2Cita(jsonObj);
			lstCitas.add(c);
		}
		
		return lstCitas;
	}
	
	private static List<Cita> getCita() throws Exception {
		
		String url = ILogic.URI + "lst-cita.php";
		String requestHttp = controllers.CtrlPrincipal.peticionHttp(url);
		List<Cita> lstCitas = stringToListCitas(requestHttp);
		
		return lstCitas;
	}

}
