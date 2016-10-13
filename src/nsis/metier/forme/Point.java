/* @Auteur: Rohdri FRIMAT */
/* Date: 01/09/2016 */

package nsis.metier.forme;

public class Point extends Forme{


	public Point(double centreX, double centreY) {
	       this.centreX = centreX;
	       this.centreY = centreY;
	}
	
	
	public Point() {
	       this.centreX = 0;
	       this.centreY = 0;
	}

	@Override
	public void surface() {
		surface = 0;
		
	}
	
	
	@Override
	public void perimetre() {
		perimetre  = 0;
	}

	@Override
	public void afficher() {
		System.out.println("point: =" + this);
	}
}