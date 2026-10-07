package weitere_aufgaben;
import java.util.Random;
import java.util.Scanner;

public class KMS_1_05_LE_06_06_Gossak_kinoplaetze {


    public static boolean hat_plaetze_nebeneinander(int[] row, int customer_group) {
        int group_counter = 0;
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 0) {
                group_counter++;
                if (group_counter == customer_group) {
                    return true;
                }
            } else {
                group_counter = 0;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int counter_all = 0;
        int customer_group;
        int[][] random_data = new int[10][10];
        Random rand = new Random();

        // Zufällige Belegung erzeugen
        for (int i = 0; i < random_data.length; i++) {
            for (int j = 0; j < random_data[i].length; j++) {
                random_data[i][j] = rand.nextInt(2);
            }
        }
        System.out.println("Wie viele Plätze brauchen Sie?: ");
        customer_group = scanner.nextInt();

        // Sitzplan ausgeben und belegte Plätze zählen
        for (int i = 0; i < random_data.length; i++) {
            for (int j = 0; j < random_data[i].length; j++) {
                System.out.print(random_data[i][j] + "\t");
                if (random_data[i][j] == 1){
                    counter_all++;
                }
            }
            System.out.println();
        }

        // Suche nach zusammenhängenden freien Plätzen in jeder Reihe
        boolean gefunden = false;
        for (int i = 0; i < random_data.length; i++) {
            if (hat_plaetze_nebeneinander(random_data[i], customer_group)) {
                System.out.println("Mindestens " + customer_group + " zusammenhängende freie Plätze in Reihe " + (i+1) + " gefunden!");
                gefunden = true;
                // break; // entfernt, damit alle Reihen geprüft werden
            }
        }
        if (!gefunden) {
            System.out.println("Keine " + customer_group + " zusammenhängenden freien Plätze gefunden.");
        }

        double auslastung = (double) counter_all / (random_data.length * random_data[0].length) * 100;
        System.out.printf("Die prozentuale Auslastung ist %.2f %%\n", auslastung);
        scanner.close();
    }
}
