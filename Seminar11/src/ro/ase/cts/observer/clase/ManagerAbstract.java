package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAbstract {
    List<Observer> listaClientiAbonati;

    public ManagerAbstract() {
        listaClientiAbonati = new ArrayList<>();
    }

    public void aboneaza(Observer observer){
        listaClientiAbonati.add(observer);

    }
    public  void dezaboneaza(Observer observer){
        listaClientiAbonati.remove(observer);
    }
    public void notifica(String mesaj){
        for(Observer observer: listaClientiAbonati){
            observer.primesteAnunt(mesaj);
        }
    }
}
