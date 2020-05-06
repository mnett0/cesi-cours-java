package com.bankonet;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteCourantTest {
    @Test
    void createCompte() {
        CompteCourant compteCourant1 = new CompteCourant("1", "Bernard", 22.00, 150.0);
        CompteCourant compteCourant2 = new CompteCourant("2", "Jean-Didier", 34.50, 150.0);
        CompteCourant compteCourant3 = new CompteCourant("3", "Patrick", 60.90, 150.0);

        assertEquals(3, CompteCourant.nbCompteCourants);
    }

    @Test
    void addMoney() {
        CompteCourant compteCourant1 = new CompteCourant("1", "Bernard", 22.00, 150.0);
        compteCourant1.addMoney(1.00);
        compteCourant1.showSolde();
        assertEquals(23.00, compteCourant1.solde);
    }

    @Test
    void removeMoney() {
        CompteCourant compteCourant1 = new CompteCourant("1", "Bernard", 22.00, 150.0);
        compteCourant1.removeMoney(10.00);
        compteCourant1.showSolde();
        assertEquals(12.00, compteCourant1.solde);
    }
}
