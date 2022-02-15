package controllers;

import models.Cita;
import java.awt.*;

public class PnlInicioController {

	public static void cargarTodo() {
		try {
			vaciarBotones();
			views.PnlInicio.lstCitas = controllers.CtrlCitas.getCitas(views.PnlInicio.sFecha);
			rellenarBotones();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void vaciarBotones() {
		views.PnlInicio.btnCita10.setText(" - ");
		views.PnlInicio.btnCita10.setForeground(Color.BLACK);
		views.PnlInicio.btnCita11.setText(" - ");
		views.PnlInicio.btnCita11.setForeground(Color.BLACK);
		views.PnlInicio.btnCita12.setText(" - ");
		views.PnlInicio.btnCita12.setForeground(Color.BLACK);
		views.PnlInicio.btnCita13.setText(" - ");
		views.PnlInicio.btnCita13.setForeground(Color.BLACK);
		views.PnlInicio.btnCita14.setText(" - ");
		views.PnlInicio.btnCita14.setForeground(Color.BLACK);
		views.PnlInicio.btnCita15.setText(" - ");
		views.PnlInicio.btnCita15.setForeground(Color.BLACK);
		views.PnlInicio.btnCita16.setText(" - ");
		views.PnlInicio.btnCita16.setForeground(Color.BLACK);
		views.PnlInicio.btnCita17.setText(" - ");
		views.PnlInicio.btnCita17.setForeground(Color.BLACK);
	}

	public static void rellenarBotones() throws Exception {
		views.PnlInicio.lblFecha.setText(views.PnlInicio.sFecha);
		for (int i = 0; i < views.PnlInicio.lstCitas.size(); i++) {
			switch (views.PnlInicio.lstCitas.get(i).getHora()) {

			case "10:00":

				views.PnlInicio.btnCita10.setText(
						CtrlPacientes.getNombreApellidosPaciente(views.PnlInicio.lstCitas.get(i).getID_Paciente())
								+ " - " + views.PnlInicio.lstCitas.get(i).getOperacion());

				if (views.PnlInicio.lstCitas.get(i).getTerminada() == 1) {
					views.PnlInicio.btnCita10.setForeground(Color.RED);

				}
				break;
			case "11:00":
				views.PnlInicio.btnCita11.setText(
						CtrlPacientes.getNombreApellidosPaciente(views.PnlInicio.lstCitas.get(i).getID_Paciente())
								+ " - " + views.PnlInicio.lstCitas.get(i).getOperacion());
				if (views.PnlInicio.lstCitas.get(i).getTerminada() == 1) {
					views.PnlInicio.btnCita11.setForeground(Color.RED);
				}
				break;
			case "12:00":
				views.PnlInicio.btnCita12.setText(
						CtrlPacientes.getNombreApellidosPaciente(views.PnlInicio.lstCitas.get(i).getID_Paciente())
								+ " - " + views.PnlInicio.lstCitas.get(i).getOperacion());
				if (views.PnlInicio.lstCitas.get(i).getTerminada() == 1) {
					views.PnlInicio.btnCita12.setForeground(Color.RED);
				}
				break;
			case "13:00":
				views.PnlInicio.btnCita13.setText(
						CtrlPacientes.getNombreApellidosPaciente(views.PnlInicio.lstCitas.get(i).getID_Paciente())
								+ " - " + views.PnlInicio.lstCitas.get(i).getOperacion());
				if (views.PnlInicio.lstCitas.get(i).getTerminada() == 1) {
					views.PnlInicio.btnCita13.setForeground(Color.RED);
				}
				break;
			case "14:00":
				views.PnlInicio.btnCita14.setText(
						CtrlPacientes.getNombreApellidosPaciente(views.PnlInicio.lstCitas.get(i).getID_Paciente())
								+ " - " + views.PnlInicio.lstCitas.get(i).getOperacion());
				if (views.PnlInicio.lstCitas.get(i).getTerminada() == 1) {
					views.PnlInicio.btnCita14.setForeground(Color.RED);
				}
				break;
			case "15:00":
				views.PnlInicio.btnCita15.setText(
						CtrlPacientes.getNombreApellidosPaciente(views.PnlInicio.lstCitas.get(i).getID_Paciente())
								+ " - " + views.PnlInicio.lstCitas.get(i).getOperacion());
				if (views.PnlInicio.lstCitas.get(i).getTerminada() == 1) {
					views.PnlInicio.btnCita15.setForeground(Color.RED);
				}
				break;
			case "16:00":
				views.PnlInicio.btnCita16.setText(
						CtrlPacientes.getNombreApellidosPaciente(views.PnlInicio.lstCitas.get(i).getID_Paciente())
								+ " - " + views.PnlInicio.lstCitas.get(i).getOperacion());
				if (views.PnlInicio.lstCitas.get(i).getTerminada() == 1) {
					views.PnlInicio.btnCita16.setForeground(Color.RED);
				}
				break;
			case "17:00":
				views.PnlInicio.btnCita17.setText(
						CtrlPacientes.getNombreApellidosPaciente(views.PnlInicio.lstCitas.get(i).getID_Paciente())
								+ " - " + views.PnlInicio.lstCitas.get(i).getOperacion());
				if (views.PnlInicio.lstCitas.get(i).getTerminada() == 1) {
					views.PnlInicio.btnCita17.setForeground(Color.RED);
				}
				break;
			}

		}

	}

	public static Cita obtenerCitaPorHora(String sHora) {

		Cita oCita = new Cita();

		for (Cita oCitaLista : views.PnlInicio.lstCitas) {

			if (oCitaLista.getHora().equals(sHora)) {
				oCita = oCitaLista;
			}

		}

		return oCita;

	}

}
