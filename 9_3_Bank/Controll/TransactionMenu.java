package KMS_1_05_LE_9_3_Gossak_Bank.Controll;
import KMS_1_05_LE_9_3_Gossak_Bank.Model.Account;

import java.util.Scanner;

public class TransactionMenu {
    public TransactionMenu() {
    }


    public static void transactionMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("(A) Abheben oder (E) einzahlen?");
        String choiceTransActionType = scanner.nextLine();
        if(choiceTransActionType.equals("A")){
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
        } else if (choiceTransActionType.equals("E")){
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
        }else{
            System.out.println("Falscheingabe!");
        }


    }



}
