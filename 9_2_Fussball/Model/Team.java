package KMS_1_05_LE_9_2_Gossak_Fussball.Model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private int numOfAthletes;
    private List<Person> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public Team() {
        this.players = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String name) {
        this.teamName = name;
    }

    public int getNumOfAthletes() {
        return numOfAthletes;
    }

    public void setNumOfAthletes(int num) {
        this.numOfAthletes = num;
    }

    public void addPlayer(Person player) {
        players.add(player);
        numOfAthletes = players.size();
    }

    public List<Person> getPlayers() {
        return players;
    }

    public void setPlayers(List<Person> players) {
        this.players = players;
        this.numOfAthletes = players.size();
    }
}
