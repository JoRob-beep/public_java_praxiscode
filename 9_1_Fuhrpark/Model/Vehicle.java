package KMS_1_05_LE_9_1_Gossak_Fuhrpark.Model;

public class Vehicle {
    private static Integer sum_of_vehicle = 0;

    public Vehicle(Integer purchase_year, Boolean borrowed, String type) {
        this.purchase_year = purchase_year;
        this.borrowed = borrowed;
        this.type = type;
    }

    private Integer purchase_year;
    private Boolean borrowed;
    private String type;

    public static Integer getSum_of_vehicle() {
        return sum_of_vehicle;
    }

    public static void setSum_of_vehicle(Integer sum_of_vehicle) {
        Vehicle.sum_of_vehicle = sum_of_vehicle;
    }

    public Integer getPurchase_year() {
        return purchase_year;
    }

    public void setBurchase_year(Integer burchase_year) {
        this.purchase_year = burchase_year;
    }

    public Boolean getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
