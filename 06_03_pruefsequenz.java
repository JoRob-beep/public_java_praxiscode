package weitere_aufgaben;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class KMS_1_05_LE_06_03_Gossak_pruefsequenz {
    public static void main(String[]args ){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int startIndex;
        int check_sequence_int;
        String check_sequence_string;
        ArrayList<Integer> sequence = new ArrayList<>();
        ArrayList<Integer> check_sequence = new ArrayList<>();

        for (int i = 0; i < 16; i++) {
            sequence.add(random.nextInt(100));
        }

        System.out.println("### Prüfsequenz ###");

        while(true) {
            System.out.println("Gebe deine 4-Stellige Prüf-Zahlen ein: ");
            check_sequence_string = scanner.nextLine();

            if (standard_validation.validate_int(check_sequence_string) && standard_validation.validate_int_four(check_sequence_string)) {
                System.out.println("Eingabe ist gültig.");
                break;
            } else {
                System.out.println("Eingabe ist ungültig.");
            }
        }

        for (int i = 0; i <= 3  ; i++) {
            check_sequence.add(i, Character.getNumericValue(check_sequence_string.charAt(i)));
        }
        sequence.addAll(check_sequence);

        // Prüfen, ob das gleich ist. Nach der Übertragung:
        boolean gleich = true;
        startIndex = sequence.size() - check_sequence.size();
        for (int i = 0; i < check_sequence.size(); i++) {
            if (!sequence.get(startIndex + i).equals(check_sequence.get(i))) {
                gleich = false;
                break;
            }
        }
        System.out.println("Die Sequenz stimmt überein.");
        System.out.printf("Die Sequenz ist: %s \n", sequence.toString());
        System.out.printf("Die Sequenz ist: %s", check_sequence.toString());



        scanner.close();
    }

}
