package KMS_1_05_LE_9_3_Gossak_Bank.Model;

public class Customer {
    private Integer customerID;
    private String name;
    private String surname;

    public Customer(Integer cusID, String name, String surname) {
        this.customerID = customerID;
        this.name = name;
        this.surname = surname;
    }

    public Integer getCusID() {
        return customerID;
    }

    public void setCusID(Integer cusID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
