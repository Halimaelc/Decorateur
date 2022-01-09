package Decorateur;

import Composant.Assurance;
import Composant.AssuranceImpl;

public abstract class GammeAbstrait extends AssuranceImpl{
	protected  String nomDeGamme;
    protected Assurance assurance;
    
    public GammeAbstrait(Assurance assurance) {
        this.assurance=assurance;
        this.nomDeGamme="";
    }
    @Override
    public void info() {
        assurance.info();
        System.out.print(this.nomDeGamme+" ");
    }

}
