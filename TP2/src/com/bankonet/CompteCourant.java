package com.bankonet;

public class CompteCourant {

    String numero;
    String intitule;
    double solde;
    double montantDecouvertAutorise;
    static int nbCompteCourants = 0;

    public CompteCourant() {
        CompteCourant.nbCompteCourants++;
    }

    public CompteCourant(String p_numero, String p_intitule, double p_solde, double p_montantDecouvertAutorise) {
        this();
        this.numero = p_numero;
        this.intitule = p_intitule;
        if (p_solde > 0) {
            this.solde = p_solde;
        } else {
            System.out.println("Vous ne pouvez pas créer de compte avec un solde négatif");
            this.solde = 0;
        }
        this.montantDecouvertAutorise = p_montantDecouvertAutorise;
    }

    public void crediter(double p_money) {
        if (p_money > 0) {
            this.solde += p_money;
        } else {
            System.out.println("Echec de l'opération");
        }
    }

    public void debiter(double p_money) {
        if ((p_money > 0) && (this.solde - p_money) > (0 - this.montantDecouvertAutorise)) {
            this.solde -= p_money;
        } else {
            System.out.println("Echec de l'opération");
        }
    }

    @Override
    public String toString() {
        return "Voici les informations de votre comtpe :" + "\n" +
                "- Numéro de compte : " + this.numero + "\n" +
                "- Intitule : " + this.intitule + "\n" +
                "- Solde : " + this.solde + " \u20ac\n" +
                "- Découvert autorisé : " + this.montantDecouvertAutorise + " \u20ac";
    }
}
