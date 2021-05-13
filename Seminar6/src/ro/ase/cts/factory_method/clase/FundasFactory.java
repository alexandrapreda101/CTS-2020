package ro.ase.cts.factory_method.clase;

public class FundasFactory implements AbstractFactory {

    @Override
    public Jucator getJucator(String nume, int nrMeciuri) {
        return new Fundas(nume, nrMeciuri);
    }
}
