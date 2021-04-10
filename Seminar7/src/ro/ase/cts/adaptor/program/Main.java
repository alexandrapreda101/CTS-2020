package ro.ase.cts.adaptor.program;

import ro.ase.cts.adaptor.clase.AdapterCredit;
import ro.ase.cts.adaptor.clase.AdapterCreditClasa;
import ro.ase.cts.adaptor.clase.CreditAbstract;
import ro.ase.cts.adaptor.clase.Leasing;

public class Main {

    public static void creeazaCredit(CreditAbstract credit){
        credit.oferaCredit();
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Andrei",20000);
        //leasing.creeazaLeasing();

        AdapterCredit adapter = new AdapterCredit(leasing);
        creeazaCredit(adapter);

        AdapterCreditClasa adapterCreditClasa = new AdapterCreditClasa("Mihai",30000);
        creeazaCredit(adapterCreditClasa);
    }
}
