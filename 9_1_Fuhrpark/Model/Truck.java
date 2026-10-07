package KMS_1_05_LE_9_1_Gossak_Fuhrpark.Model;

import org.json.JSONObject;

public class Truck extends Motor_vehicle{
    public Truck(Integer purchase_year, Boolean borrowed,
                 Double km_total, Boolean road_tax_disc, Integer gas_level_percent, String type, Double load_capacity) {
        super(purchase_year, borrowed, km_total, road_tax_disc, gas_level_percent, type);
        this.load_capacity = load_capacity;
    }
    private Double load_capacity;

    public Double getLoad_capacity() {
        return load_capacity;
    }

    public void setLoad_capacity(Double load_capacity) {
        this.load_capacity = load_capacity;
    }

    public JSONObject toJson() {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("purchase_year", getPurchase_year());
        jsonObj.put("borrowed", getBorrowed());
        jsonObj.put("km_total", getKm_total());
        jsonObj.put("road_tax_disc", getRoad_tax_disc());
        jsonObj.put("gas_level_percent", getGas_level_percent());
        jsonObj.put("type", getType());
        jsonObj.put("load_capacity", getLoad_capacity());
        return jsonObj;
    }
}
