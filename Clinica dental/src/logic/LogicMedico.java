package logic;

public class LogicMedico implements ILogic{
	
	public static void insertar() throws Exception {
		
		String nombre, apellidos, usuario, password, correo, direccion, telefono;
		
		nombre = views.JDialogRegistro.txtNombre.getText();
		apellidos = views.JDialogRegistro.txtApellidos.getText();
		usuario = views.JDialogRegistro.txtUsuario.getText();
		password = views.JDialogRegistro.txtPassword.getText();
		correo = views.JDialogRegistro.txtCorreo.getText();
		direccion = views.JDialogRegistro.txtDireccion.getText();
		telefono = views.JDialogRegistro.txtTelefono.getText();
		
		String url = URI + "proyecto/Medico/ins_medico.php?sNombre=" + nombre +"&sApellidos=" + apellidos + "&sUsuario=" + usuario + "&sPassword=" + password + "&sCorreo=" + correo + "&sDireccion=" + direccion + "&sTelefono=" + telefono;
		
		controllers.CtrlPrincipal.peticionHttp(url);
		
	}

}
