package ro.ase.cts.facade.clase;

public class Facade {
    public static boolean potInvitaOameniiLaMasa(Masa masa){
        if(OperatorMese.esteLibera(masa)){
            Picolo mihai = new Picolo("Mihai");
            if(mihai.esteDebarasata(masa) && mihai.esteAranjata(masa)){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
    }
}
