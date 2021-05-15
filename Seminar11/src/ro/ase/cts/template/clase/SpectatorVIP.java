package ro.ase.cts.template.clase;

public class SpectatorVIP extends SpectatorAbstract {
    private String name;
    private String loja;

    public SpectatorVIP(String name, String loja) {
        this.name = name;
        this.loja = loja;
    }

    @Override
    public void asezareCoada() {
        System.out.println(name+ "intra direct pe intrarea de VIP");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(name+ "prezinta biletul");

    }

    @Override
    public void realizeazaControlCorporal() {
        System.out.println(name+ "a fost controlat corporal");

    }

    @Override
    public void ocupaLoc() {
        System.out.println(name+ "ocupa loc in loja "+loja);
    }
}
