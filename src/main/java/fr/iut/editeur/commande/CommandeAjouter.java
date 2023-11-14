package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;
/**
 *Classe qui crée un commande permettant d'ajouter du texte dans l'éditeur
*/
public class CommandeAjouter extends CommandeDocument {


    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

}
