package ro.ase.cts.decoratorMultiplu.clase;

public class DecoratorAbstract implements OperatorAbstract{

    private Bilet bilet;

    public DecoratorAbstract(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void rezervaBilet() {
        //System.out.println("Sustinem "+bilet.getNumeEchipaGazda());

    }

    @Override
    public String getNumeEchipaGazda() {
        return bilet.getNumeEchipaGazda();
    }

    @Override
    public String getNumeEchipaOaspeti() {
        return bilet.getNumeEchipaOaspeti();
    }
}
