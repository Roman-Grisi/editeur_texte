package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 *Classe qui crée une commande qui met une partie du texte en majuscules
*/
public class CommandeMajuscules extends CommandeDocument{

    public CommandeMajuscules(Document document,String[] parameters){
        super(document,parameters);
    }

    @Override
    public void executer(){
        if(parameters.length < 3){
            System.err.println("Format attendu: majuscules;depart;fin");
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.majuscules(depart,fin);
        super.executer();
    }
}
