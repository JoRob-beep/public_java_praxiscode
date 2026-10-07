package KMS_1_05_LE_9_1_Gossak_Fuhrpark.Controll;
import KMS_1_05_LE_9_1_Gossak_Fuhrpark.Model.*;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

import static KMS_1_05_LE_9_1_Gossak_Fuhrpark.View.Input.json_in;
import static KMS_1_05_LE_9_1_Gossak_Fuhrpark.View.Input.json_in_truck;
import static KMS_1_05_LE_9_1_Gossak_Fuhrpark.View.Input.json_in_motorbike;
import static KMS_1_05_LE_9_1_Gossak_Fuhrpark.View.Input.json_in_bike;
import static KMS_1_05_LE_9_1_Gossak_Fuhrpark.View.Output.json_out;

public class Main {
    // Alle Variablen am Anfang der Datei
    private static Scanner scanner = new Scanner(System.in);
    private static String vehicle_input;
    private static int sum;
    private static String kind_input;
    private static int purchase_year = 0;
    private static boolean borrowed = false;
    private static Double km_total = null;
    private static Boolean road_tax_disc = null;
    private static Integer gas_level_percent = null;
    private static String type = null;
    private static Integer space = null;
    private static Double load_capacity = null;
    private static boolean success = false;

    public static void main(String[] args){
        while(true){
            System.out.println("--------------------------");
            System.out.println("### Firmenfuhrpark ###");
            System.out.println("--------------------------");
            System.out.println("Hinzufügen zum Fuhrpark (H)");
            System.out.println("Anzeigen des Fuhrparks (A)");
            System.out.println("Beenden (X)");
            System.out.println("--------------------------");
            vehicle_input = scanner.nextLine();

            if (vehicle_input.equals("H")){
                while(true){
                    System.out.println("Hinzufügen zum Fuhrpark:");
                    System.out.println("--------------------------");
                    System.out.println("Ist es ein Auto (A), ein LKW (L), ein Motorrad (M) oder ein Fahrrad (F)?");
                    kind_input = scanner.nextLine();

                    success = false;
                    switch (kind_input) {
                        case "A":
                            success = eingabeUndSpeichern("Auto");
                            break;
                        case "L":
                            success = eingabeUndSpeichern("LKW");
                            break;
                        case "M":
                            success = eingabeUndSpeichern("Motorrad");
                            break;
                        case "F":
                            success = eingabeUndSpeichern("Fahrrad");
                            break;
                        default:
                            System.out.println("Eingabe war falsch. Bitte erneut eingeben.");
                            continue;
                    }
                    if (success) break;
                }

                sum = Vehicle.getSum_of_vehicle();
                Vehicle.setSum_of_vehicle(sum + 1);

            }
            else if(vehicle_input.equals("A")){
                boolean result = json_out();
                if (result) {
                    System.out.println("Fuhrpark erfolgreich angezeigt.");
                } else {
                    System.out.println("Fehler beim Anzeigen des Fuhrparks.");
                }
            }
            else if(vehicle_input.equals("X")){
                System.out.println("Auf Wiedersehen");
                break;
            }
            else{
                System.out.println("Eingabe war falsch. Bitte erneut eingeben.");
            }
        }
    }

    private static boolean eingabeUndSpeichern(String typ) {
        while (true) {
            try {
                System.out.println(typ + ": Gebe folgende Werte ein: ");
                System.out.println("--------------------------");
                System.out.println(typ + ": Kaufjahr: ");
                purchase_year = scanner.nextInt();
                System.out.println(typ + ": Schon ausgeborgt? (J/N) ");
                borrowed = jaNein(scanner.next());
                if (!typ.equals("Fahrrad")) {
                    System.out.print(typ + ": Kilometerstand: ");
                    km_total = scanner.nextDouble();
                    System.out.print(typ + ": Vignette für dieses Jahr? (J/N) ");
                    road_tax_disc = jaNein(scanner.next());
                    System.out.print(typ + ": Treibstoff-Stand: ");
                    gas_level_percent = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print(typ + ": Typ:");
                    type = scanner.nextLine();
                    if (typ.equals("Auto")) {
                        System.out.print(typ + ": Sitzplätze: ");
                        space = scanner.nextInt();
                        List<Car> cars = Arrays.asList(new Car(purchase_year, borrowed, km_total, road_tax_disc, gas_level_percent, type, space));
                        json_in(cars);
                    } else if (typ.equals("LKW")) {
                        System.out.print(typ + ": Ladegewicht: ");
                        load_capacity = scanner.nextDouble();
                        List<Truck> trucks = Arrays.asList(new Truck(purchase_year, borrowed, km_total, road_tax_disc, gas_level_percent, type, load_capacity));
                        json_in_truck(trucks);
                    } else if (typ.equals("Motorrad")) {
                        List<Motorbike> motorbikes = Arrays.asList(new Motorbike(purchase_year, borrowed, km_total, road_tax_disc, gas_level_percent, type));
                        json_in_motorbike(motorbikes);
                    }
                } else {
                    scanner.nextLine();
                    System.out.print(typ + ": Typ:");
                    type = scanner.nextLine();
                    List<Bike> bikes = Arrays.asList(new Bike(purchase_year, borrowed, type));
                    json_in_bike(bikes);
                }
                return true;
            } catch (Exception e) {
                System.out.println("Fehler bei der Eingabe: " + e.getMessage() + " Bitte erneut eingeben.");
                scanner.nextLine();
            }
        }
    }

    private static boolean jaNein(String eingabe) {
        while (true) {
            if (eingabe.equalsIgnoreCase("J")) return true;
            if (eingabe.equalsIgnoreCase("N")) return false;
            System.out.println("Eingabe war falsch, bitte J oder N eingeben:");
            eingabe = scanner.next();
        }
    }
}
