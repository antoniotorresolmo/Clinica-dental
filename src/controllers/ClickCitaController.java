package controllers;

import java.awt.BorderLayout;

import models.Paciente;
import views.FrmPrincipal;
import views.JDialogClickCita;
import views.PnlPacientes;

public class ClickCitaController {

	public static void verPerfil() {

		// Abrir PnlPaciente y seleccionar y mostrar los datos del paciente de la cita seleccionada
		
		views.PnlSlidingMenu.ocultarPaneles();
		views.PnlSlidingMenu.pnlPacientes1.setVisible(true);
		FrmPrincipal.pnlCentro.add(views.PnlSlidingMenu.pnlPacientes1, BorderLayout.CENTER);
		
		for(int iContador = 0;iContador < PnlPacientes.lPacientes.size();iContador++) {
			
			if(PnlPacientes.lPacientes.get(iContador).getID_Paciente() == JDialogClickCita.oCita.getID_Paciente()) {
				
				PnlPacientes.listPacientes.select(iContador);
				PnlPacientesController.cargarPaciente();
				
			}
			
		}
		
	}

	public static void completarCita() {

		views.JDialogCompletarCita.oCita = views.JDialogClickCita.oCita;
		new views.JDialogCompletarCita();
		
	}

	public static void eliminar() {

		try {
			logic.LogicCita.eliminar(views.JDialogClickCita.oCita.getID_Cita());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
