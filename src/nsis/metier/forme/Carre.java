/** @author: Rohdri FRIMAT 
 *  Date: 06/09/2016 
 */


package nsis.metier.forme;

/**
 * 
 * classe Carre hérite de la classe rectangle
 *
 */
public class Carre extends Rectangle {
	public Carre() {
		super(0, 0);
	}
	public Carre(double cote) {
		super(cote, cote);
	}
	public Carre(double cote, double centreX, double centreY) {
		super(cote, cote, centreX, centreY);
	}
	
	@Override
	public void afficher() {
		System.out.println("carré : longueur=" + getLongueur() + " largeur=" + getLargeur()+ "   centre= ("+ this+")");
	}
}
