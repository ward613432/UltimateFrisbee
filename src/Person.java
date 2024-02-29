public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    int throwDisc(int pow) {
        int regulatedPow = Math.max(1, Math.min(10, pow));
        return regulatedPow * 2;
    }

    public String toString() {
        return String.format("%s, %s", this.lastName, this.firstName);
    }
}