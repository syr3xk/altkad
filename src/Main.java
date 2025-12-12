public class Main {
    public static void main(String[] args) {

        // Create donors
        Donor donor1 = new Donor("Alice Johnson", "alice@gmail.com");
        Donor donor2 = new Donor("Bob Smith", "bob@mail.com");

        // Create charities
        Charity charity1 = new Charity("Hope Foundation", "Education & Children");
        Charity charity2 = new Charity("Green Planet", "Environment");

        // Create donations
        Donation donation1 = new Donation(donor1, charity1, 150.00);
        Donation donation2 = new Donation(donor2, charity1, 200.00);
        Donation donation3 = new Donation(donor1, charity2, 300.00);

        // Output objects to console
        System.out.println(donor1);
        System.out.println(charity1);
        System.out.println(donation1);

        // Compare objects
        System.out.println("Are donor1 and donor2 same person? " + donor1.equals(donor2));
        System.out.println("Are donations equal? " + donation1.equals(donation2));
    }
}
