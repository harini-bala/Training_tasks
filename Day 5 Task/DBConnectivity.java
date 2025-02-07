import java.sql.*;

public class DBConnectivity {
    public static void main(String[] args) {
        // Database URL, Username, and Password
        String url = "jdbc:mysql://127.0.0.1:3306/wipro_schema";
        String user = "root";
        String password = "hariniSQL@123";

        // SQL queries
        String insertQuery = "INSERT INTO userdetails (username, password) VALUES (?, ?)";
        String selectQuery = "SELECT * FROM userdetails";

        Connection connection = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database Successfully!");

            // Insert Data
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, "harini");
            preparedStatement.setString(2, "passpass");

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            }
            preparedStatement.close();

            // Retrieve and Display Data
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);

            System.out.println("\nFetching Data from Database:");
            while (resultSet.next()) {
                System.out.println("Username: " + resultSet.getString("username"));
                System.out.println("Password: " + resultSet.getString("password"));
                System.out.println("--------------------------");
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection or query failed!");
            e.printStackTrace();
        } finally {
            // Close connection in finally block
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
