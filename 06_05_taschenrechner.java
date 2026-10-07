package weitere_aufgaben;
import java.util.Scanner;

public class KMS_1_05_LE_06_05_Gossak_taschenrechner {
    public static void multiply_double(double number1_double, double number2_double){
        double product = 0;
        int product_int;
        if (number1_double % 1 != 0 || number2_double % 1 != 0) {
            //double
            product = number1_double * number2_double;
            System.out.println("Das Ergebnis der Mutiplikation ist: " + product);
        } else {
            //int
            product_int = (int) (number1_double * number2_double);
            System.out.println("Das Ergebnis der Mutiplikation ist: " + product_int);

        }
    }
    public static void add_double(double number1_double, double number2_double){
        double sum;
        int sum_int;
        if (number1_double % 1 != 0 || number2_double % 1 != 0) {
            //double
            sum = number1_double + number2_double;
            System.out.println("Das Ergebnis der Addition ist: " + sum);
        } else {
            //int
            sum_int = (int) (number1_double + number2_double);
            System.out.println("Das Ergebnis der Addition ist: " + sum_int);
        }
    }
    public static void subtract_double(double number1_double, double number2_double){
        double difference;
        int difference_int;
        if (number1_double % 1 != 0 || number2_double % 1 != 0) {
            //double
            difference = number1_double - number2_double;
            System.out.println("Das Ergebnis der Subtraktion ist: " + difference);
        } else {
            //int
            difference_int = (int) (number1_double - number2_double);
            System.out.println("Das Ergebnis der Subtraktion ist: " + difference_int);
        }
    }
    public static void divide_double(double number1_double, double number2_double){
        double quotient;
        int quotient_int;
        if (number1_double % 1 != 0 || number2_double % 1 != 0) {
            //double
            quotient = number1_double / number2_double;
            System.out.println("Das Ergebnis der Division ist: " + quotient);
        } else {
            //int
            quotient_int = (int) (number1_double / number2_double);
            System.out.println("Das Ergebnis der Division ist: " + quotient_int);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String number1;
        String number2;
        double number1_double;
        double number2_double;
        int calc_type;
        String repeat;

        while(true) {
            System.out.println("### Willkommen beim Taschenrechner! ###");
            System.out.println("Geben Sie die erste Zahl ein: ");
            number1 = scanner.nextLine();
            System.out.println("Geben Sie die zweite Zahl ein: ");
            number2 = scanner.nextLine();

            number1_double = Double.parseDouble(number1);
            number2_double = Double.parseDouble(number2);

            System.out.println("Welche Rechenart wollen Sie anwenden?");
            System.out.println(">> Multiplizieren ( 1 eingeben), Addieren ( 2 eingeben)");
            System.out.println(">> Dividieren ( 3 eingeben), Subtrahieren ( 4 eingeben)");
            calc_type = scanner.nextInt();
            scanner.nextLine();  // Für einen Zeilenumbruch

            if (calc_type == 1) {
                multiply_double(number1_double, number2_double);
            } else if (calc_type == 2) {
                add_double(number1_double, number2_double);
            } else if (calc_type == 3) {
                divide_double(number1_double, number2_double);
            } else if (calc_type == 4) {
                subtract_double(number1_double, number2_double);
            }

            System.out.println("Wollen Sie mit anderen Zahlen rechnen? Mit J antworten. An Sonsten, schönen Tag...");
            repeat = scanner.nextLine();
            if (!repeat.equalsIgnoreCase("J")) {
                break;
            }
        }
        scanner.close();
    }
}
