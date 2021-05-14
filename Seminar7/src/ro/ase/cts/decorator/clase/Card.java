package ro.ase.cts.decorator.clase;

public class Card implements CardAbstract {
    private String titular;
    private int numarCard;

    public Card(String titular, int numarCard) {
        this.titular = titular;
        this.numarCard = numarCard;
    }

    @Override
    public void platestePOS() {
        System.out.println(this.titular+ "a realizat plata cu POS-ul");
    }

    @Override
    public void platesteOnline() {
        System.out.println(this.titular+ "a realizat plata Online");
    }

    public String getTitular() {
        return titular;
    }

    public int getNumarCard() {
        return numarCard;
    }
}
