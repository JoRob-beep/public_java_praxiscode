package weitere_aufgaben;
import java.util.Scanner;
import java.time.*;

public class KMS_1_05_LE_07_01_Gossak_time {
    public static int[] date_time_convert(String work_date_string, String work_time_string){

        String[] dateparts;
        int[] work_date_array = new int[3];
        String[] timeparts;
        int[] work_time_array = new int[2];
        int[] date_time_array;

        // Datum aufdröseln:
        dateparts = work_date_string.split("\\.");
        for (int i = 0; i < 3; i++) {
            work_date_array[i] = Integer.parseInt(dateparts[i]);
        }
        // Zeit aufdröseln:
        timeparts = work_time_string.split("\\:");
        for (int i = 0; i < 2; i++) {
            work_time_array[i] = Integer.parseInt(timeparts[i]);
        }
        // Aus 2 Arrays eines machen!!:
        date_time_array = new int[work_date_array.length + work_time_array.length];
        System.arraycopy(work_date_array, 0, date_time_array, 0, work_date_array.length);
        System.arraycopy(work_time_array, 0, date_time_array, work_date_array.length, work_time_array.length);

        return date_time_array;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String start_work_date_string;
        String end_work_date_string;
        String start_work_time_string;
        String end_work_time_string;
        LocalDateTime start;
        LocalDateTime end;

        // Startzeit:
        System.out.println("### Arbeitszeitrechner ###");
        System.out.println("Geben Sie das Startdatum ein zB: 15.3.2000 : ");
        start_work_date_string = scanner.nextLine();
        System.out.println("Geben Sie die Startzeit ein zB: 05:00 ");
        start_work_time_string = scanner.nextLine();

        // Endzeit:
        //System.out.println("Geben Sie das Enddatum ein zB: 15.3.2000 : ");
        //end_work_date_string = scanner.nextLine();
        System.out.println("Geben Sie die Endzeit ein zB: 15:30 ");
        end_work_time_string = scanner.nextLine();
        // Eingestempelt:
        int[] date_time_array = date_time_convert(start_work_date_string, start_work_time_string);
        start = LocalDateTime.of(
            date_time_array[2], // Jahr
            date_time_array[1], // Monat
            date_time_array[0], // Tag
            date_time_array[3], // Stunde
            date_time_array[4]  // Minute
        );

        // Ausgestempelt:
        date_time_array = date_time_convert(start_work_date_string, end_work_time_string);
        end = LocalDateTime.of(
            date_time_array[2], // Jahr
            date_time_array[1], // Monat
            date_time_array[0], // Tag
            date_time_array[3], // Stunde
            date_time_array[4]  // Minute
        );

        System.out.println("Arbeitszeit: " + Duration.between(start, end).toHours() + " Stunden und " + (Duration.between(start, end).toMinutes() % 60) + " Minuten");
        scanner.close();
    }
}
