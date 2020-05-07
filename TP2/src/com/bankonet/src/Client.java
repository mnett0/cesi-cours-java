package com.bankonet.src;

public class Client {
    private String identifiant;
    private String nom;
    private String prenom;

    private CompteCourant compteCourant;
    private CompteEpargne compteEpargne;

    public Client() {

    }

    public Client(String p_identifiant, String p_nom, String p_prenom, CompteCourant p_compteCourant, CompteEpargne p_compteEpargne) {
        this();
        this.identifiant = p_identifiant;
        this.nom = p_nom;
        this.prenom = p_prenom;
        this.compteCourant = p_compteCourant;
        this.compteEpargne = p_compteEpargne;
    }

    public String toString() {
        return "Voici les informations de votre comtpe epargne :" + "\n" +
                "- Identifiant : " + this.identifiant + "\n" +
                "- Nom : " + this.nom + "\n" +
                "- Prénom : " + this.prenom + "\n" +
                "- Total : " + this.calculerAvoirGlobal();
    }

    public double calculerAvoirGlobal() {
        return compteCourant.getSolde() + compteEpargne.getSolde();
    }
}
