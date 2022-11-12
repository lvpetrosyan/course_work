public class NameWorker {
    private String name;
    private String lastName;

    public NameWorker(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "  " + lastName;
    }
}
