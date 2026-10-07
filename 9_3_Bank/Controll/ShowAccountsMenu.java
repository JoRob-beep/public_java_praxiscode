package KMS_1_05_LE_9_3_Gossak_Bank.Controll;

import java.util.Scanner;

public class ShowAccountsMenu {
    public ShowAccountsMenu() {
    }

    public static void showAccountsMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hier werden alle Konten angezeigt:");
        System.out.println("----------------------------------");
        storeData.displayAllAccounts(bank);


    }

}
