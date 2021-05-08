package ro.ase.cts.chainofresp.program;

import ro.ase.cts.chainofresp.clase.Cont;
import ro.ase.cts.chainofresp.clase.ContCredit;
import ro.ase.cts.chainofresp.clase.ContCurent;
import ro.ase.cts.chainofresp.clase.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contCurent = new ContCurent(200);
        Cont contEconomii = new ContEconomii(500);
        Cont contCredit = new ContCredit(700);

        contCurent.setCont(contCredit);
        contCredit.setCont(contEconomii);

        contCurent.realizeazaPlata(150);
        contCurent.realizeazaPlata(500);
        contCurent.realizeazaPlata(300);
        contCurent.realizeazaPlata(600);

    }
}
