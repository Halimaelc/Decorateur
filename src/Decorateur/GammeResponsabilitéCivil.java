package Decorateur;

import Composant.Assurance;

public class GammeResponsabilitéCivil extends GammeAbstrait{

	public GammeResponsabilitéCivil(Assurance assurance) {
		super(assurance);
		super.nomDeGamme="Gamme Responsabilité Civil";	}

}
