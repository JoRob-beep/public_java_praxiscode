import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class KMS_1_05_LE_04_03_Gossak_umfrage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int interviewed_person = 0;
        int zufallsbewertung;
        Map<Integer, Integer> people = new HashMap<>();
        int get_one_person = 0;
        double sum = 0;
        double average;
        double average_percent = 0;

        System.out.println("### Umfrage ####");
        System.out.println("Geben Sie die Menge der Personen ein: ");
        System.out.println("(Die befragt werden sollen)");
        interviewed_person = scanner.nextInt();

        for (int i=0; i<=interviewed_person; i++){
            zufallsbewertung = (int) ((Math.random() * 3)+1);
            people.put(i, zufallsbewertung);
            get_one_person = people.get(i);
            sum += get_one_person;
        }

        average = (sum / interviewed_person);
        System.out.printf(">> Die durchnittliche Bewertung ist: %.4f \n", average);
        average_percent = (average * 100) / 3;
        System.out.printf(">> Die Personen waren zu %.4f Prozent zufrieden. \n", average_percent);

        scanner.close();
    }
}
