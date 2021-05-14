package ro.ase.cts.decoratorMultiplu.clase;

public class DecoratorSustinereEchipa extends DecoratorAbstract {

    public DecoratorSustinereEchipa(Bilet bilet) {
        super(bilet);
    }

    @Override
    public void rezervaBilet() {
        super.rezervaBilet();
        System.out.println("Sustinem "+getNumeEchipaGazda());
    }
}
