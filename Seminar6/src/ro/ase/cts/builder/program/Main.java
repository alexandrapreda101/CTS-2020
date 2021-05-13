package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Builder;
import ro.ase.cts.builder.clase.BuilderV2;
import ro.ase.cts.builder.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1,true,true,false,"rock");
        System.out.println(rezervare1);
        Rezervare rezervare2 = new Builder().setCod(2).setgenMuzica("punk").setMancareInclusa(true).
                setMuzicaAmbientala(true).setScaunErgonomic(false).build();
        System.out.println(rezervare2);
        Rezervare rezervare3 = new Builder().setCod(3).setgenMuzica("indie").setMuzicaAmbientala(true).build();
        System.out.println(rezervare3);
        Rezervare rezervare4 = new Builder(4).setgenMuzica("hiphop").setMancareInclusa(true).build();
        System.out.println(rezervare4);

        Builder builder = new Builder();
        Rezervare r1;
        Rezervare r2;
        r1 = builder.setgenMuzica("jazz").build();
        r2 = builder.setgenMuzica("latino").build();
        System.out.println(r1);
        System.out.println(r2);

        BuilderV2 builderV2 = new BuilderV2().setGenMuzica("rap").setMuzicaAmbientala(true);
        Rezervare rezervare5 = builderV2.setCod(5).build();
        Rezervare rezervare6 = builderV2.setCod(6).build();
        Rezervare rezervare7 = builderV2.setCod(7).build();
        System.out.println(rezervare5);
        System.out.println(rezervare6);
        System.out.println(rezervare7);
    }
}
