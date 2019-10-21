package pl.javasolutions.Kuchnia;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.javasolutions.api.IKucharz;
import pl.javasolutions.api.IZapiekanka;
import pl.javasolutions.config.AppConfig;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IKucharz k = (IKucharz)context.getBean("kucharz");
        ((IZapiekanka)k).przygotujZapiekanke();

        /*
        k.pobierzSkladnikZMagazynu(1);
        k.przygotujPizze(2);
        k.wydajPizze();
        IKucharz pomocnik = (IKucharz) context.getBean("pomocnikKucharza");
        pomocnik.pobierzSkladnikZMagazynu();
         */

    }
}
