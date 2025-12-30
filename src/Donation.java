public class Donation {
    private Donor donor;
    private Charity charity;
    private double amount;

    public Donation(Donor donor, Charity charity, double amount) {
        this.donor = donor;
        this.charity = charity;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return donor.getName() + " donated " + amount + " to " + charity.getName();
    }
}
