package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Cita;
import models.Paciente;

public class LoginController {
	
	public static List<Integer> listaPacientes(List<Cita> listCitas) {
		
		List<Integer> listPacientes = new ArrayList<Integer>();
		
		for(Cita oCita: listCitas) {
			if (!listPacientes.contains(oCita.getID_Paciente())) {
				listPacientes.add(oCita.getID_Paciente());
			}
		}
		
		return listPacientes;
	}
 
}
