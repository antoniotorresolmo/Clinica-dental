package controllers;

import java.util.ArrayList;
import java.util.List;

import logic.LogicPaciente;
import logic.LogicPacienteMedico;
import models.*;
import views.FrmPrincipal;
import views.PnlPacientes;

public class PnlPacientesController {

    public static void cargarLista() {

        try {
            List<Paciente_Medico> lPacienteMedico = LogicPacienteMedico
                    .getByIdMedico(FrmPrincipal.oMedico.getId_Medico());
            views.PnlPacientes.lPacientes = new ArrayList<Paciente>();

            lPacienteMedico.forEach(oPacienteMedico -> {

                try {
                    views.PnlPacientes.lPacientes.add(LogicPaciente.getById(oPacienteMedico.getID_Paciente()));
                    PnlPacientes.listPacientes
                            .add(CtrlPacientes.getNombreApellidosPaciente(oPacienteMedico.getID_Paciente()));
                } catch (Exception e) {
                    e.printStackTrace();
                }

            });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void cargarPaciente() {

        int iID_Paciente = views.PnlPacientes.listPacientes.getSelectedIndex();
        Paciente oPaciente = views.PnlPacientes.lPacientes.get(iID_Paciente);

        views.PnlPacientes.txtNombre.setText(oPaciente.getNombre());
        views.PnlPacientes.txtApellidos.setText(oPaciente.getApellidos());
        views.PnlPacientes.txtDireccion.setText(oPaciente.getDireccion());
        views.PnlPacientes.txtCorreo.setText(oPaciente.getCorreo());
        views.PnlPacientes.txtTelefono.setText(oPaciente.getTelefono());
        views.PnlPacientes.txtDni.setText(oPaciente.getDNI());

        // Cargar historial

        try {

            List<Historial> lHistorial = logic.LogicHistorial.getByIdPaciente(oPaciente.getID_Paciente());

            StringBuilder sbHistorial = new StringBuilder();

            lHistorial.forEach(oHistorial -> {

                sbHistorial.append(oHistorial.getOperacion() + "\n" + oHistorial.getObservacines() + "\n\n");

            });

            views.PnlPacientes.textPaneHistorial.setText(sbHistorial.toString());

        } catch (Exception e) {
            views.PnlPacientes.textPaneHistorial.setText("Vacío.");
            //e.printStackTrace();
        }

        // Cargar recetario

        try {
            
            List<Receta> lRecetas = logic.LogicRecetario.getByIdPaciente(oPaciente.getID_Paciente());

            StringBuilder sbReceta = new StringBuilder();

            lRecetas.forEach(oReceta -> {

                sbReceta.append(oReceta.getDescripcion() + "\n\n");

            });

            views.PnlPacientes.textPaneRecetario.setText(sbReceta.toString());

        } catch (Exception e) {
            views.PnlPacientes.textPaneRecetario.setText("Vacío.");
        }

    }

}
