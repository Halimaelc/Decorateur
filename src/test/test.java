package test;

import Composant.Assurance;
import Composant.AssuranceImpl;
import Decorateur.GammeInondation;
import Decorateur.GammeResponsabilitéCivil;
import Decorateur.GammeVol;

public class test {
	 public static void main(String[] args) {
	        Assurance assurance=new AssuranceImpl();
	        assurance=new GammeInondation(new GammeVol(new GammeResponsabilitéCivil(assurance)));
	        assurance.info();
	    }

}
