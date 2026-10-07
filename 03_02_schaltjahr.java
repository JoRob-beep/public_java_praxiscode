import java.util.Scanner;
import java.util.ArrayList;
public class LE_03_02_schaltjahr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Definierung und Initialisierung der Variablen
        String input_year;
        int input_year_int = 0;
        int[] leap_year = {1960, 1964, 1968, 1972, 176, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024};
        String input_start_year;
        int input_start_year_int = 0;
        String input_end_year;
        int input_end_year_int = 0;
        ArrayList<Integer> interval = new ArrayList<>();

        System.out.println("Willkommen bei dem Schaltjahr-Programm");

        while(true) {
            while (true) {
                System.out.println("Geben Sie eine Jahreszahl ein, um zu erkennen ob es ein Schaltjahr ist: ");
                System.out.println("(Zwischen 1960 und 2025)");
                input_year = scanner.nextLine();
                if (input_year.matches("-?\\d+")) {
                    input_year_int = Integer.parseInt(input_year);
                    break;
                } else {
                    System.out.println("Die Eingabe war keine ganze Zahl");
                }
            }
            if (input_year_int < 1960) {
                System.out.println("Das ist vor 1960");
            }else if (input_year_int > 2025){
                System.out.println("Das ist nach 2025");
            }else {
                break;
            }
        } // Validierung und Umwandlung für später

        for(int i=0; i<=16; i++) {
            if (leap_year[i] == input_year_int) {
                System.out.println("Es ist ein Schaltjahr!");
                break;
            } else {
                if (i>0){
                    System.out.println("Es ist KEIN Schaltjahr!");
                    break;
                }
                continue;
            }
        } // Schaltjahr oder nicht

        // Anfang 2. Teil:
        System.out.println("---------------------------------------");
        System.out.println("###    Intervall an Schaltjaren:    ###");
        System.out.println("###    Intervall: 1960 bis 2025!    ###");

        // Input Anfangswert:
        while(true) {
            System.out.println("Geben Sie eine Anfangs-Jahreszahl ein: ");
            input_start_year = scanner.nextLine();
            if (input_start_year.matches("^(196[0-9]|19[7-9][0-9]|20[0-1][0-9]|202[0-4])$")) {
                input_start_year_int = Integer.parseInt(input_start_year);
                break;
            } else {
                System.out.println("Die Eingabe war keine ganze Zahl oder außerhalb des Bereichs.");
            }
        }

        // INput Endwert:
        while (true) {
            System.out.println("Geben Sie eine End-Jahreszeit ein: ");
            input_end_year = scanner.nextLine();
            if (input_end_year.matches("^(196[1-9]|19[7-9][0-9]|20[0-1][0-9]|202[0-4]|2025)$")) {
                input_end_year_int = Integer.parseInt(input_end_year);
                if (input_start_year_int < input_end_year_int){
                    break;
                } else {
                    System.out.println("Eingabe muss größer sein als Startwert.");
                }

            } else {
                System.out.println("Die Eingabe war keine ganze Zahl oder außerhalb des Bereichs. ");
            }
        }

        for(int j=0; j<=16; j++) {
            if (leap_year[j] > input_end_year_int) {
                break;
            }
            if (leap_year[j] >= input_start_year_int) {
                interval.add(leap_year[j]);
            }
        }
        for (int i = 0; i <= interval.size()-1; i++){
            System.out.println(interval.get(i));
        }

    }

}
