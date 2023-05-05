package support;

import runner.RunCucumber;
import java.util.Random;

public class Utils extends RunCucumber {

    public static String getRandomEmail() {
        String email_init = "qazando_";
        String email_final = "@qazando.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }
}
