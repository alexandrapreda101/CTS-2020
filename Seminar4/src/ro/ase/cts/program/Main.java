package ro.ase.cts.program;

import ro.ase.cts.apartament.Apartament;
import ro.ase.cts.singleton.AsigurareMedicala;
import ro.ase.cts.singletonLazy.AsigurareMedicalaLazy;

public class Main {
    public static void main(String[] args) {

        AsigurareMedicala asigurareMedicala1 = AsigurareMedicala.getInstance();
        AsigurareMedicala asigurareMedicala2 = AsigurareMedicala.getInstance();

        AsigurareMedicalaLazy asigurareMedicalaLazy1 = AsigurareMedicalaLazy.getInstance(3,"Maria",250.4f);
        AsigurareMedicalaLazy asigurareMedicalaLazy2 = AsigurareMedicalaLazy.getInstance(4,"Andrei",324.4f);

        asigurareMedicala1.setId(2);
        asigurareMedicala1.setContributie(324.2f);

        Apartament apartament1 = Apartament.getInstance(2,"Alexandra",true);
        Apartament apartament2 = Apartament.getInstance(3,"Mihai",false);
        apartament1.setEsteOcupat(false);
        apartament2.setNrCamere(5);

        System.out.println(asigurareMedicala1.toString());
        System.out.println(asigurareMedicala2.toString());

        System.out.println(asigurareMedicalaLazy1);
        System.out.println(asigurareMedicalaLazy2);

        System.out.println(apartament1);
        System.out.println(apartament2);
    }
}
