import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CharityDAO {

    public void addCharity(String name, String city) {
        String sql = "INSERT INTO charity (name, city) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, city);
            ps.executeUpdate();

            System.out.println("Charity added");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Charity> getAllCharities() {
        List<Charity> list = new ArrayList<>();
        String sql = "SELECT charity_id, name, city FROM charity";

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("charity_id");
                String name = rs.getString("name");
                String city = rs.getString("city");

                list.add(new Charity(id, name, city));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void updateCharity(int id, String newName) {
        String sql = "UPDATE charity SET name = ? WHERE charity_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, newName);
            ps.setInt(2, id);
            ps.executeUpdate();

            System.out.println("Charity updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCharity(int id) {
        String sql = "DELETE FROM charity WHERE charity_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Charity deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
