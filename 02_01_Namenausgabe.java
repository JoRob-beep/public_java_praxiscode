import java.util.Scanner;

public class LE_02_01_Namenausgabe {
    public static void main(String[] args) {
        String vorname;
        String nachname;
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Vornamen ein: ");
        vorname = scan.nextLine();
        System.out.println("Geben Sie Ihren Nachnamen ein: ");
        nachname = scan.nextLine();
        System.out.println("Ihr Name ist: " + nachname + " " + vorname);
    }
}