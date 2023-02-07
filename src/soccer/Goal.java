package soccer;

public class Goal {
    private double time;
    private String team;
    private String playerName;

    public Goal() {
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public double getTime() {
        return this.time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void displayGoal(Goal goal) {
        System.out.println("goal time is :" + goal.time);
        System.out.println("team name is :" + goal.getTeam());
        System.out.println("goal player is :" + this.getPlayerName());
    }
}
