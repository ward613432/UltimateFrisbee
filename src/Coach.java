class Coach extends Person {
    String role;
    public Coach(String firstName, String lastName, String role) {
        super(firstName, lastName);
        this.role = role;
    }

    public String toString() {
        return String.format("%s, %s\n   Role: %s", this.lastName, this.firstName, this.role);
    }
}