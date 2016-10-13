/** @author: Rohdri FRIMAT 
 *  Date: 06/09/2016 
 */


package nsis.metier.forme;

/**
 * 
 * Classe Espace utilisant la classe forme
 *
 */
public class Espace{
	private Forme[] formes;
	private static final int NB_TAB = 100;
	private int nbForme;
	
	public Espace(){
		this.formes=new Forme[NB_TAB];
	}

	public void addForme(Forme forme){
		if(nbForme<NB_TAB){
			formes[nbForme] = forme;
			nbForme++;
		}
		else
			System.out.println("ERREUR: Le Espace ne peut prendre plus de forme");
	}
	
	public void displayFormes(){
		System.out.println("Affichage des formes de l'espace");
		for(int i=0; i<nbForme; i++){
			System.out.println("forme"+i+"=");
			formes[i].afficher();
		}
	}

	public Forme[] getFormes() {
		return formes;
	}

	public void setFormes(Forme[] formes) {
		this.formes = formes;
	}

	public int getNB_TAB() {
		return NB_TAB;
	}
	
}