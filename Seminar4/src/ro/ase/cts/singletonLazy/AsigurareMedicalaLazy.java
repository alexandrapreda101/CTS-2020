package ro.ase.cts.singletonLazy;

import ro.ase.cts.singleton.AsigurareMedicala;

public class AsigurareMedicalaLazy {
    private int id;
    private String numeAsigurat;
    private float contributie;

    private static AsigurareMedicalaLazy asigurareMedicalaLazy = null;

    private AsigurareMedicalaLazy(int id, String numeAsigurat, float contributie) {
        this.id = id;
        this.numeAsigurat = numeAsigurat;
        this.contributie = contributie;
    }

    public static synchronized AsigurareMedicalaLazy getInstance(int id,String numeAsigurat, float contributie ){
        if(asigurareMedicalaLazy == null){
            asigurareMedicalaLazy = new AsigurareMedicalaLazy(id,numeAsigurat,contributie);
        }
        return asigurareMedicalaLazy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeAsigurat(String numeAsigurat) {
        this.numeAsigurat = numeAsigurat;
    }

    public void setContributie(float contributie) {
        this.contributie = contributie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AsigurareMedicala{");
        sb.append("id=").append(id);
        sb.append(", numeAsigurat='").append(numeAsigurat).append('\'');
        sb.append(", contributie=").append(contributie);
        sb.append('}');
        return sb.toString();
}}
