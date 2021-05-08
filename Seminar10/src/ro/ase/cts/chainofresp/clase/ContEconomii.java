package ro.ase.cts.chainofresp.clase;

public class ContEconomii extends Cont{
    public ContEconomii(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(float suma) {
        if(suma < super.getSold()){
            System.out.println("Se face plata din contulde economii pt suma de "+suma);
            super.setSold(super.getSold()-suma);
        }
        else if (super.getCont() != null){
            super.getCont().realizeazaPlata(suma);
        }
        else{
            System.out.println("Plata este refuzata");
        }
    }
}
