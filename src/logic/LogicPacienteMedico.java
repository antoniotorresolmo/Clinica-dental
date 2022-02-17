package logic;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import models.Paciente_Medico;

public class LogicPacienteMedico implements ILogic{

    public static List<Paciente_Medico> getByIdMedico(int iID_Medico) throws Exception{

        String url = URI + "proyecto/Paciente_Medico/lst_paciente_medico_by_idmedico.php?iID_Medico=" + iID_Medico;
        
        return stringToListPacienteMedico(controllers.CtrlPrincipal.peticionHttp(url));

    }

    public static List<Paciente_Medico> stringToListPacienteMedico(String requestHttp) throws Exception{
		List<Paciente_Medico> lPacienteMedico = new ArrayList<>();
	
		JSONArray jsonArray = new JSONArray(requestHttp);
		
		
		for(int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObj = jsonArray.getJSONObject(i);
			Paciente_Medico c = objJson2PacienteMedico(jsonObj);
			lPacienteMedico.add(c);
		}
		
		return lPacienteMedico;
	}
	
	
	public static Paciente_Medico objJson2PacienteMedico(JSONObject jsonObj) {

		//Extraer los values del objeto JSON
		Integer iID_Medico = jsonObj.getInt("ID_Medico"); //PK
        Integer iID_Paciente = jsonObj.getInt("ID_Paciente"); //PK
		
		//Crear el objeto Coche con los values extraidos
		Paciente_Medico oPacienteMedico = new Paciente_Medico();
		oPacienteMedico.setID_Medico(iID_Medico);
        oPacienteMedico.setID_Paciente(iID_Paciente);
			
		return oPacienteMedico;
	}
    
}
