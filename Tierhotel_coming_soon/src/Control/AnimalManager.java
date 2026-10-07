package Control;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalManager {
    private static Integer maxAnimal = 7;
    private static Integer countCheckedIn = 0;
    private static ArrayList<String> animals;

    public AnimalManager(Integer maxAnimal, Integer countCheckedIn, ArrayList<String>animals, Scanner scanner) {
        this.maxAnimal = maxAnimal;
        this.countCheckedIn = countCheckedIn;
        this.animals = animals;
    }

    public Integer getMaxAnimal() {
        return maxAnimal;
    }

    public void setMaxAnimal(Integer maxAnimal) {
        this.maxAnimal = maxAnimal;
    }

    public Integer getCountCheckedIn() {
        return countCheckedIn;
    }

    public void setCountCheckedIn(Integer countCheckedIn) {
        this.countCheckedIn = countCheckedIn;
    }

    public ArrayList<String> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<String> animals) {
        this.animals = animals;
    }

    public static void CheckIn(){
        ArrayList<String> animals = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welches Tier ist es? (Hund), (Katze), (Vogel)");
        String inputType = scanner.nextLine();
        if (inputType.equals("Hund")){
            if (countCheckedIn <=maxAnimal){
                Dogs newdog = new Dogs("Bello", 5, "Herbert Jach", false, "Schaefer", true);
                animals.add(newdog.getNameAnimal()+";"+newdog.getAgeAnimal()+";"+newdog.getOwnerAnimal()+";"+newdog.getTaskWalk()+";"+newdog.getRaceDog()+";"+newdog.getTrained());

                countCheckedIn++;
            }else{
                System.out.println("Schon zu viele Tiere. ");
            }
        } else if (inputType.equals("Katze")){
            if (countCheckedIn <=maxAnimal){
                Cats newcat = new Cats("Mieze", 3, "Herbert Jach", false, "Schwarz", true);
                animals.add(String.valueOf(newcat));

                countCheckedIn++;
            }else{
                System.out.println("Schon zu viele Tiere. ");
            }

        } else if (inputType.equals("Vogel")){
            if (countCheckedIn <=maxAnimal){
                Birds newbird = new Birds("Pfeifi", 2, "Herbert Jach", true, "Rotkehlchen", false);
                animals.add(String.valueOf(newbird));

                countCheckedIn++;
            }else{
                System.out.println("Schon zu viele Tiere. ");
            }
        } else{
            System.out.println("Falsche Eingabe, bitte nocheinmal");
        }
    }
}
