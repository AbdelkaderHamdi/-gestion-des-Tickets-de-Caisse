package org.example;

import java.util.Scanner;

import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            ArrayList<TicketAchat> tickets = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Combien de tickets souhaitez-vous créer ? ");
            int nbTickets = scanner.nextInt();

            for (int i = 0; i < nbTickets; i++) {
                System.out.println("Création du ticket " + (i + 1));
                TicketAchat ticket = new TicketAmeliore(); // Utiliser TicketAmeliore si vous voulez calculer la recette
                ticket.lire();
                ticket.afficher();
                tickets.add(ticket);
            }

            // Afficher la recette totale si TicketAmeliore est utilisé
            TicketAmeliore.afficherRecette();
            }
        }


