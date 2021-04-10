package ro.ase.cts.adaptor.clase;

public class AdapterCredit implements CreditAbstract{

    private Leasing leasing;

    public AdapterCredit(Leasing leasing){
        this.leasing = leasing;
    }

    @Override
    public void oferaCredit() {
        leasing.creeazaLeasing();
    }
}
