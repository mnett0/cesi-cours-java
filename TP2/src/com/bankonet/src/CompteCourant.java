package com.bankonet.src;

public class CompteCourant extends Compte {

    private double montantDecouvertAutorise;

    public CompteCourant() {
       super();
    }

    public CompteCourant(String p_numero, String p_intitule, double p_solde, double p_montantDecouvertAutorise) {
        super(p_numero, p_intitule, p_solde);
        this.montantDecouvertAutorise = p_montantDecouvertAutorise;
    }

    public String toString() {
        return "Voici les informations de votre comtpe :" + "\n" +
                "- Numéro de compte : " + this.numero + "\n" +
                "- Intitule : " + this.intitule + "\n" +
                "- Solde : " + this.solde + " \u20ac\n" +
                "- Découvert autorisé : " + this.montantDecouvertAutorise + " \u20ac";
    }

    public void debiter(double p_money) {
        if ((p_money > 0) && (this.solde - p_money) > (0 - this.montantDecouvertAutorise)) {
            this.solde -= p_money;
        } else {
            System.out.println("Echec de l'opération");
        }
    }

    public boolean isDebitAutorise() {
        return true;
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

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }
}
