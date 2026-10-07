package KMS_1_05_LE_9_2_Gossak_Fussball.Model;

public class Person {
    private String firstName;
    private String surName;
    private String shirtNum;

    public Person(String firstName, String surName, String shirtNum) {
        this.firstName = firstName;
        this.surName = surName;
        this.shirtNum = shirtNum;
    }

    public Person() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String name) {
        this.surName = name;
    }

    public String getShirtNum() {
        return shirtNum;
    }

    public void setShirtNum(String num) {
        this.shirtNum = num;
    }

    @Override
    public String toString() {
        return firstName + " " + surName + " (" + shirtNum + ")";
    }

}
