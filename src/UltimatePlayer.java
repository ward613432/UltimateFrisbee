public class UltimatePlayer extends Person {
    int jerseyNumber;
    static int jerseyNumberCounter = 1;
    String position; // "handler" or "cutter"

    public UltimatePlayer(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = (position != "cutter" ? "handler" : "cutter");
        this.jerseyNumber = jerseyNumberCounter;
        jerseyNumberCounter++;
    }

    public String getPosition() {
        return this.position;
    }

    public String toString() {
        return String.format("%s, %s\n   Jersey #: %d\n   Position: %s", this.lastName, this.firstName, this.jerseyNumber, this.position);
    }

    int throwDisc(int pow) {
        int regulatedPow = Math.max(1, Math.min(10, pow));
        return regulatedPow * 4;
    }
}