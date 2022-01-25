package controllers;

import java.io.*;

import models.Paciente;

public class LoginController implements IController {

    public static void getPaciente(String usuario, String pass) throws Exception {

		String url = URI + "get_medico_login.php?Usuario=" + usuario+"&Password="+pass;
		String requestHttp = CtrlPrincipal.peticionHttp(url);
		views.JDialogLogin.oMedico = logic.LogicMedico.stringToMedico(requestHttp);

        if(views.JDialogLogin.cbRecordar.isSelected()){
            guardarDatos();
        }else{
            borrarDatos();
        }
		
	}

    private static void borrarDatos() {

        Paciente oPaciente = new Paciente();

        try {
			FileOutputStream fosFichero = new FileOutputStream(new File("obj/savedUser.obj"));
			ObjectOutputStream oosBuffer = new ObjectOutputStream(fosFichero);
			
			oosBuffer.writeObject(oPaciente);
			
			oosBuffer.close();
			fosFichero.close();
		} catch (FileNotFoundException e) {
			System.err.println("El fichero no existe.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Error en el acceso al fichero.");
			e.printStackTrace();
		}

    }

    public static void cargarDatos(){

        Paciente oPaciente = new Paciente();

        try {
			FileInputStream fisFichero = new FileInputStream(new File("obj/savedUser.obj"));
			ObjectInputStream oisBuffer = new ObjectInputStream(fisFichero);
			
			oPaciente = (Paciente) oisBuffer.readObject();
			
			oisBuffer.close();
			fisFichero.close();
		} catch (FileNotFoundException e) {
			System.err.println("El fichero no existe.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Error en el acceso al fichero.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("El fichero no contiene el tipo de objeto especificado.");
			e.printStackTrace();
		}

        if(oPaciente.getUsuario() != null){
            views.JDialogLogin.txtUsername.setText(oPaciente.getUsuario());
            views.JDialogLogin.txtPassword.setText(oPaciente.getPassword());
            views.JDialogLogin.cbRecordar.setSelected(true);
        }

    }

    public static void guardarDatos(){

        Paciente oPaciente = new Paciente(views.JDialogLogin.txtUsername.getText(), views.JDialogLogin.txtPassword.getText());

        try {
			FileOutputStream fosFichero = new FileOutputStream(new File("obj/savedUser.obj"));
			ObjectOutputStream oosBuffer = new ObjectOutputStream(fosFichero);
			
			oosBuffer.writeObject(oPaciente);
			
			oosBuffer.close();
			fosFichero.close();
		} catch (FileNotFoundException e) {
			System.err.println("El fichero no existe.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Error en el acceso al fichero.");
			e.printStackTrace();
		}

    }
    
}
