package KMS_1_05_LE_9_1_Gossak_Fuhrpark.View;

import KMS_1_05_LE_9_1_Gossak_Fuhrpark.Model.Car;
import KMS_1_05_LE_9_1_Gossak_Fuhrpark.Model.Truck;
import KMS_1_05_LE_9_1_Gossak_Fuhrpark.Model.Motorbike;
import KMS_1_05_LE_9_1_Gossak_Fuhrpark.Model.Bike;
import org.json.JSONArray;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Input {

    public static void json_in(List<Car> cars) {
        saveJson("cars.json", cars);
    }
    public static void json_in_truck(List<Truck> trucks) {
        saveJson("trucks.json", trucks);
    }
    public static void json_in_motorbike(List<Motorbike> motorbikes) {
        saveJson("motorbikes.json", motorbikes);
    }
    public static void json_in_bike(List<Bike> bikes) {
        saveJson("bikes.json", bikes);
    }

    private static <T> void saveJson(String filename, List<T> list) {
        JSONArray jsonArray = new JSONArray();
        try (FileReader reader = new FileReader(filename)) {
            char[] buffer = new char[4096];
            int len = reader.read(buffer);
            if (len > 0) {
                String content = new String(buffer, 0, len);
                JSONArray existingArray = new JSONArray(content);
                for (int i = 0; i < existingArray.length(); i++) {
                    jsonArray.put(existingArray.getJSONObject(i));
                }
            }
        } catch (IOException e) {
        }

        for (T obj : list) {
            if (obj instanceof Car) {
                jsonArray.put(((Car) obj).toJson());
            }
            else if (obj instanceof Truck) {
                jsonArray.put(((Truck) obj).toJson());
            }
            else if (obj instanceof Motorbike) {
                jsonArray.put(((Motorbike) obj).toJson());
            }
            else if (obj instanceof Bike) {
                jsonArray.put(((Bike) obj).toJson());
            }
        }

        try (FileWriter file = new FileWriter(filename)) {
            file.write(jsonArray.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
