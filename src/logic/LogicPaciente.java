package logic;

import org.json.JSONObject;

import models.Paciente;

public class LogicPaciente implements ILogic{

    public static Paciente getById(int iID_Paciente) throws Exception{

        String url = URI + "proyecto/Paciente/get_paciente.php?iID_Paciente=" + iID_Paciente;
                
        return stringToPaciente(controllers.CtrlPrincipal.peticionHttp(url));

    }

    public static Paciente stringToPaciente(String requestHttp) throws Exception{
        
		JSONObject jsonObject = new JSONObject(requestHttp);

		return objJson2Paciente(jsonObject);
		
	}
	
	
	public static Paciente objJson2Paciente(JSONObject jsonObj) {

		//Extraer los values del objeto JSON
		Integer ID_Paciente = jsonObj.getInt("ID_Paciente"); //PK
		String Nombre = jsonObj.getString("Nombre"); //NN
		String Apellidos= jsonObj.getString("Apellidos"); //NN
		String Usuario= jsonObj.getString("Usuario"); //NN
		String Password= jsonObj.getString("Password"); //NN
		String Correo= jsonObj.getString("Correo"); //NN
		String Direccion= jsonObj.getString("Direccion"); //NN
		String Telefono= jsonObj.getString("Telefono"); //NN
        String sDni = jsonObj.getString("DNI"); //NN
		
		//Crear el objeto Coche con los values extraidos
		Paciente oPaciente = new Paciente();
		oPaciente.setID_Paciente(ID_Paciente);
		oPaciente.setNombre(Nombre);
		oPaciente.setApellidos(Apellidos);
		oPaciente.setUsuario(Usuario);
		oPaciente.setPassword(Password);
		oPaciente.setCorreo(Correo);
		oPaciente.setDireccion(Direccion);
		oPaciente.setTelefono(Telefono);
        oPaciente.setDNI(sDni);
	
		return oPaciente;
	}
    
}
