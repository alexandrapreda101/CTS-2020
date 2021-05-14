package ro.ase.cts.decoratorMultiplu.clase;

public class DecoratorPasteFericit extends DecoratorAbstract{
    public DecoratorPasteFericit(Bilet bilet) {
        super(bilet);
    }

    @Override
    public void rezervaBilet() {
        super.rezervaBilet();
        System.out.println("Paste fericit!");
    }
}
