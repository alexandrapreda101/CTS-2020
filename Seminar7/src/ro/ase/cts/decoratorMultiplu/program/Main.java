package ro.ase.cts.decoratorMultiplu.program;

import ro.ase.cts.decoratorMultiplu.clase.Bilet;
import ro.ase.cts.decoratorMultiplu.clase.DecoratorAbstract;
import ro.ase.cts.decoratorMultiplu.clase.DecoratorPasteFericit;
import ro.ase.cts.decoratorMultiplu.clase.DecoratorSustinereEchipa;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new Bilet("Steaua","Dinamo");
        bilet.rezervaBilet();
        DecoratorAbstract decoratorAbstract = new DecoratorSustinereEchipa(bilet);
        decoratorAbstract.rezervaBilet();
        DecoratorAbstract decoratorAbstract1 = new DecoratorPasteFericit(bilet);
        decoratorAbstract1.rezervaBilet();
    }
}
