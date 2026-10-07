package KMS_1_05_LE_9_2_Gossak_Fussball.Model;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private int totalNumAthletes;
    private int numOfMembers;
    private List<Team> teams;

    public Club() {
        this.teams = new ArrayList<>();
    }

    public int countMembers() {
        return numOfMembers;
    }

    public int getTotalNumAthletes() {
        return totalNumAthletes;
    }

    public void setTotalNumAthletes(int num) {
        this.totalNumAthletes = num;
    }

    public void addTeam(Team team) {
        teams.add(team);
        numOfMembers += team.getNumOfAthletes();
        totalNumAthletes += team.getNumOfAthletes();
    }

    public void addPlayerToTeam(Person player) {
        numOfMembers++;
        totalNumAthletes++;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }

    public void setNumOfMembers(int numOfMembers) {
        this.numOfMembers = numOfMembers;
    }
}
