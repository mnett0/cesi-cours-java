package com.bankonet.src;

public abstract class Compte {

    protected String numero;
    protected String intitule;
    protected double solde;

    protected Compte() {

    }

    protected Compte(String p_numero, String p_intitule, double p_solde) {
        this.numero = p_numero;
        this.intitule = p_intitule;
        if (p_solde > 0) {
            this.solde = p_solde;
        } else {
            System.out.println("Vous ne pouvez pas créer de compte avec un solde négatif");
            this.solde = 0;
        }
    }

    public double getSolde() {
        return this.solde;
    }

    public String toString() {
        return "Voici les informations de votre comtpe epargne :" + "\n" +
                "- Numéro de compte : " + this.numero + "\n" +
                "- Intitule : " + this.intitule + "\n" +
                "- Solde : " + this.solde + " \u20ac\n";
    }

    public void crediter(double p_money) {
        if (p_money > 0) {
            this.solde += p_money;
        } else {
            System.out.println("Echec de l'opération");
        }
    }

    public abstract void debiter(double p_money);

    public abstract boolean isDebitAutorise();
}
