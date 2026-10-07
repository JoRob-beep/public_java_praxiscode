import java.util.Scanner;

public class KMS_1_05_LE_05_03_Gossak_textentnahme {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String text;
        String text_array[];

        System.out.println("### Textentnahme ####");
        System.out.println("Fügen Sie einen Text ein. Artikelbezeichnung (zuerst) mit [] und Bestelller mit [] schreiben: ");
        text = scanner.nextLine();

        // text = ("Der Artikel [Artikelbezeichnung] wurde bestellt von [Besteller]");
        text = text.replace("[", ".");
        text = text.replace("]", ".");
        text_array = text.split("\\.");

        System.out.printf("Artikelbezeichnung ist: %s. Besteller ist: %s", text_array[1], text_array[3]);

        scanner.close();
    }
}
