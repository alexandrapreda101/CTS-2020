package ro.ase.cts.proxy.clase;

public class ProxyRezervare implements IOperatorRezervari{

    private OperatorRezervare operatorRezervare;
    private int nrMinPersoane;

    public ProxyRezervare(OperatorRezervare operatorRezervare, int nrMinPersoane) {
        this.operatorRezervare = operatorRezervare;
        this.nrMinPersoane = nrMinPersoane;
    }

    @Override
    public void rezerva(int nrPersoane) {
        if(nrPersoane >= this.nrMinPersoane){
            operatorRezervare.rezerva(nrPersoane);
        } else {
            System.out.println("Numarul de persoane este prea mic");
        }
    }
}
