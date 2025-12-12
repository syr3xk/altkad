public class Donation {
    private Donor donor;
    private Charity charity;
    private double amount;

    public Donation() {}

    public Donation(Donor donor, Charity charity, double amount) {
        this.donor = donor;
        this.charity = charity;
        this.amount = amount;
    }

    public Donor getDonor() { return donor; }
    public Charity getCharity() { return charity; }
    public double getAmount() { return amount; }

    public void setDonor(Donor donor) { this.donor = donor; }
    public void setCharity(Charity charity) { this.charity = charity; }
    public void setAmount(double amount) { this.amount = amount; }

    @Override
    public String toString() {
        return "Donation{donor=" + donor.getName() +
                ", charity=" + charity.getTitle() +
                ", amount=" + amount + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Donation)) return false;
        Donation other = (Donation) obj;
        return this.donor.equals(other.donor)
                && this.charity.equals(other.charity)
                && this.amount == other.amount;
    }
}

