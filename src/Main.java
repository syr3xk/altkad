import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // Start REST API on ONE port
        new CharityHttpApi().start(8080);
        System.out.println("Server started on http://localhost:8080");

        // DB DAO
        CharityDAO dao = new CharityDAO();

        // If your Charity constructor is Charity(String name)
        Charity charity = new Charity("Hope Foundation");

        // If your Charity constructor is Charity(String name, String city) - use this instead:
        // Charity charity = new Charity("Hope Foundation", "Almaty");

        // Data pool for OOP part (sorting/filtering)
        List<Donation> donations = new ArrayList<>();

        Donor d1 = new Donor("Altair", "altair_k@gmail.com");
        Donor d2 = new Donor("Shamil", "shamil_s@gmail.com");

        donations.add(new Donation(d1, charity, 100));
        donations.add(new Donation(d2, charity, 300));
        donations.add(new Donation(d1, charity, 200));

        // CRUD demo (DB part)
        dao.addCharity("Hope Foundation", "Almaty");
        dao.getAllCharities();
        dao.updateCharity(1, "New Hope Foundation");
        dao.deleteCharity(2);

        // Output + filtering + sorting (OOP part)
        System.out.println("All donations:");
        for (Donation d : donations) {
            System.out.println(d);
        }

        System.out.println("\nDonations greater than 150:");
        for (Donation d : donations) {
            if (d.getAmount() > 150) {
                System.out.println(d);
            }
        }

        donations.sort(Comparator.comparingDouble(Donation::getAmount));

        System.out.println("\nSorted by amount:");
        for (Donation d : donations) {
            System.out.println(d);
        }
    }
}
