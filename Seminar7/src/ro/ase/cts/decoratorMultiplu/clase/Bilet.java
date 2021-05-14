package ro.ase.cts.decoratorMultiplu.clase;

public class Bilet implements OperatorAbstract{
    private String numeEchipaGadza;
    private String numeEchipaOaspeti;

    public Bilet(String numeEchipaGadza, String numeEchipaOaspeti) {
        this.numeEchipaGadza = numeEchipaGadza;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }

    @Override
    public void rezervaBilet() {
        System.out.println(numeEchipaGadza+" joaca impotriva "+numeEchipaOaspeti);
    }

    @Override
    public String getNumeEchipaGazda() {
        return this.numeEchipaGadza;
    }

    @Override
    public String getNumeEchipaOaspeti() {
        return this.numeEchipaOaspeti;
    }

}
