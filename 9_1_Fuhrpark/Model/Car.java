package KMS_1_05_LE_9_1_Gossak_Fuhrpark.Model;
public class Car extends Motor_vehicle{
    public Car(Integer purchase_year, Boolean borrowed,
                         Double km_total, Boolean road_tax_disc, Integer gas_level_percent, String type, Integer space_for_people) {
        super(purchase_year, borrowed, km_total, road_tax_disc, gas_level_percent, type);
        this.space_for_people = space_for_people;

    }

    private Integer space_for_people;

    public Integer getSpace_for_people() {
        return space_for_people;
    }

    public void setSpace_for_people(Integer space_for_people) {
        this.space_for_people = space_for_people;
    }
    public org.json.JSONObject toJson() {
        org.json.JSONObject obj = new org.json.JSONObject();
        obj.put("purchase_year", getPurchase_year());
        obj.put("km_total", getKm_total());
        obj.put("road_tax_disc", getRoad_tax_disc());
        obj.put("gas_level_percent", getGas_level_percent());
        obj.put("type", getType());
        obj.put("space_for_people", space_for_people);
        return obj;
    }
}
