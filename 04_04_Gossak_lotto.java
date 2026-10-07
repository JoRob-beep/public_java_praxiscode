import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class KMS_1_05_LE_04_04_Gossak_lotto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int random;
        int random_6;
        int percent;
        int summe = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        List<Map<Integer, Integer>> people = new ArrayList<>();

        random = (int) (Math.random() * 100);
        System.out.println("### Lottoauswertung: ####");
        System.out.println("Es wird eine zufällige Zahl an Menschen erstelllt: " + random);
        System.out.println("(Jeder gibt 6 Tipps ab)");
        System.out.println("Insgesamt wurden " + random * 6 +" Zahlen erhoben");

        for (int i=1; i<=random; i++){
            Map<Integer, Integer> lotto_ticket = new HashMap<>();
            for (int j=1; j <= 6; j++) {
                random_6 = (int) ((Math.random() * 44)+1);
                lotto_ticket.put(j, random_6);
            }
            people.add(lotto_ticket);
        }

        for(int i = 1; i <= 45; i++) {
            for (Map<Integer, Integer> ticket : people) {
                for (Map.Entry<Integer, Integer> entry : ticket.entrySet()) {
                    int zahl = entry.getValue();
                    if (zahl == i) {
                        frequency.put(i, frequency.getOrDefault(i, 0) + 1);
                    }
                }
            }
        }



        System.out.println("\nHäufigkeit der getippten Zahlen:");
        for (int i = 1; i <= 45; i++) {
            int count = frequency.getOrDefault(i, 0);
            percent = 100* count / (random*6);
            summe += percent;
            System.out.printf("Zahl %2d wurde %d mal gezogen. Das sind: %d Prozent.%n", i, count, percent);
        }
        //System.out.println(summe);
    }
}
