package logic;

import models.Cita;

public class LogicCita implements ILogic {
	
	public static void insertar(Cita oCita) throws Exception {
		
		String sUrl = URI + "proyecto/Cita/ins_cita.php?sDia=" + oCita.getDia()
		+ "&sHora=" + oCita.getHora()
		+ "&sOperacion=" + oCita.getOperacion()
		+ "&bTerminada=" + oCita.getTerminada()
		+ "&iID_Medico=" + oCita.getID_Medico()
		+"&iID_Paciente=" + oCita.getID_Paciente();
		
		controllers.CtrlPrincipal.peticionHttp(sUrl);
		
	}

    public static void eliminar(int iID_Cita) throws Exception{
    	
    	String url = URI + "proyecto/Cita/del_cita.php?iID_Cita=" + iID_Cita;
        controllers.CtrlPrincipal.peticionHttp(url);


    }

	public static void actualizar(Cita oCita) throws Exception {

		String sUrl = URI + "proyecto/Cita/upd_cita.php?iId_Cita=" + oCita.getID_Cita()
		+ "&sDia=" + oCita.getDia()
		+ "&sHora=" + oCita.getHora()
		+ "&sOperacion=" + oCita.getOperacion()
		+ "&bTerminada=" + oCita.getTerminada()
		+ "&iID_Medico=" + oCita.getID_Medico()
		+"&iID_Paciente=" + oCita.getID_Paciente();
				
		controllers.CtrlPrincipal.peticionHttp(sUrl);
		
	}

	public static void terminarCita(int iID_Cita) throws Exception {
		
		String sUrl = URI + "proyecto/Cita/terminar_cita.php?iID_Cita=" + iID_Cita;
		
		controllers.CtrlPrincipal.peticionHttp(sUrl);
		
	}
    
}
