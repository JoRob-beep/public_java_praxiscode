package weitere_aufgaben;
import java.util.Scanner;
import java.time.*;

public class KMS_1_05_LE_07_01_Gossak_time2 {
    public static int[] date_time_convert(String date_string){

        String[] dateparts;
        int[] date_array = new int[3];

        // Datum aufdröseln:
        dateparts = date_string.split("\\.");
        for (int i = 0; i < 3; i++) {
            date_array[i] = Integer.parseInt(dateparts[i]);
        }

        return date_array;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String order_date;
        String delivery_date;
        LocalDateTime order;
        LocalDateTime delivery;

        // Startzeit:
        System.out.println("### Lieferzeitrechner: ###");
        System.out.println("Geben Sie das Bestelldatum ein: ");
        order_date = scanner.nextLine();

        // Endzeit:
        //System.out.println("Geben Sie das Enddatum ein zB: 15.3.2000 : ");
        //end_work_date_string = scanner.nextLine();
        System.out.println("Geben Sie das Lieferdatum ein: ");
        delivery_date = scanner.nextLine();
        // Eingestempelt:
        int[] date_array = date_time_convert(order_date);
        order = LocalDateTime.of(
                date_array[2], // Jahr
                date_array[1], // Monat
                date_array[0], // Tag
                0, // Stunde
                0  // Minute
        );

        // Ausgestempelt:
        date_array = date_time_convert(delivery_date);
        delivery = LocalDateTime.of(
                date_array[2], // Jahr
                date_array[1], // Monat
                date_array[0], // Tag
                0, // Stunde
                0  // Minute
        );

        System.out.println("Lieferzeit: " + Duration.between(order, delivery).toDays() + " Tage ");

        scanner.close();
    }
}