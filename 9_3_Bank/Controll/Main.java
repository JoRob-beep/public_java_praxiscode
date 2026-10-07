package KMS_1_05_LE_9_3_Gossak_Bank.Controll;
import java.util.Scanner;

import KMS_1_05_LE_9_3_Gossak_Bank.Model.Bank;
import KMS_1_05_LE_9_3_Gossak_Bank.Model.Customer;
import KMS_1_05_LE_9_3_Gossak_Bank.Model.Account;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        DataStorage storeData = new DataStorage();

        while (true) {
            System.out.println("\nBank Verwaltung");
            System.out.println("----------------");
            System.out.println("1. Anlegen von einem Konto");
            System.out.println("2. Löschen eines Kontos");
            System.out.println("3. Kontostand berechnen");
            System.out.println("4. Geld abheben");
            System.out.println("5. Geld einzahlen");
            System.out.println("6. Ausgabe der Daten eines Kontos");
            System.out.println("7. Ausgabe der Daten aller Konten");
            System.out.println("0. Beenden");
            System.out.print("Auswahl: ");
            String choiceMain = scanner.nextLine();

            if (choiceMain.equals("1")) {
                // Konto erstellen
                System.out.print("Kontoart (Giro/Spare): ");
                String accountType = scanner.nextLine();
                Account account = new Account(accountType);
                bank.addAccount(account);
                System.out.println("Konto hinzugefügt.");

                // Kunde hinzufügen
                while (true) {
                    System.out.print("Vorname des Kunden (oder leer für Ende): ");
                    String firstName = scanner.nextLine();
                    if (firstName.trim().isEmpty()) break;
                    System.out.print("Nachname: ");
                    String surName = scanner.nextLine();
                    Customer customer = new Customer(firstName, surName, account);
                    account.addCustomer(customer);
                    bank.addCustomerToAccount(customer);
                    System.out.println("Kunde hinzugefügt und als Mitglied gezählt.");
                }
            } else if (choiceMain.equals("2")) {
                // Konto löschen
                System.out.print("Konto-ID zum Löschen: ");
                String accountId = scanner.nextLine();
                if (bank.removeAccount(accountId)) {
                    System.out.println("Konto gelöscht.");
                } else {
                    System.out.println("Konto nicht gefunden.");
                }
            } else if (choiceMain.equals("3")) {
                // Kontostand berechnen
                System.out.print("Konto-ID: ");
                String accountId = scanner.nextLine();
                Account account = bank.getAccountId(accountId);
                if (account != null) {
                    System.out.println("Kontostand: " + account.calculateBalance());
                } else {
                    System.out.println("Konto nicht gefunden.");
                }
            } else if (choiceMain.equals("4")) {
                // Geld abheben
                System.out.print("Konto-ID: ");
                String accountId = scanner.nextLine();
                Account account = bank.getAccountById(accountId);
                if (account != null) {
                    System.out.print("Betrag zum Abheben: ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    if (account.withdraw(amount)) {
                        System.out.println("Betrag abgehoben.");
                    } else {
                        System.out.println("Abhebung fehlgeschlagen. Überprüfen Sie den Kontostand.");
                    }
                } else {
                    System.out.println("Konto nicht gefunden.");
                }
            } else if (choiceMain.equals("5")) {
                // Geld einzahlen
                System.out.print("Konto-ID: ");
                String accountId = scanner.nextLine();
                Account account = bank.getAccountById(accountId);
                if (account != null) {
                    System.out.print("Betrag zum Einzahlen: ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    account.deposit(amount);
                    System.out.println("Betrag eingezahlt.");
                } else {
                    System.out.println("Konto nicht gefunden.");
                }
            } else if (choiceMain.equals("6")) {
                // Ausgabe der Daten eines Kontos
                System.out.print("Konto-ID: ");
                String accountId = scanner.nextLine();
                Account account = bank.getAccountById(accountId);
                if (account != null) {
                    storeData.displayAccountData(account);
                } else {
                    System.out.println("Konto nicht gefunden.");
                }

            }
            else if (choiceMain.equals("7")) {
                // Ausgabe der Daten aller Konten
                storeData.displayAllAccounts(bank);
            } else if (choiceMain.equals("0")) {
                System.out.println("Programm beendet.");
                break;
            } else {
                System.out.println("Ungültige Eingabe.");
            }
        }
