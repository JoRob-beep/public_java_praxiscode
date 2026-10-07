package KMS_1_05_LE_9_2_Gossak_Fussball.Controll;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import KMS_1_05_LE_9_2_Gossak_Fussball.Model.Club;
import KMS_1_05_LE_9_2_Gossak_Fussball.Model.Team;
import KMS_1_05_LE_9_2_Gossak_Fussball.Model.Person;

public class StoreData {
    public void saveToCsv(Object data) {
        if (!(data instanceof Club)) {
            System.out.println("Fehler beim speichern.");
            return;
        }
        Club club = (Club) data;
        boolean writeHeader = false;
        File file = new File("club.csv");
        if (!file.exists() || file.length() == 0) {
            writeHeader = true;
        }
        try (FileWriter writer = new FileWriter(file, true)) {
            if (writeHeader) {
                writer.write("Team;Vorname;Nachname;Trikotnummer\n");
            }
            for (Team team : club.getTeams()) {
                for (Person player : team.getPlayers()) {
                    writer.write(team.getTeamName() + ";" +
                                 player.getFirstName() + ";" +
                                 player.getSurName() + ";" +
                                 player.getShirtNum() + "\n");
                }
            }
            System.out.println("Daten wurden als CSV gespeichert: club.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
