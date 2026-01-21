import java.sql.*;

public class CharityDAO {

    public void addCharity(String name) {
        String sql = "INSERT INTO charity(name) VALUES (?)";

        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllCharities() {
        String sql = "SELECT * FROM charity";

        try (Connection c = DBConnection.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("charity_id") + " " +
                                rs.getString("name")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCharity(int id, String name) {
        String sql = "UPDATE charity SET name=? WHERE charity_id=?";

        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteCharity(int id) {
        String sql = "DELETE FROM charity WHERE charity_id=?";

        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
