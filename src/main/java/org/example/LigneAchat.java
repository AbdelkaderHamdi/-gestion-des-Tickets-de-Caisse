package org.example;

import java.util.Scanner;

public class LigneAchat {
    private Article article;
    private int quantite;

    // Méthodes
    public void lire() {
        article = new Article();
        article.lire();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la quantité : ");
        quantite = scanner.nextInt();
    }

    public double sommeAchat() {
        return article.getPrixUnit() * quantite;
    }

    public void afficher() {
        article.afficher();
        System.out.println("Quantité: " + quantite + ", Total Ligne: " + sommeAchat());
    }
}
