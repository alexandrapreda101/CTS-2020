package ro.ase.cts.builder.clase;

public class Builder implements AbstractBuilder {
    private Rezervare rezervare;

    public Builder() {
        rezervare = new Rezervare(0,false,false,false,"");
    }
    public Builder(int cod){
        rezervare = new Rezervare(cod,false,false,false,"");
    }

    public Builder setCod(int cod){
        rezervare.setCod(cod);
        return this;
    }
    public Builder setMancareInclusa(boolean mancareInclusa){
        rezervare.setMancareInclusa(mancareInclusa);
        return this;
    }
    public Builder setScaunErgonomic(boolean scaunErgonomic){
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }
    public Builder setMuzicaAmbientala(boolean muzicaAmbientala){
        rezervare.setMuzicaAmbientala(muzicaAmbientala);
        return this;
    }
    public Builder setgenMuzica(String genMuzica){
        rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
