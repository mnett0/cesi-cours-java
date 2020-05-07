package com.bankonet.src;

public class CompteEpargne extends Compte {

    private double tauxInteret;

    public CompteEpargne() {
        super();
    }

    public CompteEpargne(String p_numero, String p_intitule, double p_solde, double p_tauxInteret) {
        super(p_numero, p_intitule, p_solde);
        this.tauxInteret = p_tauxInteret;
    }

    public String toString() {
        return "Voici les informations de votre comtpe epargne :" + "\n" +
                "- Numéro de compte : " + this.numero + "\n" +
                "- Intitule : " + this.intitule + "\n" +
                "- Solde : " + this.solde + " \u20ac\n" +
                "- Taux d'interet : " + this.tauxInteret + " %\n" +
                "- Vos interets : " + this.calculerInterets() + " €";
    }

    public void debiter(double p_money) {
        if (p_money > 0) {
            this.solde -= p_money;
        } else {
            System.out.println("Echec de l'opération");
        }
    }

    public boolean isDebitAutorise() {
        return false;
    }

    public double calculerInterets() {
        return 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getSolde() {
        return solde;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }
}
