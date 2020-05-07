package com.bankonet.test;

import com.bankonet.src.Client;
import com.bankonet.src.CompteCourant;
import com.bankonet.src.CompteEpargne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {
    @Test
    void createClient() {
        CompteCourant compteCourant = new CompteCourant("1", "Bernard", 22.00, 150.0);
        CompteEpargne compteEpargne = new CompteEpargne("2", "Bernard", 34.50, 4.45);
        Client client = new Client("23", "Bernard", "Laffite", compteCourant, compteEpargne);
        assertEquals(3, CompteCourant.getNbCompteCourants());
        assertEquals(3, CompteCourant.getNbCompteCourants());
        assertEquals(3, CompteCourant.getNbCompteCourants());
    }
}
