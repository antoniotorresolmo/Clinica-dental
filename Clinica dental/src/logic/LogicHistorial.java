package logic;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import models.Historial;

public class LogicHistorial implements ILogic{

    public static List<Historial> getByIdPaciente(int iID_Paciente) throws Exception{

        String url = URI + "proyecto/Paciente/get_paciente.php?iID_Paciente=" + iID_Paciente;
        
        return stringToListHistorial(controllers.CtrlPrincipal.peticionHttp(url));

    }

    private static List<Historial> stringToListHistorial(String requestHttp) {

        List<Historial> lHistorial = new ArrayList<>();
	
		JSONArray jsonArray = new JSONArray(requestHttp);
		System.out.println(jsonArray.length());
		
		
		for(int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObj = jsonArray.getJSONObject(i);
			Historial oHistorial = objJson2Historial(jsonObj);
			lHistorial.add(oHistorial);
		}
		
		return lHistorial;

    }

    private static Historial objJson2Historial(JSONObject jsonObject) {

        int iID_Consulta = jsonObject.getInt("ID_Consulta");
        String sOperacion = jsonObject.getString("Operacion");
        String sObservaciones = jsonObject.getString("Observaciones");
        int iID_Paciente = jsonObject.getInt("ID_Paciente");
		
		Historial oHistorial = new Historial();
        oHistorial.setId_Consulta(iID_Consulta);
        oHistorial.setOperacion(sOperacion);
        oHistorial.setObservacines(sObservaciones);
        oHistorial.setId_Paciente(iID_Paciente);
	
		return oHistorial;
    }
    
}
