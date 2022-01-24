package logic;

public class LogicMedico implements ILogic{
	
	public static void insertar() throws Exception {
		
		String nombre, apellidos, usuario, password, correo, direccion, telefono;
		
		nombre = view.FrmRegistro.txtNombreRegistro.getText();
		apellidos = view.FrmRegistro.txtApellidosRegistro.getText();
		usuario = view.FrmRegistro.txtUsuarioRegistro.getText();
		password = view.FrmRegistro.txtPasswordRegistro.getText();
		correo = view.FrmRegistro.txtCorreoRegistro.getText();
		direccion = view.FrmRegistro.txtDireccionRegistro.getText();
		telefono = view.FrmRegistro.txtTelefonoRegistro.getText();
		
		String url = URI + "proyecto/Medico/ins_medico.php?sNombre=" + nombre +"&sApellidos=" + apellidos + "&sUsuario=" + usuario + "&sPassword=" + password + "&sCorreo=" + correo + "&sDireccion=" + direccion + "&sTelefono=" + telefono;
		
		ctrl.CtrlPrincipal.peticionHttp(url);
		
	}

}
