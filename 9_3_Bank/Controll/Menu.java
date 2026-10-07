package KMS_1_05_LE_9_3_Gossak_Bank.Controll;
import java.util.Scanner;
import KMS_1_05_LE_9_3_Gossak_Bank.Controll.AddAccountMenu;


public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void showMainMenu() {
        System.out.println("\nBank Verwaltung");
        System.out.println("----------------");
        System.out.println("1. Anlegen von einem Konto");
        System.out.println("2. Löschen eines Kontos");
        System.out.println("3. Zeige Konten");
        System.out.println("4. Zeige ein Konto (Kontostand, Kunden) an");
        // System.out.println("5. Kunden anlegen");
        // System.out.println("6. Kunden anzeigen");
        System.out.println("5. Einzahlen oder Abheben");
        System.out.println("0. Beenden");
        System.out.print("Auswahl: ");
        String choiceMain = scanner.nextLine();
        if (choiceMain.equals("1")) {
            AddAccountMenu.addAccountMenu(scanner);
        } else if (choiceMain.equals("2")) {
            DeleteAccountMenu.deleteAccountMenu();
        } else if (choiceMain.equals("3")) {
            ShowAccountsMenu.showAccountsMenu();
        } else if (choiceMain.equals("4")) {
            ShowAccountDetailsMenu.showAccountDetailsMenu();
        } else if (choiceMain.equals("5")) {
            TransactionMenu.transactionMenu();
        } else if (choiceMain.equals("0")) {
            System.out.println("Programm wird beendet.");
            System.exit(0);
        } else {
            System.out.println("Ungültige Auswahl. Bitte versuchen Sie es erneut.");
        }
    }


}
