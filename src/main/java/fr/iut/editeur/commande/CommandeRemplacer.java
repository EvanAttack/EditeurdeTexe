package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * CommandeRemplacer
 *
 * Commande permettant de remplacer une partie du texte
 */

public class CommandeRemplacer extends CommandeDocument  {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : remplacer;debut;fin;remplacement");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String remplacement = parameters[3];
        this.document.remplacer(debut, fin, remplacement);
        super.executer();
    }


}
