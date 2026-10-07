import java.util.Scanner;
import java.util.ArrayList;

public class KMS_1_05_LE_04_02_Gossak_textverschluesselung {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int schluessel = 5;
        String verschluesselt = "";
        String text;

        System.out.println("### Text-Verschüsselung ####");
        System.out.println("Geben Sie Ihren Text ein: ");
        text = scanner.nextLine();


        for (int i = 0; i < text.length(); i++) {
            char buchstabe = text.charAt(i);

            // Kleinbuchstaben verschlüsseln
            if (buchstabe >= 'a' && buchstabe <= 'z') {
                // Buchstabe im Alphabet verschieben
                int position = buchstabe - 'a';    // a ist die Zahl 97
                int neuePosition = (position + schluessel) % 26;
                char neuerBuchstabe = (char) ('a' + neuePosition); // a ist die Zahl 97
                // (char) Rechne aus, was 'a' + neuePosition ergibt (eine Zahl),
                // und verwandle diese Zahl wieder in einen Buchstaben.
                verschluesselt += neuerBuchstabe;


                // Großbuchstaben
            } else if (buchstabe >= 'A' && buchstabe <= 'Z') {
                int position = buchstabe - 'A';
                int neuePosition = (position + schluessel) % 26;
                char neuerBuchstabe = (char) ('A' + neuePosition);

                verschluesselt += neuerBuchstabe;
            } else {
                //
                verschluesselt += buchstabe;
            }
        }

        System.out.println("Verschlüsselt: " + verschluesselt);
        scanner.close();
    }
}
