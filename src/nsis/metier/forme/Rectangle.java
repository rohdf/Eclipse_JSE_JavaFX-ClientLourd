/** @author: Rohdri FRIMAT 
 *  Date: 06/09/2016 
 */

package nsis.metier.forme;

/**
 * 
 * class Rectangle hérite de la classe Forme
 *
 */
public class Rectangle extends Forme {
	private double largeur;
	private double longueur;

	public Rectangle(double longueur, double largeur) {
		super(0,0);
		this.largeur = largeur;
		this.longueur = longueur;
		perimetre();
		surface();
	}

	public Rectangle(double longueur, double largeur, double centreX, double centreY) {
		super(centreX,centreY);
		this.largeur = largeur;
		this.longueur = longueur;
		perimetre();
		surface();
	}
	
	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	@Override
	public void surface() {
		surface = this.longueur * this.largeur;
	}

	@Override
	public void perimetre() {
		perimetre = 2*longueur+2*largeur;
	}
	 
	@Override
	public void afficher() {
		System.out.println("rectangle: longueur=" + longueur + " largeur=" + largeur + "   centre= ("+ this+")");
	}

}
