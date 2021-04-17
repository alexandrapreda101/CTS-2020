package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Sectiune bauturi = new Sectiune("bauturi");
        Sectiune deserturi = new Sectiune("deserturi");

        Item cola = new Item("Cola");
        Item schweppes = new Item("Schweppes");

        Item clatite = new Item("Clatite");
        Item tiramissu = new Item("Tiramissu");

        bauturi.adaugaComponenta(cola);
        bauturi.adaugaComponenta(schweppes);
        deserturi.adaugaComponenta(tiramissu);
        deserturi.adaugaComponenta(clatite);

        Sectiune meniu = new Sectiune("Meniu");
        meniu.adaugaComponenta(bauturi);
        meniu.adaugaComponenta(deserturi);

        meniu.afisareDescriere();
    }
}
