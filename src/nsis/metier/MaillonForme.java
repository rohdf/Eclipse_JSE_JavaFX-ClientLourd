package nsis.metier;

import nsis.metier.forme.Forme;

public class MaillonForme<T extends Forme> extends Maillon<T>{

	public MaillonForme(T donnee, Maillon<T> suivant) {
		super(donnee, suivant);
	}

}
