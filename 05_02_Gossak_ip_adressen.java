import java.util.Scanner;

public class KMS_1_05_LE_05_02_Gossak_ip_adressen {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String address_string;
        String[] parts;
        int size_of_parts;
        String dez_to_bin;
        String dez_to_hex;
        String dez_to_okt;

        System.out.println("Zahlensystem-Umrechner bei IP-Adressen:");
        System.out.println("Geben Sie eine IP-Adresse ei:");
        address_string = scanner.nextLine();
        //address_string.indexOf(".");
        parts = address_string.split("\\.");

        System.out.println("In einer Binärzahl ist das: ");
        size_of_parts = parts.length;
        for(int i = 0; i<size_of_parts; i++){
            dez_to_bin = Integer.toBinaryString(Integer.parseInt(parts[i]));
            System.out.printf("Die %d. Stelle ist: %s \n", i+1, dez_to_bin);
        }
        System.out.println("In einer Hexadezimalzahl ist das: ");
        for(int i = 0; i<size_of_parts; i++){
            dez_to_hex = Integer.toHexString(Integer.parseInt(parts[i]));
            System.out.printf("Die %d. Stelle ist: %s \n", i+1, dez_to_hex);
        }
        System.out.println("In einer Oktalzahl ist das: ");
        for(int i = 0; i<size_of_parts; i++){
            dez_to_okt = Integer.toOctalString(Integer.parseInt(parts[i]));
            System.out.printf("Die %d. Stelle ist: %s \n", i+1, dez_to_okt);
        }
        scanner.close();
    }
}
