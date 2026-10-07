import java.util.Scanner;

public class KMS_1_05_LE_05_01_Gossak_farben {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String hex_value;
        char hex_array[];
        int red_first_dez;
        int red_second_dez;
        int red_ready;
        int green_first_dez;
        int green_second_dez;
        int green_ready;
        int blue_first_dez;
        int blue_second_dez;
        int blue_ready;

        System.out.println("Farbcode-Umrechnung");
        System.out.println("Geben Sie den Hexadezimal-Code ein:");
        hex_value = scanner.nextLine();
        // Char-Array erstellen:
        hex_array = hex_value.toCharArray();

        // Rot ermitteln:
        red_first_dez = Character.digit(hex_array[0], 16);
        red_second_dez = Character.digit(hex_array[1], 16);
        red_ready = red_first_dez * 16 + red_second_dez;

        // Grün ermitteln:
        green_first_dez = Character.digit(hex_array[2], 16);
        green_second_dez = Character.digit(hex_array[3], 16);
        green_ready = green_first_dez * 16 + green_second_dez;

        // Blau ermitteln:
        blue_first_dez = Character.digit(hex_array[4], 16);
        blue_second_dez = Character.digit(hex_array[5], 16);
        blue_ready = blue_first_dez * 16 + blue_second_dez;

        System.out.printf("Die Farbe ist in RGB: R: %d G: %d B: %d", red_ready, green_ready, blue_ready);

        scanner.close();
    }
}
