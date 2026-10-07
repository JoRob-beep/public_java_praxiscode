package KMS_1_05_LE_9_3_Gossak_Bank.Controll;
import java.util.Scanner;
import KMS_1_05_LE_9_3_Gossak_Bank.Model.Account;
import KMS_1_05_LE_9_3_Gossak_Bank.Model.Bank;
import KMS_1_05_LE_9_3_Gossak_Bank.Model.Customer;

public class DeleteAccountMenu {

    public static void deleteAccountMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nKonto löschen");
        System.out.println("----------------");
        System.out.print("Geben Sie die Konto-ID ein, die Sie löschen möchten: ");
        String accountId = scanner.nextLine().trim();

        Account account = Bank.getAccountById(accountId);
        if (account == null) {
            System.out.println("Konto mit der angegebenen ID existiert nicht.");
            return;
        }

        // Entfernen des Kontos aus dem Bank-System
        Bank.removeAccount(account);

        // Entfernen des Kontos aus dem zugehörigen Kunden
        for (Customer customer : Bank.getAllCustomers()) {
            if (customer.getAccounts().contains(account)) {
                customer.removeAccount(account);
                break;
            }
        }

        System.out.println("Konto mit ID " + accountId + " wurde erfolgreich gelöscht.");
    }
}
