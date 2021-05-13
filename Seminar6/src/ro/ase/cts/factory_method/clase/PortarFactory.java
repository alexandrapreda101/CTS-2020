package ro.ase.cts.factory_method.clase;

public class PortarFactory implements AbstractFactory{
    @Override
    public Jucator getJucator(String nume, int nrMeciuri) {
        return new Portar(nume,nrMeciuri);
    }
}
