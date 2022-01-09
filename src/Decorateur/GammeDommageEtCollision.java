package Decorateur;


public class GammeDommageEtCollision extends GammeAbstrait{

	public GammeDommageEtCollision(GammeAbstrait assurance) {
		super(assurance);
		super.nomDeGamme="Gamme dommage et collision";	}

}
