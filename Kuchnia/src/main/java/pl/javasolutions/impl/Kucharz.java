package pl.javasolutions.impl;

import pl.javasolutions.api.IKucharz;

public class Kucharz implements IKucharz {

    public void przygotujPizze() {
        System.out.println("Kucharz przygotowywuje Pizze");
    }

    public void przygotujPizze(int idPizzy) {
        System.out.println("Kucharz przygotowywuje pizze o id " + idPizzy);
    }

    public void wydajPizze() {
        System.out.println("Kucharz wydaje Pizze");
    }

    public void pobierzSkladnikZMagazynu() {
        System.out.println("Kucharz pobiera składniki");
    }

    public void pobierzSkladnikZMagazynu(int liczbaSkladnikow) {
        System.out.println("Kucharz pobiera " + liczbaSkladnikow + " składników");
    }
}
