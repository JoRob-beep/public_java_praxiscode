package KMS_1_05_LE_9_1_Gossak_Fuhrpark.Model;

public class Motor_vehicle extends Vehicle{
    public Motor_vehicle(Integer purchase_year, Boolean borrowed,
                         Double km_total, Boolean road_tax_disc, Integer gas_level_percent, String type) {
        super(purchase_year, borrowed, type);
        this.km_total = km_total;
        this.road_tax_disc = road_tax_disc;
        this.gas_level_percent = gas_level_percent;
    }

    private Double km_total;
    private Boolean road_tax_disc;
    private Integer gas_level_percent;

    public Double getKm_total() {
        return km_total;
    }

    public void setKm_total(Double km_total) {
        this.km_total = km_total;
    }

    public Boolean getRoad_tax_disc() {
        return road_tax_disc;
    }

    public void setRoad_tax_disc(Boolean road_tax_disc) {
        this.road_tax_disc = road_tax_disc;
    }

    public Integer getGas_level_percent() {
        return gas_level_percent;
    }

    public void setGas_level_percent(Integer gas_level_percent) {
        this.gas_level_percent = gas_level_percent;
    }
}
