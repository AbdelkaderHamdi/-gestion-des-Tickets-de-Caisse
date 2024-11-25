package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TicketAchat {
    private static int compteur = 1; // Numéro séquentiel des tickets
    private int numero;
    private Date date;
    private ArrayList<LigneAchat> achats;

    // Constructeur
    public TicketAchat() {
        this.numero = compteur++;
        this.date = new Date();
        this.achats = new ArrayList<>();
    }

    // Méthodes
    public void lire() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de lignes d'achat ? ");
        int nbAchats = scanner.nextInt();

        for (int i = 0; i < nbAchats; i++) {
            System.out.println("Saisir les informations pour la ligne d'achat " + (i + 1));
            LigneAchat ligne = new LigneAchat();
            ligne.lire();
            achats.add(ligne);
        }
    }

    public double total() {
        double somme = 0;
        for (LigneAchat ligne : achats) {
            somme += ligne.sommeAchat();
        }
        return somme;
    }

    public void afficher() {
        System.out.println("Ticket N°: " + numero + " | Date: " + date);
        for (LigneAchat ligne : achats) {
            ligne.afficher();
        }
        System.out.println("Total Ticket: " + total());
    }
}
