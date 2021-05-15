package ro.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract {
    private String name;

    public Spectator(String name) {
        this.name = name;
    }

    @Override
    public void asezareCoada() {
        System.out.println(name + "s-a asezat la coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(name + "a prezentat biletul");
    }

    @Override
    public void realizeazaControlCorporal() {
        System.out.println(name + "a fost controlat corporal");

    }

    @Override
    public void ocupaLoc() {
        System.out.println(name + " a ocupat locul");

    }
}
