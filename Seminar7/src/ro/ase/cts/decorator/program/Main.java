package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorContactless;
import ro.ase.cts.decorator.clase.DecoratorContactlessTelefon;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Andrei",144);
        card.platestePOS();
        card.platesteOnline();

        DecoratorAbstract decoratorAbstract = new DecoratorContactless(card);
        decoratorAbstract.platesteOnline();
        decoratorAbstract.platestePOS();
        decoratorAbstract.platesteContactless();

        DecoratorAbstract decoratorAbstract1 =new DecoratorContactlessTelefon(card);
        decoratorAbstract1.platesteContactless();

        DecoratorAbstract decoratorAbstract2 = new DecoratorContactlessTelefon(decoratorAbstract);

        //decoratorAbstract2.platesteContactless();
    }
}
