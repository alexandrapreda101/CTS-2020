package ro.ase.cts.builder.clase;

public class BuilderV2 implements AbstractBuilder{
    private int cod;
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean muzicaAmbientala;
    private String genMuzica;

    @Override
    public Rezervare build() {
        return new Rezervare(cod,mancareInclusa,scaunErgonomic,muzicaAmbientala,genMuzica);
    }

    public BuilderV2() {
    }

    public BuilderV2 setCod(int cod) {
        this.cod = cod;
        return  this;
    }

    public BuilderV2 setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
        return  this;
    }

    public BuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return  this;
    }

    public BuilderV2 setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return  this;
    }

    public BuilderV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return  this;
    }
}
