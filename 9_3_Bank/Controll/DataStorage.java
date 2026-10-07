package KMS_1_05_LE_9_3_Gossak_Bank.Controll;

import KMS_1_05_LE_9_3_Gossak_Bank.Model.Bank;
import KMS_1_05_LE_9_3_Gossak_Bank.Model.Account;
import KMS_1_05_LE_9_3_Gossak_Bank.Model.Customer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataStorage {
    public void saveToCsv(Object data) {
        if (!(data instanceof Bank)) {
            System.out.println("Fehler beim speichern.");
            return;
        }
        Bank bank = (Bank) data;
        boolean writeHeader = false;
        File file = new File("bank.csv");
        if (!file.exists() || file.length() == 0) {
            writeHeader = true;
        }
        try (FileWriter writer = new FileWriter(file, true)) {
            if (writeHeader) {
                writer.write("CustomerID;Nachname;Vorname;Kontostand\n");
            }
            for (Account team : Bank.getAccount()) {
                for (Customer player : Account.getCustomer()) {
                    writer.write(Account.getCusID() + ";" +
                            player.getName() + ";" +
                            player.getSurName() + ";" +
                            player.getAccBalance() + "\n");
                }
            }
            System.out.println("Daten wurden als CSV gespeichert: bank.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
