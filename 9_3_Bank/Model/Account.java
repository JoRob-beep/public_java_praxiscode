package KMS_1_05_LE_9_3_Gossak_Bank.Model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accOwner;
    private Integer accID;
    private Double accBalance;
    private List<Customer> customers;

    public Account(String accOwner, Integer accID, Double accBalance, List<Customer> customers) {
        this.accOwner = accOwner;
        this.accID = accID;
        this.accBalance = accBalance;
        this.customers = customers;
    }

    public String getAccOwner() {
        return accOwner;
    }

    public void setAccOwner(String accOwner) {
        this.accOwner = accOwner;
    }

    public Integer getAccID() {
        return accID;
    }

    public void setAccID(Integer accID) {
        this.accID = accID;
    }

    public Double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(Double accBalance) {
        this.accBalance = accBalance;
    }

    public List<customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<customer> customers) {
        this.customers = customers;
    }

    public void withdrawCash(Double amount) {
        if (amount <= accBalance) {
            accBalance -= amount;
            System.out.println("Withdrawal successful. New balance: " + accBalance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
    public void payMoney(Double amount) {
        accBalance += amount;
        System.out.println("Payment successful. New balance: " + accBalance);
    }
}
