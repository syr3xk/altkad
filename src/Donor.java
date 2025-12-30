import java.util.Objects;

public class Donor extends Person {
    private String email;

    public Donor(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return "Donor";
    }

    public String toString() {
        return "Donor{name='" + name + "', email='" + email + "'}";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Donor)) return false;
        Donor donor = (Donor) o;
        return email.equals(donor.email);
    }

    public int hashCode() {
        return Objects.hash(email);
    }
}
