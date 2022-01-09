package Decorateur;


public class GammeBrisDeGlace extends GammeAbstrait{

	public GammeBrisDeGlace(GammeAbstrait assurance) {
		super(assurance);
        super.nomDeGamme="Gamme bris de glace";
	}

}
