public class Charity {
    private String name;

    public Charity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Charity{name='" + name + "'}";
    }
}
