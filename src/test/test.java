package test;

import Composant.Assurance;
import Composant.AssuranceImpl;
import Decorateur.GammeInondation;
import Decorateur.GammeResponsabilit√©Civil;
import Decorateur.GammeVol;

public class test {
	 public static void main(String[] args) {
	        Assurance assurance=new AssuranceImpl();
	        assurance=new GammeInondation(new GammeVol(new GammeResponsabilit√©Civil(assurance)));
	        assurance.info();
	    }

}
