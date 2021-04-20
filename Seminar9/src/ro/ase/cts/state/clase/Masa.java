package ro.ase.cts.state.clase;

public class Masa {
    private int idMasa;
    private  IStareMasa stareMasa;

    public IStareMasa getStareMasa() {
        return stareMasa;
    }

    void setStareMasa(IStareMasa stareMasa) {
        this.stareMasa = stareMasa;
    }

    public Masa(int idMasa) {
        this.idMasa = idMasa;
        this.stareMasa = new Libera();
    }

    public void rezervaMasa(String numeClient){

        if(this.stareMasa instanceof Libera){
            System.out.println(numeClient + " a rezervat masa!");
            this.setStareMasa(new Rezervata());
        }
        else
            System.out.println("Masa nu este libera");
    }

    public void ocupaMasa(String numeClient){
        if(!(this.stareMasa instanceof Ocupata)){
            System.out.println(numeClient+" a ocupat masa!");
            this.setStareMasa(new Ocupata());
        }
        else
            System.out.println("Masa nu poate fi ocupata");
    }
    public void  eliberazaMasa(String numeClient){
        if(!(this.stareMasa instanceof Libera)){
            System.out.println(numeClient+ " a eliberat masa");
            this.setStareMasa(new Libera());
        }
        else
            System.out.println("Masa este deja libera");
    }
}
