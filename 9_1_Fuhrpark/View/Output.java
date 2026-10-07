package KMS_1_05_LE_9_1_Gossak_Fuhrpark.View;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileReader;
import java.io.IOException;

public class Output {
    public static boolean json_out() {
        System.out.println("Anzeigen des Fuhrparks:");
        System.out.println("--------------------------");
        boolean anyOutput = false;

        String[][] daten = {
            {"cars.json", "Auto"},
            {"trucks.json", "LKW"},
            {"motorbikes.json", "Motorrad"},
            {"bikes.json", "Fahrrad"}
        };

        for (String[] eintrag : daten) {
            anyOutput |= printJsonFile(eintrag[0], eintrag[1]);
        }
        return anyOutput;
    }

    private static boolean printJsonFile(String filename, String fahrzeugtyp) {
        try (FileReader reader = new FileReader(filename)) {
            char[] buffer = new char[4096];
            int len = reader.read(buffer);
            if (len > 0) {
                String content = new String(buffer, 0, len);
                JSONArray jsonArray = new JSONArray(content);
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject obj = jsonArray.getJSONObject(i);
                    System.out.println("Datensatz " + (i + 1) + ":");
                    System.out.println("Fahrzeugtyp: " + fahrzeugtyp);
                    for (String key : obj.keySet()) {
                        System.out.println(key + ": " + obj.get(key));
                    }
                    System.out.println("--------------------------");
                }
                return true;
            }
        } catch (IOException e) {
        }
        return false;
    }
}
