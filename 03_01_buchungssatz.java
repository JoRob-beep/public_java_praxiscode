import java.util.Scanner;

public class LE_03_01_buchungssatz {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String user;
        String description;
        String quantity;
        int quantity_int;
        String price;
        double price_double;

        System.out.println(">> Hallo, hier ist das Bestellformular!");
        System.out.println(">> Gebe deinen Usernamen ein: ");
        user = scanner.nextLine();
        System.out.println(">> Gebe nun deine Beschreibung ein: ");
        description = scanner.nextLine();
        while(true){
            System.out.println(">> Gebe nun die Menge ein: ");
            quantity = scanner.nextLine();
            if (quantity.matches("-?\\d+")){
                quantity_int = Integer.parseInt(quantity);
                break;
            } else{
                System.out.println("Bitte geben Sie nur eine ganze Zahl ein!");
            }
        }
        while(true){
            System.out.println(">> Gebe nun den Preis (mit Punkt als Komma) ein: ");
            price = scanner.nextLine();
            if (price.matches("^-?\\d+\\.\\d{2}$")){
                price_double = Double.parseDouble(price);
                break;
            } else{
                System.out.println("Bitte geben Sie nur zahlen mit 2 Nachkommastellen an!");
            }
        }
        System.out.printf("%s %s %d %.2f\n", user, description, quantity_int, price_double);
        scanner.close();

    }
}
