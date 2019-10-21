package pl.javasolutions.api;

public interface IKucharz {

    void pobierzSkladnikZMagazynu();
    void pobierzSkladnikZMagazynu(int liczbaSkladnikow);
    void przygotujPizze();
    void przygotujPizze(int idPizzy);
    void wydajPizze();
}
