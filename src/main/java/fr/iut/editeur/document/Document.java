package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Description de la méthode ajouter
     * @param texte La chaine de caractère à ajouter
     * appele la classe {@link Document#ajouter(String)}
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Description de la méthode remplacer
     * @param debut permet de définir le début de la chaine à remplacer
     * @param fin permet de définir la fin de la chaine à remplacer
     * @param remplacement La chaine de caractère qui va remplacer la chaine de caractère à remplacer*
     * Appele la classe {@link Document#remplacer(int, int, String)}
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Description de la méthode majuscules
     * @param debut permet de définir le début de la chaine à mettre en majuscules
     * @param fin permet de définir la fin de la chaine à mettre en majuscules
     * Appele la classe {@link Document#majuscules(int, int)}
     */
    public void majuscules(int debut, int fin) {
        String majuscules = texte.substring(debut, fin+1).toUpperCase();
        remplacer(debut, fin, majuscules);

    }



    @Override
    public String toString() {
        return this.texte;
    }
}
