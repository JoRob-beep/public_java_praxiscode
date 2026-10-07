package KMS_1_05_LE_9_3_Gossak_Bank.Model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private String bankAddress;
    private String bic;
    private String uid;

    public Bank(String bankName, String bankAddress, String bic, String uid) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.bic = bic;
        this.uid = uid;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void showAccData(Account acc) {
        System.out.println("Kontonummer: " + acc.getAccountNumber());
        System.out.println("Name: " + acc.getName());
        System.out.println("Kontostand: " + acc.getBalance());


    }
    public void showAllAcc() {
        for (Account acc : accounts) {
            showAccData(acc);
            System.out.println("-----------------------------");
        }
    }
    public boolean removeAccount(String accountId) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountId)) {
                accounts.remove(acc);
                return true;
            }
        }
        return false;
    }
    public void addAccount(){
        .append(asdcj);
    }


}
