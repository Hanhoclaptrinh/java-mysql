import java.sql.*;

public class ConnectData {
    public static User getAuthenticatedUser(String email, String password) {
        User user = null;

        final String DB_URL = "jdbc:mysql://localhost:3306/status";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            String query = "select * from `users` where email = ? and password = ?";

            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet res = stmt.executeQuery();

            while (res.next()) {
                user = new User();
                user.name = res.getString("name");
                user.email = res.getString("email");
                user.phone = res.getString("phone");
                user.address = res.getString("address");
                user.password = res.getString("password");
            }

            stmt.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}
