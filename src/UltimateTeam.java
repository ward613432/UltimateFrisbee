import java.util.ArrayList;

public class UltimateTeam {
    ArrayList<UltimatePlayer> players;
    ArrayList<Coach> coaches;

    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) {
        this.players = players;
        this.coaches = coaches;
    }

    public String GetCutters() {
        String cutters = "";
        for(UltimatePlayer p : this.players) {
            if (p.position.equalsIgnoreCase("cutter")) {
                cutters += p.toString() + "\n";
            }
        }
        return cutters;
    }

    public String getHandlers() {
        String handlers = "";
        for (UltimatePlayer p : this.players) {
            if (p.position.equalsIgnoreCase("handler")) {
                handlers += p.toString() + "\n";
            }
        }
        return handlers;
    }

    public String toString() {
        String members = "";

        members += "COACHES\n";
        for (Coach c : this.coaches) {
            members += c.toString() + "\n";
        }

        members += "PLAYERS\n";
        for (UltimatePlayer p : this.players) {
            members += p.toString() + "\n";
        }

        return members;
    }
}