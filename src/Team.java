package src;

import java.util.List;

public class Team {
    private String name; // private = restricted access
    private String[] players;

    // Getter
    public String getName() {
        return name;
    }
    public String[] getPlayers() {
        return players;
    }
    public void setPlayers(String[] players) {
        this.players = players;
    }



    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public void displayName(){
        for (String i : this.getPlayers()) {
            System.out.println(i);
        }
        System.out.println("********");
    }

}
