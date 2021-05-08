package ro.ase.cts.command.clase;

public abstract class ComandaAbstracta {

    public Executant contBancar;
    public float suma;

    public ComandaAbstracta(Executant contBancar, float suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    public abstract void executa();
}
