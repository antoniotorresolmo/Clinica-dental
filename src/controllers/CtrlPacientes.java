package controllers;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import models.Medico;
import models.Paciente;

public class CtrlPacientes {

	public static String getNombreApellidosPaciente(int id) throws Exception {
		String url = "http://loschavalesdental.atwebpages.com/proyecto/Paciente/get_paciente_nombre_apellidos.php?iID_Paciente="
				+ id;
		String requestHttp = CtrlPrincipal.peticionHttp(url);

		return stringToNombreApellidos(requestHttp);
	}

	private static String stringToNombreApellidos(String requestHttp) throws Exception {

		// Medico m = new Medico();
		String sNombre = "";
		JSONObject jsonObject = new JSONObject(requestHttp);
		sNombre = objJson2NombreApellidos(jsonObject);

		return sNombre;
	}

	private static String objJson2NombreApellidos(JSONObject jsonObj) {
		// Extraer los values del objeto JSON

		String sNombre = jsonObj.getString("Nombre");
		String sApellidos = jsonObj.getString("Apellidos");

		return sNombre + " " + sApellidos;
	}

	// LISTA----------------
	public static List<Paciente> getPacientes() throws Exception {

		String url = "http://loschavalesdental.atwebpages.com/proyecto/Paciente/lst_paciente.php";
		String requestHttp = CtrlPrincipal.peticionHttp(url);
		List<Paciente> lstPacientes = stringToListPacientes(requestHttp);

		return lstPacientes;
	}

	// LISTA----------------
	private static List<Paciente> stringToListPacientes(String requestHttp) {

		List<Paciente> lstPacientes = new ArrayList<>();

		JSONArray jsonArray = new JSONArray("[" + requestHttp + "]");
		System.out.println(jsonArray.length());
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObj = jsonArray.getJSONObject(i);
			Paciente p = objJson2Paciente(jsonObj);
			lstPacientes.add(p);
		}

		return lstPacientes;
	}

	private static Paciente objJson2Paciente(JSONObject jsonObj) {
		// Extraer los values del objeto JSON

		Integer ID_Paciente = jsonObj.getInt("ID_Paciente"); // PK
		String Usuario = jsonObj.getString("Usuario"); // NN
		String Password = jsonObj.getString("Password"); // NN
		String Correo = jsonObj.getString("Correo"); // NN
		String Nombre = jsonObj.getString("Nombre"); // NN
		String Apellidos = jsonObj.getString("Apellidos"); // NN
		String Telefono = jsonObj.getString("Telefono"); // NN
		String Direccion = jsonObj.getString("Direccion"); // NN

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

	public static String getNombrePaciente(int id_Paciente) throws Exception {
		String url = "http://loschavalesdental.atwebpages.com/proyecto/Paciente/get_paciente_nombre.php?iID_Paciente="+ id_Paciente;
		String requestHttp = CtrlPrincipal.peticionHttp(url);

		return stringToNombre(requestHttp);
	}

	private static String stringToNombre(String requestHttp) {
		JSONObject jsonObject = new JSONObject(requestHttp);

		return objJson2Nombre(jsonObject);
	}

	private static String objJson2Nombre(JSONObject jsonObject) {
		return jsonObject.getString("Nombre");
	}

}
