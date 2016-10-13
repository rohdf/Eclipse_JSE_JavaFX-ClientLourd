/** @author: Rohdri FRIMAT 
 *  Date: 06/09/2016 
 */


package nsis.metier.forme;


/**
 * 
 * Classe Cercle hérite de forme
 *
 */
public class Cercle extends Point {
	protected double rayon;
	
	public Cercle() {}

	public Cercle(double rayon) {
		super(0,0);
		this.rayon = rayon;
		perimetre();
		surface();
	}

	public Cercle(double rayon, double centreX, double centreY) {
		super(centreX,centreY);
		this.rayon = rayon;
		perimetre();
		surface();
	}

	@Override
	public void surface() {
		surface = Math.PI*Math.pow(rayon , 2);
	}

	@Override
	public void perimetre() {
		perimetre = 2*Math.PI*rayon ;
	}
	 
	@Override
	public void afficher() {
		System.out.println("cercle: Rayon=" + rayon + "   centre= ("+ this+")");
	}
	
	public double getRayon () {
		return rayon ;
	}

	public void setRayon (float rayon ) {
		this.rayon = rayon ;
	}
}
