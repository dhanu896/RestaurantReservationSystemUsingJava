package restaurant.db;
import java.sql.*;

public class DatabaseConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/restaurantdb";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void saveReservation(String name, String phone) {
        try (Connection conn = connect()) {
            String sql = "INSERT INTO reservations (name, phone) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }
}
