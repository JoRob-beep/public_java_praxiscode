package KMS_1_05_LE_9_2_Gossak_Fussball.Controll;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import KMS_1_05_LE_9_2_Gossak_Fussball.Model.Club;
import KMS_1_05_LE_9_2_Gossak_Fussball.Model.Team;
import KMS_1_05_LE_9_2_Gossak_Fussball.Model.Person;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Club club = new Club();
        StoreData storeData = new StoreData();

        while (true) {
            System.out.println("\nFußball-Club Verwaltung");
            System.out.println("------------------------");
            System.out.println("1. Team erstellen und Spieler hinzufügen und speichern");
            System.out.println("2. CSV anzeigen");
            System.out.println("0. Beenden");
            System.out.print("Auswahl: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                // Team erstellen
                System.out.print("Teamname: ");
                String teamName = scanner.nextLine();
                Team team = new Team(teamName);
                club.addTeam(team);
                System.out.println("Team hinzugefügt.");

                // Spieler hinzufügen
                while (true) {
                    System.out.print("Vorname des Spielers (oder leer für Ende): ");
                    String firstName = scanner.nextLine();
                    if (firstName.trim().isEmpty()) break;
                    System.out.print("Nachname: ");
                    String surName = scanner.nextLine();
                    System.out.print("Trikotnummer: ");
                    String shirtNum = scanner.nextLine();
                    Person player = new Person(firstName, surName, shirtNum);
                    team.addPlayer(player);
                    club.addPlayerToTeam(player);
                    System.out.println("Spieler hinzugefügt und als Mitglied gezählt.");
                }

                // Als CSV speichern
                storeData.saveToCsv(club);
            } else if (choice.equals("2")) {
                try (BufferedReader reader = new BufferedReader(new FileReader("club.csv"))) {
                    String line;
                    System.out.println("\n--- Mitgliederliste (CSV) ---");
                    boolean firstLine = true;
                    while ((line = reader.readLine()) != null) {
                        String[] parts = line.split(";");
                        if (firstLine) {
                            System.out.printf("%-20s %-15s %-15s %-15s%n", parts[0], parts[1], parts[2], parts[3]);
                            System.out.println("---------------------------------------------------------------");
                            firstLine = false;
                        } else {
                            System.out.printf("%-20s %-15s %-15s %-15s%n", parts[0], parts[1], parts[2], parts[3]);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("CSV-Datei konnte nicht gelesen werden.");
                }
            } else if (choice.equals("0")) {
                System.out.println("Programm beendet.");
                break;
            } else {
                System.out.println("Ungültige Eingabe.");
            }
        }
    }
}
