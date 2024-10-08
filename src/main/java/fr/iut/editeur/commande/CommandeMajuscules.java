package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;


/**
 * CommandeMajuscules
 *
 * Commande permettant de mettre en majuscules une partie du texte
 */

public class CommandeMajuscules  extends CommandeDocument {

    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : majuscule");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.majuscules(debut, fin);
        super.executer();
    }
}
