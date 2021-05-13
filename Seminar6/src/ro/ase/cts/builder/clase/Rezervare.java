package ro.ase.cts.builder.clase;

public class Rezervare {
    private int cod;
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public Rezervare(int cod, boolean mancareInclusa, boolean scaunErgonomic, boolean muzicaAmbientala, String genMuzica) {
        this.cod = cod;
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("cod=").append(cod);
        sb.append(", mancareInclusa=").append(mancareInclusa);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }
}
