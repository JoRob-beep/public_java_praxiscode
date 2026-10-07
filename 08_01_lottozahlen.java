package weitere_aufgaben;
import java.util.Scanner;
import static weitere_aufgaben.standard_validation.*;

public class KMS_1_05_LE_08_01_Gossak_lottozahlen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String tipp_string;
        int tipp_int = 0;
        int[] lotto_tipps = new int[7];

        System.out.println("### Lottozahlen-Eingabe: ####");
        for (int i=0; i<6; i++){
            while(true){
                System.out.println("Geben Sie den "+ (i+1) +". Tipp ein:");
                tipp_string = scanner.nextLine();
                if (validate_int(tipp_string)) {
                    try{
                        tipp_int = Integer.parseInt(tipp_string);
                    } catch (NumberFormatException exc_convert_to_int){
                        System.out.println("Keine Zeicheneingabe bitte!");
                    }

                    if (validate_45(tipp_int) && validate_search_double(lotto_tipps, tipp_int)) {
                        lotto_tipps[i] = tipp_int;
                        break;
                    }
                }
            }
        }
    }
}
