package ro.ase.cts.adaptor.clase;

public class AdapterCreditClasa extends Leasing implements CreditAbstract {

    public AdapterCreditClasa(String numeClient, float suma) {
        super(numeClient, suma);
    }

    @Override
    public void oferaCredit() {
        super.creeazaLeasing();
    }
}
