package Decorateur;


public class GammeInondation extends GammeAbstrait{

	public GammeInondation(GammeAbstrait assurance) {
		super(assurance);
		super.nomDeGamme="Gamme Inondation";
	}

}
