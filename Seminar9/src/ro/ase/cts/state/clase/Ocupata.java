package ro.ase.cts.state.clase;

public class Ocupata implements IStareMasa {

    @Override
    public void modificare(Masa masa) {
        if(masa.getStareMasa() instanceof Rezervata){
            masa.setStareMasa(this);
        }
    }
}
