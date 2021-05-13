package ro.ase.cts.factory_method.clase;

public class MijlocasFactory implements AbstractFactory{
    @Override
    public Jucator getJucator(String nume, int nrMeciuri) {
        return new Mijlocas(nume, nrMeciuri);
    }
}
