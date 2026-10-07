package KMS_1_05_LE_9_3_Gossak_Bank.Controll;

import java.util.Scanner;
import KMS_1_05_LE_9_3_Gossak_Bank.Model.Account;
import KMS_1_05_LE_9_3_Gossak_Bank.Model.Bank;
import KMS_1_05_LE_9_3_Gossak_Bank.Model.Customer;

public class AddAccountMenu {
    public AddAccountMenu() {}

    public static void addAccountMenu(Scanner scanner) {
        String accountId;
        String customerId;
        double startBalance;
        String firstName;
        String surName;


        System.out.println("\nKonto anlegen");
        System.out.println("----------------");
        System.out.println("(Y) Besteht der Kunde bereits? oder (N) ist es ein neuer Kunde?");
        System.out.println("0. Zurück zum Hauptmenü");
        String choiceAddAcc = scanner.nextLine().trim().toUpperCase();
        // TODO: Logik stimmt nicht, unten
        if (choiceAddAcc.equals("Y")) {
            accountId = inputAccountId(scanner);
            customerId = inputCustomerId(scanner);
            startBalance = inputStartBalance(scanner);
            Account account = new Account(accountId, startBalance);
            Bank.addAccount(account);
            Bank.getCustomerById(customerId).addAccount(account);
            System.out.println("Konto für bestehenden Kunden hinzugefügt.");
        } else if (choiceAddAcc.equals("N")) {
            firstName = inputName(scanner, "Vorname des Kunden");
            surName = inputName(scanner, "Nachname des Kunden");
            Customer customer = new Customer(firstName, surName);
            Bank.addCustomer(customer);

            accountId = inputAccountId(scanner);
            startBalance = inputStartBalance(scanner);
            Account account = new Account(accountId, startBalance);
            Bank.addAccount(account);
            customer.addAccount(account);
            System.out.println("Neuer Kunde und Konto hinzugefügt.");
        } else if (choiceAddAcc.equals("0")) {
            Menu.showMainMenu();
        } else {
            System.out.println("Ungültige Auswahl. Bitte versuchen Sie es erneut.");
            addAccountMenu(scanner);
        }
    }

    private static String inputAccountId(Scanner scanner) {
        while (true) {
            System.out.print("Konto-ID anlegen: ");
            String accountId = scanner.nextLine().trim();
            if (Bank.getAccountById(accountId) != null) {
                System.out.println("Konto-ID existiert bereits. Bitte eine andere ID eingeben.");
            } else if (accountId.isEmpty()) {
                System.out.println("Konto-ID darf nicht leer sein.");
            } else {
                return accountId;
            }
        }
    }

    private static String inputCustomerId(Scanner scanner) {
        while (true) {
            System.out.print("Customer-ID: ");
            String customerId = scanner.nextLine().trim();
            if (Bank.getCustomerById(customerId) != null) {
                return customerId;
            } else {
                System.out.println("Kunde existiert nicht. Bitte eine gültige Customer-ID eingeben.");
            }
        }
    }

    private static String inputName(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt + ": ");
            String name = scanner.nextLine().trim();
            if (!name.isEmpty()) return name;
            System.out.println(prompt + " darf nicht leer sein.");
        }
    }

    private static double inputStartBalance(Scanner scanner) {
        while (true) {
            System.out.print("Anfangsbetrag eingeben: ");
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Bitte eine gültige Zahl eingeben.");
            }
        }
    }
}

