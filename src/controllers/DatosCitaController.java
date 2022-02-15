package controllers;

import java.util.List;

import javax.swing.JOptionPane;

import models.Cita;
import models.Paciente_Medico;
import views.JDialogDatosCita;
import views.PnlAgenda;

public class DatosCitaController {
	
	public static void cargarHoras() {
		
		views.JDialogDatosCita.cbHora.addItem("10:00");
		views.JDialogDatosCita.cbHora.addItem("11:00");
		views.JDialogDatosCita.cbHora.addItem("12:00");
		views.JDialogDatosCita.cbHora.addItem("13:00");
		views.JDialogDatosCita.cbHora.addItem("14:00");
		views.JDialogDatosCita.cbHora.addItem("15:00");
		views.JDialogDatosCita.cbHora.addItem("16:00");
		views.JDialogDatosCita.cbHora.addItem("17:00");
		
		try {
			List<Cita> lCitas = CtrlCitas.getCitas(views.PnlAgenda.sFechaCogida);
			
			lCitas.forEach(oCita -> {
				
				views.JDialogDatosCita.cbHora.removeItem(oCita.getHora());
				
			});
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void cargarOperaciones() {
		
		views.JDialogDatosCita.cbOperacion.addItem("Revision");
		views.JDialogDatosCita.cbOperacion.addItem("Implante");
		views.JDialogDatosCita.cbOperacion.addItem("Protesis");
		views.JDialogDatosCita.cbOperacion.addItem("Ortodoncia");
		views.JDialogDatosCita.cbOperacion.addItem("Endodoncia");
		views.JDialogDatosCita.cbOperacion.addItem("Blanqueamiento");
		views.JDialogDatosCita.cbOperacion.addItem("Ortopantomografia");
		
	}
	
	public static void cargarPacientes() {
		
		try {
			views.JDialogDatosCita.cbNombre.removeAllItems();
			if(JDialogDatosCita.lPacientes.size() > 0) {
				JDialogDatosCita.lPacientes.clear();
			}			
			
			List<Paciente_Medico> lPacienteMedico = logic.LogicPacienteMedico.getByIdMedico(views.FrmPrincipal.oMedico.getId_Medico());
			
			lPacienteMedico.forEach(oPacienteMedico -> {
				try {
					JDialogDatosCita.lPacientes.add(logic.LogicPaciente.getById(oPacienteMedico.getID_Paciente()));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			});
			
			JDialogDatosCita.lPacientes.forEach(oPaciente -> {
				
				JDialogDatosCita.cbNombre.addItem(oPaciente.getNombre() + " " + oPaciente.getApellidos());
				
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void addCita() {
		
		String sFecha = views.PnlAgenda.sFechaCogida;
		String sHora = (String) views.JDialogDatosCita.cbHora.getSelectedItem();
		String sOperacion = (String) views.JDialogDatosCita.cbOperacion.getSelectedItem();
		int iID_Medico = views.FrmPrincipal.oMedico.getId_Medico();
		int iID_Paciente = views.JDialogDatosCita.lPacientes.get(views.JDialogDatosCita.cbNombre.getSelectedIndex()).getID_Paciente();
		
		Cita oCita = new Cita(0, sFecha, sHora, sOperacion, (byte) 0, iID_Medico, iID_Paciente);

		try {
			logic.LogicCita.insertar(oCita);
			
			views.JDialogDatosCita.cbNombre.removeAllItems();
			views.JDialogDatosCita.cbOperacion.removeAllItems();
			views.JDialogDatosCita.cbHora.removeAllItems();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido insertar", "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}

	public static void actualizarCita() {

		int iID_Cita = JDialogDatosCita.iCitaSeleccionada;
		String sFecha = views.PnlAgenda.sFechaCogida;
		String sHora = (String) views.JDialogDatosCita.cbHora.getSelectedItem();
		String sOperacion = (String) views.JDialogDatosCita.cbOperacion.getSelectedItem();
		int iID_Medico = views.FrmPrincipal.oMedico.getId_Medico();
		int iID_Paciente = views.JDialogDatosCita.lPacientes.get(views.JDialogDatosCita.cbNombre.getSelectedIndex()).getID_Paciente();
		
		Cita oCita = new Cita(iID_Cita, sFecha, sHora, sOperacion, (byte) 0, iID_Medico, iID_Paciente);

		try {
			logic.LogicCita.actualizar(oCita);
			
			views.JDialogDatosCita.cbNombre.removeAllItems();
			views.JDialogDatosCita.cbOperacion.removeAllItems();
			views.JDialogDatosCita.cbHora.removeAllItems();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido actualizar", "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}

}
