package com.bankonet;

public class CompteCourant {

    String numero;
    String intitule;
    double solde;
    double montantDecouvertAutorise;
    static int nbCompteCourants = 0;

    public CompteCourant(String p_numero, String p_intitule, double p_solde, double p_montantDecouvertAutorise) {
        this.numero = p_numero;
        this.intitule = p_intitule;
        this.solde = p_solde;
        this.montantDecouvertAutorise = p_montantDecouvertAutorise;
        CompteCourant.nbCompteCourants++;
        System.out.println(this.solde);
    }
}
