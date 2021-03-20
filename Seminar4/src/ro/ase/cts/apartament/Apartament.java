package ro.ase.cts.apartament;

public class Apartament {
    private int nrCamere;
    private String numeProprietar;
    private boolean esteOcupat;

    private Apartament(int nrCamere, String numeProprietar, boolean esteOcupat) {
        this.nrCamere = nrCamere;
        this.numeProprietar = numeProprietar;
        this.esteOcupat = esteOcupat;
    }

    private static Apartament apartament = null;

    public static synchronized Apartament getInstance(int nrCamere, String numeProprietar,boolean esteOcupat){
        if (apartament == null){
            apartament = new Apartament(nrCamere,numeProprietar,esteOcupat);
        }
        return apartament;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public void setNumeProprietar(String numeProprietar) {
        this.numeProprietar = numeProprietar;
    }

    public void setEsteOcupat(boolean esteOcupat) {
        this.esteOcupat = esteOcupat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Apartament{");
        sb.append("nrCamere=").append(nrCamere);
        sb.append(", numeProprietar='").append(numeProprietar).append('\'');
        sb.append(", esteOcupat=").append(esteOcupat);
        sb.append('}');
        return sb.toString();
    }
}
