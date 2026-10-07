package KMS_1_05_LE_9_3_Gossak_Bank.Controll;

import KMS_1_05_LE_9_3_Gossak_Bank.Model.Account;

import java.util.Scanner;

public class ShowAccountDetailsMenu {
    public ShowAccountDetailsMenu() {
    }

    public static void showAccountDetailsMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hier können Sie einen Kunden auswählen:");
        String choiceAccountDetails = scanner.nextLine().trim().toUpperCase();
        while(true){
            if (choiceAccountDetails.equals(Customer.name)) {
                Account account = bank.getAccountId(accountId);
                if (account != null) {
                    System.out.println("Kontostand: " + account.calculateBalance());
                } else {
                    System.out.println("Konto nicht gefunden.");
                }
                break;
            }else{
                System.out.println("Falscheingabe!");
            }
        }

    }

}
