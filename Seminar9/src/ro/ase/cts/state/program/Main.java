package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Libera;
import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.Ocupata;
import ro.ase.cts.state.clase.Rezervata;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(20);
        masa.rezervaMasa("Mihai");
        masa.rezervaMasa("Gigel");
        //masa.setStareMasa(new Libera());

        Masa masa2 = new Masa(21);
        Rezervata rezervata = new Rezervata();
        Ocupata ocupata = new Ocupata();
        Libera libera = new Libera();
        rezervata.modificare(masa2);
        ocupata.modificare(masa2);


    }
}
