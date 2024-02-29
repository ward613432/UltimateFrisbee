public class Captain extends UltimatePlayer {
    boolean type; // true == offense, false == defense

    public Captain(String firstName, String lastName, String position, boolean type) {
        super(firstName, lastName, position);
        this.type = type;
    }

    int throwDisc(int pow) {
        int regulatedPow = Math.max(1, Math.min(10, pow));
        return regulatedPow * 5;
    }

    public String toString() {
        return String.format("%s, %s\n   Jersey #: %d\n   Position: %s\n   Captain: %s",
                this.lastName, this.firstName, this.position, (type == true ? "offense" : "defense")
        );
    }
}