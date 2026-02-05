import java.util.Objects;

public class Charity {

    private int id;
    private String name;
    private String city;

    // Конструктор для БД (READ)
    public Charity(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    // Конструктор для создания без id (CREATE)
    public Charity(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }
    public Charity(String name) {
        this.name = name;
        this.city = "Unknown";
    }
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return id + " " + name + " (" + city + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Charity)) return false;
        Charity charity = (Charity) o;
        return Objects.equals(name, charity.name) &&
                Objects.equals(city, charity.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }
}
