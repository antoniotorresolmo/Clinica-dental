package controllers;

import java.util.List;

import javax.swing.JOptionPane;

import models.Cita;
import views.JDialogDatosCita;
import views.PnlAgenda;

public class AgendaController {

	public static void listarPacientesCita() {

		try {
			views.PnlAgenda.lCitas = CtrlCitas.getCitas(PnlAgenda.sFechaCogida);
			
			
			views.PnlAgenda.lCitas.forEach(oCita -> {

				try {
					views.PnlAgenda.lista.add(CtrlPacientes.getNombreApellidosPaciente(oCita.getID_Paciente()));
					
				} catch (Exception e) {

					e.printStackTrace();
			
				}

			});

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void borrarCita() {

		try {
			logic.LogicCita.eliminar(views.PnlAgenda.lCitas.get(views.PnlAgenda.lista.getSelectedIndex()).getID_Cita());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Por favor, selecciona una fecha", "Error",
					JOptionPane.WARNING_MESSAGE);
			e.printStackTrace();
		}

	}

	public static void prepararJDialogDatosCitaActualizar() {

		JDialogDatosCita.isEditing = true;
		JDialogDatosCita.iPacienteSeleccionado = PnlAgenda.lista.getSelectedIndex();
		JDialogDatosCita.iCitaSeleccionada = PnlAgenda.lCitas.get(PnlAgenda.lista.getSelectedIndex()).getID_Cita();

	}

}
