package controllers;

public class RegistroController {

    public static String registrarse(){
        String sResultado = "";

        try {
            sResultado = logic.LogicMedico.insertar();

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        return sResultado;

    }
    
}
