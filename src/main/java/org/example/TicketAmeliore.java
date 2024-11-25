package org.example;

public class TicketAmeliore extends TicketAchat {
    private static double recette = 0;

    @Override
    public void lire() {
        super.lire();
        recette += total();
    }

    public static void afficherRecette() {
        System.out.println("Recette journalière: " + recette);
    }
}
