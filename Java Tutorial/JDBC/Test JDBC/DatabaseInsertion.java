import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInsertion {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded...");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded..." + e);
        }

        String user = "root";
        String password = "Jayesh@123";
        String url = "jdbc:mysql://localhost:3306/PeopleDB";
        Connection connection = null;
        Statement statement = null;
        String query = "INSERT INTO People (name,age,job,address,salary,home,sex) " + "VALUES ('John Doe', 30, 'Software Engineer', '123 Elm St', 75000.00, 'Owned', 'Male');";

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            int effectedRaw = statement.executeUpdate(query);
            if (effectedRaw > 0) {
                System.out.println("Successfully Inserted\nEffected Raw " + effectedRaw);
            } else {
                System.out.println("Insertion Failed");
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception " + e);
        }
    }
}
