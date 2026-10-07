import java.util.Scanner;

public class LE_02_02_Taschenrechner {
    public static void main(String[] args) {

        // Das Programm hat noch keine Validierung oder Exception-Handling

        Scanner scanner = new Scanner(System.in);
        String zahlen_string;
        String[] teile_string_array;
        int auswahl;
        String auswahl2;
        String auswahl3;
        Double multi = 1.0;
        double add = 0.0;

        double sub = 1.0;

        while(true){

            System.out.println("### Willkommen beim Taschenrechner! ###");
            System.out.println(">> Geben Sie die Zahlen (Keine Buchstaben) nach der Reihe mit Leerzeichen gertrennt ein:");
            zahlen_string = scanner.nextLine();
            teile_string_array = zahlen_string.trim().split(" ");
            // Das mit parse habe ich von Chatgpt:
            Double[] zahlen_array = new Double[teile_string_array.length];
            for(int i = 0; i < teile_string_array.length; i++) {
                zahlen_array[i] = Double.parseDouble(teile_string_array[i]);
            }
            System.out.println("Welche Rechenart wollen Sie anwenden?");
            System.out.println(">> Multiplizieren ( 1 eingeben), Addieren ( 2 eingeben)");
            System.out.println(">> Dividieren ( 3 eingeben), Subtrahieren ( 4 eingeben)");
            auswahl = scanner.nextInt();
            scanner.nextLine();  // Für einen Zeilenumbruch

            if (auswahl == 1) {
                // for-each-Schleife:
                for (double zahl : zahlen_array) {
                    multi = multi * zahl;
                }
                System.out.println(multi);
            } else if (auswahl == 2) {
                for (double zahl2 : zahlen_array) {
                    add = add + zahl2;
                }
                System.out.println(add);
            } else if (auswahl == 3) {
                double divi = zahlen_array[0];
                for (int i = 1; i < zahlen_array.length; i++) {
                    divi = divi / zahlen_array[i];
                }
                System.out.println(divi);
            } else if (auswahl == 4) {
                for (int i = 1; i < zahlen_array.length; i++) {
                    sub = sub - zahlen_array[i];
                }
                System.out.println(sub);
            }
            System.out.println("Wollen Sie mit anderen Zahlen rechnen? Mit J antworten. An Sonsten, schönen Tag...");
            auswahl3 = scanner.nextLine();
            if (!auswahl3.equalsIgnoreCase("J")) {
                break;
            }
        }
        scanner.close();
    }
}