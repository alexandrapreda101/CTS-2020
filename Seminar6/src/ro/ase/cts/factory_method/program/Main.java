package ro.ase.cts.factory_method.program;

import ro.ase.cts.factory_method.clase.*;


public class Main {

    public static void afisareInformatiiJucator(AbstractFactory abstractFactory, String nume, int nrMeciuri){
        Jucator jucator = abstractFactory.getJucator(nume, nrMeciuri);
        System.out.println(jucator);
    }
    public static void main(String[] args) {
        afisareInformatiiJucator(new AtacantFactory(),"Mihai",20);
        afisareInformatiiJucator(new FundasFactory(),"Andrei",30);
        afisareInformatiiJucator(new PortarFactory(),"Ionut",40);
        afisareInformatiiJucator(new MijlocasFactory(),"Horia",23);
    }
}
