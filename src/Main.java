public class Main {
    public static void main(String[] args) {
        // Create donors
        Donor donor1 = new Donor("Altair", "altair_k@gmail.com");
        Donor donor2 = new Donor("Shamil", "shamil_s@gmail.com");

        Charity charity1 = new Charity("Medrese");
        Charity charity2 = new Charity("Sadaka in mosques");

        Donation donation1 = new Donation(donor1, charity1, 100);
        Donation donation2 = new Donation(donor2, charity2, 200);

        System.out.println(donor1);
        System.out.println(charity1);
        System.out.println(donation1);
        
    }
}
