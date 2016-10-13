package nsis.metier;

import nsis.metier.exception.PileVideException;
import nsis.metier.forme.Forme;

public class Pile<T,M extends Maillon<T>> {
	  private M debut;


	  public void empiler(T n) {
	      debut = (M) new Maillon<T>(n, debut);
	    }

	  public T depiler() throws PileVideException {
	      T cle;
	      
	      if (estVide()) throw new PileVideException(1);
	      cle = (T) debut.donnee;
	      debut = (M) debut.suivant;
	      return cle;
	    }

	  public boolean estVide() {
	      return debut == null;
	    }
}
