package ro.ase.cts.adaptor.clase;

public class Leasing {
    private String numeClient;
    private float suma;

    public Leasing(String numeClient, float suma) {
        this.numeClient = numeClient;
        this.suma = suma;
    }

    public void creeazaLeasing(){
        System.out.println(numeClient+ " are un leasing de "+suma);
    }
}
