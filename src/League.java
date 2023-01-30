package src;

import java.util.ArrayList;
import java.util.List;

public class League {
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
        goal1.setTime(2.00);
        Goal goal2 = new Goal();
        goal2.setPlayerName("A");
        goal2.setTeam("Lakers");
        goal2.setTime(8.00);
        Goal goal3 = new Goal();
        goal3.setPlayerName("B");
        goal3.setTeam("Lakers");
        goal3.setTime(10.00);
        Goal goal4 = new Goal();
        goal4.setPlayerName("A");
        goal4.setTeam("Lakers");
        goal4.setTime(12.00);
        List<Goal> goalList = new ArrayList<Goal>();
        goalList.add(goal1);
        goalList.add(goal2);
        goalList.add(goal3);
        goalList.add(goal4);

        Game game1 = new Game();
        game1.setTeamA(teamA);
        game1.setTeamB(teamB);
        teamA.displayName();
        teamB.displayName();
        int countA = 0, countB = 0;
        for (Goal a : goalList) {
            if (a.getTeam() == "Lakers") {
                countA++;
            } else countB++;
        }
        if (countA > countB) System.out.println(teamA.getName() + "wins");
        else if (countB > countA) System.out.println(teamB.getName() + "wins");
        else System.out.println("no team wins");



    }
}
