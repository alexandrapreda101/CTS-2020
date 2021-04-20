package ro.ase.cts.proxy.clase;

public class OperatorRezervare implements IOperatorRezervari{
    private String numeRestaurant;

    public OperatorRezervare(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    @Override
    public void rezerva(int nrPersoane) {
        System.out.println("A fost realizata o rezervare la " + this.numeRestaurant + " pentru " + nrPersoane + " persoane");
    }
}
