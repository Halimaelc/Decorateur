package Decorateur;

public class GammeIncendie extends GammeAbstrait{

	public GammeIncendie(GammeAbstrait assurance) {
		super(assurance);
		super.nomDeGamme="Gamme Incendie";	}

}
