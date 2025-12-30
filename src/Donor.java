public class Donor {
    private String name;
    private String email;

    public Donor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Donor{name='" + name + "', email='" + email + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Donor)) return false;
        Donor other = (Donor) obj;
        return email.equals(other.email);
    }
}
