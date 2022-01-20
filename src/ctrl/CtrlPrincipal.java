package ctrl;

public class CtrlPrincipal {

	public static void inicio() {
		
		new view.JDialogLogin();
	
		
	}
	
	public static void finalizar() {
		
		System.exit(0);
		
	}
	
	public static void camposEditables() {
		view.PnlPerfil.txtNombreMedico.setEditable(true);
		view.PnlPerfil.txtApellidosMedico.setEditable(true);
		view.PnlPerfil.txtUsuarioMedico.setEditable(true);
		view.PnlPerfil.txtPasswordMedico.setEditable(true);
		view.PnlPerfil.txtCorreoMedico.setEditable(true);
		view.PnlPerfil.txtDireccionMedico.setEditable(true);
		view.PnlPerfil.txtTelefonoMedico.setEditable(true);
		
	}
	

}
