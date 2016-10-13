package nsis.metier;

public class Maillon<T> {
	  public T donnee;
	  public Maillon<T> suivant;

	  public Maillon(T donnee, Maillon<T> suivant) {
	      this.donnee = donnee;
	      this.suivant = suivant;
	    }

}
