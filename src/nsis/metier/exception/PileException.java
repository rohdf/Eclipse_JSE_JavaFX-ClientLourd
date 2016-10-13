/**
 * Auteur Rohdri FRIMAT
 * Date 08/09/2016
 * 
 *  Créer un programme Java qui manipule une pile d'entiers avec la 
 * capture de l'exception PileException
 * - Corriger les bugs (utiliser le débogueur d'Eclipse si nécessaire)
 * - Ajouter les classes PileVideException et PilePleineException. 
 * Ces deux classes devront hériter de la classe PileException
 */

package nsis.metier.exception;

public class PileException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private int codeErreur;

	 public PileException (String mess, int code) {
	  super("Erreur pile : "  + mess);
	  codeErreur = code;
	 }

	public final int getCodeErreur() {
	  return codeErreur;
	}
}
