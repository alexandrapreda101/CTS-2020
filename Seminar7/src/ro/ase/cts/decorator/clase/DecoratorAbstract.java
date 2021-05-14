package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements CardAbstract {

    private CardAbstract cardAbstract;

    public DecoratorAbstract(CardAbstract cardAbstract) {
        this.cardAbstract = cardAbstract;
    }

    @Override
    public void platestePOS() {
        cardAbstract.platestePOS();
    }

    @Override
    public void platesteOnline() {
        cardAbstract.platesteOnline();
    }
    public abstract void platesteContactless();

    public CardAbstract getCardAbstract() {
        return cardAbstract;
    }
}
