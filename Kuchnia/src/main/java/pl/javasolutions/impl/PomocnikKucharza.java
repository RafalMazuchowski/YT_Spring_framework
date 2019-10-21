package pl.javasolutions.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pl.javasolutions.api.IKucharz;

@Deprecated
public class PomocnikKucharza implements IKucharz{

@Autowired
@Qualifier("pomocnik_kucharza")
    private IKucharz kucharz;

    public void pobierzSkladnikZMagazynu() {
        System.out.println("Pomocnik pobiera składniki z magazynu");
    }

    public void pobierzSkladnikZMagazynu(int liczbaSkladnikow) {
        System.out.println("Pomocnik pobiera " + liczbaSkladnikow + " składników z magazynu");
    }

    public void przygotujPizze() {
        System.out.println("Pomocnik oddelegowuje przygotowanie do kucharza");
        kucharz.przygotujPizze();
    }

    public void przygotujPizze(int idPizzy) {
        System.out.println("Pomocnik oddelegowuje przygotowanie pizzy: " + idPizzy + " do kucharza");
        kucharz.przygotujPizze(idPizzy);
    }

    public void wydajPizze() {
        System.out.println("Pomocnik wydaje pizze");
    }
}
