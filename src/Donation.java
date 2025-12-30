public class Donation {
    private Donor donor;
    private Charity charity;
    private double amount;

    public Donation(Donor donor, Charity charity, double amount) {
        this.donor = donor;
        this.charity = charity;
        this.amount = amount;
    }

    public Donor getDonor() {
        return donor;
    }

    public Charity getCharity() {
        return charity;
    }

    public double getAmount() {
        return amount;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public void setCharity(Charity charity) {
        this.charity = charity;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Donation{donor=" + donor.getName() +
                ", charity=" + charity.getName() +
                ", amount=" + amount + "}";
    }
}
