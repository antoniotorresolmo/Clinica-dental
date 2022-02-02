package logic;

public class LogicCita implements ILogic {

    public static void eliminar(int iID_Cita){

        try {
            String url = URI + "proyecto/Cita/del_cita.php?iID_Cita=" + iID_Cita;
            controllers.CtrlPrincipal.peticionHttp(url);

            // Abrir pantalla principal
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
