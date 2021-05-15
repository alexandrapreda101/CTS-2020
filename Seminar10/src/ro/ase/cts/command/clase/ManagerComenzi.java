package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {

    private List<ComandaAbstracta> listaComenzi;

    public ManagerComenzi() {
        this.listaComenzi = new ArrayList<ComandaAbstracta>();
    }

    public void invocaComanda(ComandaAbstracta comandaAbstracta) {
        listaComenzi.add(comandaAbstracta);
    }

    public void executaComanda(){
        if(listaComenzi.size() > 0){
            listaComenzi.get(0).executa();
            listaComenzi.remove(0);
        }
    }

}
