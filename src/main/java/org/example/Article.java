package org.example;

import java.util.Scanner;

public class Article {
    private String reference;
    private double prixUnit;

    // Méthodes
    public void lire() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la référence de l'article : ");
        reference = scanner.nextLine();
        System.out.print("Entrez le prix unitaire de l'article : ");
        prixUnit = scanner.nextDouble();
    }

    public void afficher() {
        System.out.println("Article [Référence: " + reference + ", Prix Unitaire: " + prixUnit + "]");
    }

    // Accesseurs
    public double getPrixUnit() {
        return prixUnit;
    }
}
