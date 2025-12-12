public class Charity {
    private String title;
    private String mission;

    public Charity() {}

    public Charity(String title, String mission) {
        this.title = title;
        this.mission = mission;
    }

    public String getTitle() { return title; }
    public String getMission() { return mission; }

    public void setTitle(String title) { this.title = title; }
    public void setMission(String mission) { this.mission = mission; }

    @Override
    public String toString() {
        return "Charity{title='" + title + "', mission='" + mission + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Charity)) return false;
        Charity other = (Charity) obj;
        return this.title.equalsIgnoreCase(other.title);
    }
}
