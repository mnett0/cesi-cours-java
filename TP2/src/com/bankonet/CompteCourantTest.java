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
}
