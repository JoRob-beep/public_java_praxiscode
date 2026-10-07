package KMS_1_05_LE_9_1_Gossak_Fuhrpark.Model;

import org.json.JSONObject;

public class Bike extends Vehicle{

    public Bike(Integer purchase_year, Boolean borrowed, String type) {
        super(purchase_year, borrowed, type);
    }

    public JSONObject toJson() {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("purchase_year", getPurchase_year());
        jsonObj.put("borrowed", getBorrowed());
        jsonObj.put("type", getType());
        return jsonObj;
    }
}
