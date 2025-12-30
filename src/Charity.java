import java.util.Objects;

public class Charity {
    private String name;

    public Charity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Charity{name='" + name + "'}";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Charity)) return false;
        Charity charity = (Charity) o;
        return name.equals(charity.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }
}
