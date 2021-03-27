package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.AbstractPrototype;
import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ClientStadion;

public class Main {
    public static void main(String[] args) {
        AbstractPrototype clientStadion1 = new ClientStadion("Alexandra",21);
        AbstractPrototype clientStadion2 = clientStadion1.copiaza();
        ClientStadion clientStadion3 = (ClientStadion) clientStadion1.copiaza();
        clientStadion3.setDenumire("Mihai");
        System.out.println(clientStadion1);
        System.out.println(clientStadion2);
        System.out.println(clientStadion3);

        Bilet bilet1 = new Bilet(1,"Steaua","Dinamo","29 martie, ora 21");
        Bilet bilet2 = (Bilet)bilet1.copiaza();
        bilet2.setCod(2);
        System.out.println(bilet1);
        System.out.println(bilet2);
    }
}
