package View;
import Control.*;

import java.util.Scanner;

public class Menu {
    public static void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String inputAnimal;
            System.out.println("Tierhotel");
            System.out.println("--------------------");
            System.out.println("Hauptmenü");
            System.out.println("--------------------");
            System.out.println("(1) Liste der eingecheckten Tiere");
            System.out.println("(2) Details von einem Tier");
            System.out.println("(3) Tier hinzufügen");
            System.out.println("(4) Tier ändern");
            System.out.println("(5) Tier herausnehmen");
            System.out.println("(6) Was ist heute noch zu tun?");
            System.out.println("(7) Was habe ich schon gemacht?");
            inputAnimal = scanner.nextLine();
            if (inputAnimal.equals("1")){

            }else if (inputAnimal.equals("2")){

                break;
            } else if (inputAnimal.equals("3")) {
                AnimalManager.CheckIn();
                break;
            } else if (inputAnimal.equals("4")){

                break;
            } else if (inputAnimal.equals("5")){

                break;
            }else if (inputAnimal.equals("6")){

                break;
            }else if (inputAnimal.equals("7")){

                break;
            }else {
                System.out.println("Falsche eingabe. Bitte nocheinmal");
            }
        }
    }
}
