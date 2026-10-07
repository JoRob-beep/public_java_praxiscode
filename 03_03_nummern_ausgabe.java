import java.util.Scanner;

public class LE_03_03_nummern_ausgabe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String start;
        String end;
        String increment;
        double start_num = 0;
        double end_num = 0;
        double increment_num = 0;
            System.out.println("### Zahlenausgabe ####");
        while(true) {
            System.out.println("Geben Sie den Startwert ein: ");
            start = scanner.nextLine();
            if (start.matches("^-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?$")) {
                start_num = Double.parseDouble(start);
                break;
            } else {
                System.out.println("Das war keine Zahl");
            }
        }
        while(true) {
            System.out.println("Geben Sie den Endwert ein: ");
            end = scanner.nextLine();

            if (end.matches("^-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?$")) {
                end_num = Double.parseDouble(end);
                if (start_num < end_num) {
                    break;
                } else {
                    System.out.println("Da war die zweite Zahl kleiner.");
                }
            } else {
                System.out.println("Das war keine Zahl");
            }
        }
        while(true) {
            System.out.println("Geben Sie die Schrittweite ein: ");
            increment = scanner.nextLine();
            if (increment.matches("^-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?$")) {
                increment_num = Double.parseDouble(increment);
                if(increment_num < start_num) {
                    break;
                }else {
                    System.out.println("Die Zahl für die Schrittweite war zu hoch.");
                }
            } else {
                System.out.println("Das war keine Zahl");
            }
        }
        for(double i = start_num; i <= end_num; i += increment_num){
            System.out.println(i);
        }
    }
}
