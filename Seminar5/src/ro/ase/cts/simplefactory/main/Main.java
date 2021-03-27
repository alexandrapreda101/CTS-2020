package ro.ase.cts.simplefactory.main;

import ro.ase.cts.simplefactory.clase.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Jucator portar = factory.getJucator(TipJucator.PORTAR,"Mihai",23);
        Jucator fundas = factory.getJucator(TipJucator.FUNDAS,"Andrei",24);
        System.out.println(portar.toString());
        System.out.println(fundas.toString());

        SingletonFactory singletonFactory = SingletonFactory.getInstance();
        Jucator portar2 = singletonFactory.getJucator(TipJucator.PORTAR,"Mihai",23);
        Jucator fundas2 = singletonFactory.getJucator(TipJucator.FUNDAS,"Andrei",24);
        System.out.println(portar.toString());
        System.out.println(fundas.toString());
    }
}
