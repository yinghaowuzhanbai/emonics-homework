package soccer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class League {
    public League() {
    }

    public static void randomGoal(Goal goal, Team teamA, Team teamB) {
        int playerRandom = (int)(Math.random() * 3.0D);
        int ans = (int)(Math.random() * 90.0D);
        goal.setTime((double)ans);
        if (ans > 45) {
            goal.setTeam(teamA.getName());
            goal.setPlayerName(teamA.getPlayers()[playerRandom]);
        } else {
            goal.setTeam(teamB.getName());
            goal.setPlayerName(teamB.getPlayers()[playerRandom]);
        }

    }

    public static void main(String[] args) {
        Team teamA = new Team();
        teamA.setName("Lakers");
        teamA.setPlayers(new String[]{"A", "B", "C"});
        Team teamB = new Team();
        teamB.setName("Monsters");
        teamB.setPlayers(new String[]{"D", "E", "F"});
        Goal goal1 = new Goal();
        goal1.setPlayerName("A");
        goal1.setTeam("Lakers");
        goal1.setTime(2.0D);
        Goal goal2 = new Goal();
        goal2.setPlayerName("A");
        goal2.setTeam("Lakers");
        goal2.setTime(8.0D);
        Goal goal3 = new Goal();
        goal3.setPlayerName("B");
        goal3.setTeam("Lakers");
        goal3.setTime(10.0D);
        Goal goal4 = new Goal();
        goal4.setPlayerName("A");
        goal4.setTeam("Lakers");
        goal4.setTime(12.0D);
        List<Goal> goalList = new ArrayList();
        goalList.add(goal1);
        goalList.add(goal2);
        goalList.add(goal3);
        goalList.add(goal4);
        Goal goal5 = new Goal();
        randomGoal(goal5, teamA, teamB);
        goalList.add(goal5);
        goal5.displayGoal(goal5);
        Game game1 = new Game();
        game1.setTeamA(teamA);
        game1.setTeamB(teamB);
        teamA.displayName();
        teamB.displayName();
        int countA = 0;
        int countB = 0;
        Iterator var12 = goalList.iterator();

        while(var12.hasNext()) {
            Goal a = (Goal)var12.next();
            if (a.getTeam() == "Lakers") {
                ++countA;
            } else {
                ++countB;
            }
        }

        if (countA > countB) {
            System.out.println(teamA.getName() + "wins");
        } else if (countB > countA) {
            System.out.println(teamB.getName() + "wins");
        } else {
            System.out.println("no team wins");
        }

    }
}
