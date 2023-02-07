package soccer;

import java.util.List;

public class Game extends GameEvent{
    private Team teamA;
    private Team teamB;
    private List<Goal> goalList;

    public Game() {
    }

    public List<Goal> getGoalList() {
        return this.goalList;
    }

    public void setGoalList(List<Goal> goalList) {
        this.goalList = goalList;
    }

    public Team getTeamB() {
        return this.teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public Team getTeamA() {
        return this.teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }
}
