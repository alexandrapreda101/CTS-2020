package ro.ase.cts.strategy.clase;

public class Client {
    private String nume;
    private IModPlata iModPlata;

    public Client(String nume) {
        this.nume = nume;
        iModPlata = null;
    }

    public Client(String nume, IModPlata iModPlata) {
        this.nume = nume;
        this.iModPlata = iModPlata;
    }

    public void setiModPlata(IModPlata iModPlata) {
        this.iModPlata = iModPlata;
    }

    public void platesteNota(int suma) {
        if (iModPlata == null) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(this.nume + " are de platit");
            iModPlata.plateste(suma);
        }
    }
}