package ro.ase.cts.command.clase;

public class ComandaRetragere extends ComandaAbstracta{
    public ComandaRetragere(Executant contBancar, float suma) {
        super(contBancar, suma);
    }

    @Override
    public void executa() {
        super.contBancar.retragere(super.suma);
    }
}
