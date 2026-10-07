import java.util.Scanner;

public class LE_04_01_text_analyse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;

        System.out.println("### Text-Analyse ####");
        System.out.println("Geben Sie Ihren Text ein: ");
        text = scanner.nextLine();

        System.out.println("Anzahl Vokale: " + anzahlVokale(text));
        System.out.println("Anzahl Leerzeichen: " + anzahlLeerzeichen(text));
        System.out.println("Anzahl Satzzeichen: " + anzahlSatzzeichen(text));
        System.out.println("Anzahl Konsonanten: " + anzahlKonsonanten(text));
    }

    public static int anzahlVokale(String text) {
        int count = 0;

        for (char text_lower_array : text.toCharArray()) {
            text_lower_array = Character.toLowerCase(text_lower_array);
            if ("aeiou".indexOf(text_lower_array) != -1) {
                count++;
            }
        }
        return count;
    }
    public static int anzahlLeerzeichen(String text) {
        int count_space = 0;
        for (char text_space : text.toCharArray()) {
            if ((" ".indexOf(text_space) != -1)) {
                count_space++;
            }
        }
        return count_space;
    }
    public static int anzahlSatzzeichen(String text) {
        int count_mark = 0;
        for (char text_mark : text.toCharArray()) {
            if ((",.!?:;'()".indexOf(text_mark) != -1)) {
                count_mark++;
            }
        }
        return count_mark;
    }
    public static int anzahlKonsonanten(String text) {
        int count = 0;

        for (char text_lower_array : text.toCharArray()) {
            text_lower_array = Character.toLowerCase(text_lower_array);
            if ("bcdfghjklmnpqrstvwxyzß".indexOf(text_lower_array) != -1) {
                count++;
            }
        }
        return count;
    }
}


