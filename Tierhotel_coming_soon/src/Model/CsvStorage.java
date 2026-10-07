package Model;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class CsvStorage {
    public CsvStorage() {
    }
    public static void storeCsv(String oldData) {
        boolean writeHeader = false;
        File file = new File("animals2.csv");
        if (!file.exists() || file.length() == 0) {
            writeHeader = true;
        }
        try (FileWriter writer = new FileWriter(file, true)) {
            if (writeHeader) {
                Dogs newdog = new Dogs("Bello", 5, "Herbert Jach", false, "Schaefer", true);
                writer.write(oldData);
                writer.write("Hund:\n");
                writer.write("Name; Alter; Eigentümer; Schon Gassi gegangen?; Rasse; Ist abgerichtet?\n");

                writer.write(newdog.getNameAnimal()+";"+newdog.getAgeAnimal()+";"+newdog.getOwnerAnimal()+";"+newdog.getTaskWalk()+";"+newdog.getRaceDog()+";"+newdog.getTrained());
            }
            System.out.println("Daten wurden als CSV gespeichert: animals2.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String loadFromCsv(){
        String data="";
        try {
            File myObj = new File("animals.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return data;
    }
}
