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

public class PilePleineException extends PileException {
	private static final long serialVersionUID = 1L;

	public PilePleineException(int code) {
		super("Pleine", code);
		// TODO Auto-generated constructor stub
	}

}
