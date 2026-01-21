import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CharityDAO dao = new CharityDAO();
        Charity charity = new Charity("Hope Foundation");

        List<Donation> donations = new ArrayList<>();

        Donor d1 = new Donor("Altair", "altair_k@gmail.com");
        Donor d2 = new Donor("Shamil", "shamil_s@gmail.com");

        donations.add(new Donation(d1, charity, 100));
        donations.add(new Donation(d2, charity, 300));
        donations.add(new Donation(d1, charity, 200));

        dao.addCharity("Hope Foundation");
        dao.getAllCharities();
        dao.updateCharity(1, "New Hope Foundation");
        dao.deleteCharity(2);

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

        scanner.close();
    }
}
