package logic;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import models.Paciente;

public class LogicPaciente {
	
	public static void listar() {
		
		//String url = ILogic.URI + "proyecto/Cita/lst_cita_by_idpaciente.php?Dia=" + dia +"&Hora=" + hora + "&Operacion=" + operacion + "&Termianada=" + terminada + "&ID_Medico=" + id_Medico + "&Operacion=" + operacion;
		
	}
	
	private static Paciente objJson2Paciente(JSONObject jsonObj) {
		//Extraer los values del objeto JSON
		String Correo = jsonObj.getString("Correo");
		String Nombre = jsonObj.getString("Nombre");
		String Apellidos = jsonObj.getString("Apellidos");
		String Telefono = jsonObj.getString("Telefono");
		String Direccion = jsonObj.getString("Direccion");
		String DNI = jsonObj.getString("DNI");
		
		//Crear el objeto Coche con los values extraidos
		Paciente p = new Paciente();
		p.setCorreo(Correo);
		p.setNombre(Nombre);
		p.setApellidos(Apellidos);
		p.setTelefono(Telefono);
		p.setDireccion(Direccion);
		p.setDNI(DNI);
		
		return p;
	}
	
	private static List<Paciente> stringToListPacientes(String requestHttp) {

		List<Paciente> lstPacientes = new ArrayList<>();
		
		JSONArray jsonArray = new JSONArray(requestHttp);
		
		for(int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObj = jsonArray.getJSONObject(i);
			Paciente p = objJson2Paciente(jsonObj);
			lstPacientes.add(p);
		}
		
		return lstPacientes;
	}
	
	private static List<Paciente> getPaciente() throws Exception {
		
		String url = ILogic.URI + "lst-paciente.php";
		String requestHttp = controllers.CtrlPrincipal.peticionHttp(url);
		List<Paciente> lstPacientes = stringToListPacientes(requestHttp);
		
		return lstPacientes;
	}

}
