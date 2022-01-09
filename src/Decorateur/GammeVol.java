package Decorateur;

public class GammeVol extends GammeAbstrait{

	public GammeVol(GammeAbstrait assurance) {
		super(assurance);
		super.nomDeGamme="Gamme Vol";
	}

}
