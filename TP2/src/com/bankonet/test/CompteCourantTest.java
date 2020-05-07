package com.bankonet.test;


import com.bankonet.src.CompteCourant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteCourantTest {
    @Test
    void createCompte() {
        CompteCourant compteCourant1 = new CompteCourant("1", "Bernard", 22.00, 150.0);
        CompteCourant compteCourant2 = new CompteCourant("2", "Jean-Didier", 34.50, 150.0);
        CompteCourant compteCourant3 = new CompteCourant("3", "Patrick", 60.90, 150.0);

        assertEquals(3, CompteCourant.getNbCompteCourants());
    }

    @Test
    void addMoneyPositif() {
        CompteCourant compteCourant1 = new CompteCourant("1", "Bernard", 22.00, 150.0);
        compteCourant1.crediter(1.00);
        assertEquals(23.00, compteCourant1.getSolde());
    }

    @Test
    void addMoneyNegatif() {
        CompteCourant compteCourant1 = new CompteCourant("1", "Bernard", 22.0, 150.0);
        compteCourant1.crediter(-10.00);
        assertEquals(22.00, compteCourant1.getSolde());
    }

    /*
    @Test
    void addMoneyNull() {
        CompteCourant compteCourant1 = new CompteCourant("1", "Bernard", 22.0, 150.0);
        compteCourant1.crediter(null);
        assertEquals(22.0, compteCourant1.solde);
    }
     */

    @Test
    void removeMoneyPositif() {
        CompteCourant compteCourant1 = new CompteCourant("1", "Bernard", 22.0, 200.0);
        compteCourant1.debiter(10);
        assertEquals(12.0, compteCourant1.getSolde());
    }

    @Test
    void removeMoneyNegatif() {
        CompteCourant compteCourant1 = new CompteCourant("1", "Bernard", 22.0, 200.0);
        compteCourant1.debiter(-10);
        assertEquals(22.0, compteCourant1.getSolde());
    }

    /*
    @Test
    void removeMoneyNull() {
        CompteCourant compteCourant1 = new CompteCourant("1", "Bernard", 22.0, 200.0);
        compteCourant1.debiter(null);
        assertEquals(-78, compteCourant1.solde);
    }
     */

    @Test
    void tostring() {
        String result = "Voici les informations de votre comtpe :" + "\n" +
                "- Numéro de compte : 1\n" +
                "- Intitule : Bernard\n" +
                "- Solde : 22.0 \u20ac\n" +
                "- Découvert autorisé : 150.0 \u20ac";
        CompteCourant compteCourant1 = new CompteCourant("1", "Bernard", 22.0, 150.0);
        assertEquals(result, compteCourant1.toString());
    }

    @Test
    void create_compte_solde_negatif() {
        CompteCourant compteCourant1 = new CompteCourant("1", "Bernard", -22.00, 150.0);
        assertEquals(0, compteCourant1.getSolde());
    }
}
