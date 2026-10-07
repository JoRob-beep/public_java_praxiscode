import java.util.Scanner;


public class KMS_1_05_LE_06_02_Gossak_summe {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        int[] input_array = new int[10000];
        int sum = 0;

        System.out.println("Summe aus beliebig vielen Werten:");
        System.out.println("Wieviele Werte möchten Sie eingeben?");
        value = scanner.nextInt();
        System.out.println("Es folgen " + value + " Eingaben");
        for(int i=1; i<=value; i++){
            System.out.println("Geben Sie die " + i + ". Zahl ein: ");
            input_array[i-1] = scanner.nextInt();
        }

        for (int i=0; i<= input_array.length-1; i++){
            sum = input_array[i] + sum;
        }
        System.out.println("Die Summe dieser Werte ist: " + sum);
        System.out.println("Eingegebene Zahlen: " + value);

        scanner.close();
    }

}
