package soccer;

import lombok.Data;

@Data
public class Team {
    private String name;

    public String[] getPlayers() {
        return players;
    }

    public void setPlayers(String[] players) {
        this.players = players;
    }

    private String[] players;

    public Team() {
    }

    public String getName() {
        return this.name;
    }



    public void setName(String newName) {
        this.name = newName;
    }

    public void displayName() {
        System.out.println("team name is :");
        String[] var1 = this.getPlayers();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            String i = var1[var3];
            System.out.println(i);
        }

        System.out.println("********");
    }
}
