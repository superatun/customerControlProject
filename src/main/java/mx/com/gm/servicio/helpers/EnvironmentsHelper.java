package mx.com.gm.servicio.helpers;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvironmentsHelper {

    public static void SetEnvironments(String[] environments){
        Dotenv dotenv = Dotenv.load();
        for (String environment : environments) {
            System.setProperty(environment, dotenv.get(environment));
        }
    }
}
