package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(100,2,19);
        Rezervare rezervare2 = new Rezervare(183,4,15);
        Rezervare rezervare3 = new Rezervare(130,5,12);

        FabricaClienti fabricaClienti = new FabricaClienti();

        Client client1 = fabricaClienti.getClient("mihai@test.com");
        client1.printeazaInformatiiRezervare(rezervare1);
        fabricaClienti.getClient("andrei@test.com").printeazaInformatiiRezervare(rezervare2);
        fabricaClienti.getClient("mihai@test.com").printeazaInformatiiRezervare(rezervare3);
    }
}
