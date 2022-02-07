package logic;

import java.util.*;

import org.json.JSONArray;
import org.json.JSONObject;

import models.Receta;

public class LogicRecetario implements ILogic{

    public static List<Receta> getByIdPaciente(int iID_Paciente) throws Exception{

        String url = URI + "proyecto/Receta/lst_receta_by_idpaciente.php?iID_Paciente=" + iID_Paciente;
        
        return stringToListReceta(controllers.CtrlPrincipal.peticionHttp(url));

    }

    private static List<Receta> stringToListReceta(String requestHttp) {

        List<Receta> lRecetas = new ArrayList<>();
	
		JSONArray jsonArray = new JSONArray(requestHttp);
		System.out.println(jsonArray.length());
		
		
		for(int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObj = jsonArray.getJSONObject(i);
			Receta oReceta = objJson2Receta(jsonObj);
			lRecetas.add(oReceta);
		}
		
		return lRecetas;

    }

    private static Receta objJson2Receta(JSONObject jsonObject) {

        int iID_Receta = jsonObject.getInt("ID_Receta");
        String sDescripcion = jsonObject.getString("Descripcion");
        int iID_Paciente = jsonObject.getInt("ID_Paciente");
        int iID_Medico = jsonObject.getInt("ID_Medico");
		
		Receta oReceta = new Receta();
        oReceta.setID_Receta(iID_Receta);
        oReceta.setDescripcion(sDescripcion);
        oReceta.setID_Paciente(iID_Paciente);
        oReceta.setID_Medico(iID_Medico);
	
		return oReceta;
    }

	public static void insertar(Receta oReceta) throws Exception {

		String sUrl = URI + "proyecto/Receta/ins_receta.php?sDescripcion=" + oReceta.getDescripcion()
		+ "&iID_Medico=" + oReceta.getID_Medico()
		+ "&iID_Paciente=" + oReceta.getID_Paciente();
		
		System.out.println(sUrl);
		
		controllers.CtrlPrincipal.peticionHttp(sUrl);
		
	}
    
}
