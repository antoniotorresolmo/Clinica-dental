package controllers;

import models.Historial;
import models.Receta;

public class CompletarCitaController {

	public static void completarCita() {
		
		Historial oHistorial = new Historial();
		oHistorial.setOperacion(views.JDialogCompletarCita.oCita.getOperacion());
		oHistorial.setObservacines(views.JDialogCompletarCita.txtHistorial.getText());
		oHistorial.setId_Paciente(views.JDialogCompletarCita.oCita.getID_Paciente());
		
		Receta oReceta = new Receta();
		oReceta.setDescripcion(views.JDialogCompletarCita.txtRecetario.getText());
		oReceta.setID_Paciente(views.JDialogCompletarCita.oCita.getID_Paciente());
		oReceta.setID_Medico(views.JDialogCompletarCita.oCita.getID_Medico());
		
		try {
			logic.LogicHistorial.insertar(oHistorial);
			logic.LogicRecetario.insertar(oReceta);
			
			logic.LogicCita.terminarCita(views.JDialogCompletarCita.oCita.getID_Cita());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
