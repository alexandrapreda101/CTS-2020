package ro.ase.cts.memento.clase;

public class MeciJucat {
     private int nrSpectatori;
     private String numeEchipaGazda;
     private String numeEchipaOaspeti;
     private int nrJandarmi;
     private int nrBileteVandute;

    public MeciJucat(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspeti, int nrJandarmi, int nrBileteVandute) {
        this.nrSpectatori = nrSpectatori;
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
        this.nrJandarmi = nrJandarmi;
        this.nrBileteVandute = nrBileteVandute;
    }

    public Memento creareMemento(){
        return new Memento(nrSpectatori,numeEchipaGazda,numeEchipaOaspeti);
    }

    public void setMemento(Memento memento){
        this.nrSpectatori = memento.getNrSpectatori();
        this.numeEchipaGazda = memento.getNumeEchipaGazda();
        this.numeEchipaOaspeti = memento.getNumeEchipaOaspeti();
    }

}
