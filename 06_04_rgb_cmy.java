package weitere_aufgaben;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class KMS_1_05_LE_06_04_Gossak_rgb_cmy {

    public static void rgb_to_cmy(String color_rgb_string){
        ArrayList<String> color_division = new ArrayList<>();
        ArrayList<int[]> color_division_int = new ArrayList<>();
        int red;
        int green;
        int blue;
        double cyan;
        double magenta;
        double yellow;
        color_division.addAll(Arrays.asList(color_rgb_string.split(",")));
        red = Integer.parseInt(color_division.get(0));
        green = Integer.parseInt(color_division.get(1));
        //System.out.println(color_division.get(1));
        blue = Integer.parseInt(color_division.get(2));
        cyan = (double) (255 - red) / 255*100;
        magenta = (double) (255 - green) / 255*100;
        yellow = (double) (255 - blue) / 255*100;
        System.out.printf("Der CMY-Code ist: C: %.0f M: %.0f, Y: %.0f",cyan, magenta, yellow);
    }
    public static void rgb_to_hex(String color_rgb_string){
        ArrayList<String> color_division = new ArrayList<>();
        ArrayList<int[]> color_division_int = new ArrayList<>();
        String rhex;
        String ghex;
        String bhex;
        String hex;
        color_division.addAll(Arrays.asList(color_rgb_string.split(",")));
        rhex = Integer.toHexString(Integer.parseInt(color_division.get(0)));
        ghex = Integer.toHexString(Integer.parseInt(color_division.get(1)));
        bhex = Integer.toHexString(Integer.parseInt(color_division.get(2)));

        if (rhex.length() == 1) rhex = "0" + rhex;
        if (ghex.length() == 1) ghex = "0" + ghex;
        if (bhex.length() == 1) bhex = "0" + bhex;

        hex = "#" + rhex + ghex + bhex;

        System.out.println("Der HEX code ist:" + hex);
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String color_mode_string;
        int color_mode_int;
        String color_rgb_string;
        int color_rgb_int;
        System.out.println("### Umwandlung RGB in CMY und HEX(CSS) ###");

        while(true) {
            System.out.println("Wollen sie in CMY (1) oder in HEX/CSS (2) umrechnen?");
            color_mode_string = scanner.nextLine();

            if (standard_validation.validate_int_one_two(color_mode_string) && standard_validation.validate_int(color_mode_string)) {
                System.out.println("Eingabe ist gültig.");
                break;
            } else {
                System.out.println("Eingabe ist ungültig.");
            }
        }
        while(true) {
            System.out.println("Geben Sie den RGB-Wert ein (RRR,GGG,BBB):");
            color_rgb_string = scanner.nextLine();

            if (standard_validation.validate_int_rgb(color_rgb_string)) {
                System.out.println("Eingabe ist gültig.");
                break;
            } else {
                System.out.println("Eingabe ist ungültig.");
            }
        }


        color_mode_int = Integer.parseInt(color_mode_string);
        if (color_mode_int == 1){
            rgb_to_cmy(color_rgb_string);
        }
        else{
            // Berechnung RGB zu HEX(CSS)
            rgb_to_hex(color_rgb_string);
        }

        scanner.close();
    }

}
