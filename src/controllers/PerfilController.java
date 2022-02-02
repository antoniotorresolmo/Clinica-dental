package controllers;

public class PerfilController {
	
	public static void cargarDatos() {
		
		views.PnlPerfil.txtNombre.setText(views.FrmPrincipal.oMedico.getNombre());
		views.PnlPerfil.txtApellidos.setText(views.FrmPrincipal.oMedico.getApellidos());
		views.PnlPerfil.txtUsuario.setText(views.FrmPrincipal.oMedico.getUsuario());
		views.PnlPerfil.txtPassword.setText(views.FrmPrincipal.oMedico.getPassword());
		views.PnlPerfil.txtCorreo.setText(views.FrmPrincipal.oMedico.getCorreo());
		views.PnlPerfil.txtDireccion.setText(views.FrmPrincipal.oMedico.getDireccion());
		views.PnlPerfil.txtTelefono.setText(views.FrmPrincipal.oMedico.getTelefono());
		
	}

}
