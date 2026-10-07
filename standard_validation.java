package weitere_aufgaben;

public class standard_validation {
    public static boolean validate_int(String input) {
        if ((input == null || input.isEmpty())) {
            System.out.println("Eingabe darf nicht leer sein.");
            return false;
        }
        if (input.matches("^\\d+$\n")) {
            System.out.println("Eingabe darf nur ganze Zahlen enthalten.");
            return false;
        }
        return true;
    }
    public static boolean validate_int_four(String input) {
        if (input.length() != 4) {
            System.out.println("Eingabe muss 4 ganze Zahlen lang sein.");
            return false;
        }
        return true;
    }
    public static boolean validate_int_one_two(String input) {
        if (!(input.matches("^[12]$"))) {
            System.out.println("Eingabe darf nur 1 oder 2 sein.");
            return false;
        }
        return true;
    }
    public static boolean validate_int_rgb(String input) {
        if (!(input.matches("^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d),(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d),(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$"))) {
            System.out.println("Eingabe darf nur in diesem Format eingegeben werden: RRR,GGG,BBB (je 0-255)");
            return false;
        }
        return true;
    }
    public static boolean validate_45(int input) {
        if (input > 45 || input < 1) {
            System.out.println("Eingabe darf nur zwischen 1 und 45 liegen.(Ganze Zahlen)");
            return false;
        }
        return true;
    }
    public static boolean validate_search_double(int[] array, int zahl) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == zahl) {
                System.out.println("Eingabe darf keine doppelten Zahlen enthalten.");
                return false;
            }
        }
        return true;
    }
}
