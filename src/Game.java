package src;
import java.util.List;

public class Game {
    private Team teamA;
    private Team teamB;

    public List<Goal> getGoalList() {
        return goalList;
    }

    public void setGoalList(List<Goal> goalList) {
        this.goalList = goalList;
    }

    private List<Goal> goalList;

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }



//    public void setGoalList(Goal goal1, Goal goal2, Goal goal3, Goal goal4) {
//    }
//    public void displayWinnging(){
//        int countA = 0, countB = 0;
//        for (Goal a : goalList) {
//            if (a.getTeam() == teamA.getName()) {
//                countA++;
//            } else countB++;
//        }
//        System.out.println();
//    }
}


