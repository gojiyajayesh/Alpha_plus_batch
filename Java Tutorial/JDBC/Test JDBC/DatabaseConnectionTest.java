import java.sql.*;

public class DatabaseConnectionTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully...");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found" + e.getMessage());
        }
        String url = "jdbc:mysql://localhost:3306/PeopleDB";
        String user = "root";
        String password = "Jayesh@123";
        String query = "select * from People;";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully...");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String job = resultSet.getString("job");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("sex");
                String address = resultSet.getString("address");
                double salary = resultSet.getInt("salary");
                String home = resultSet.getString("home");
                System.out.println("------------------------------");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Job: " + job);
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);
                System.out.println("Address: " + address);
                System.out.println("Salary: " + salary);
                System.out.println("Home: " + home);
            }

        } catch (SQLException e) {
            System.out.println("Connection not establish" + e.getMessage());
        }
        finally {
            assert connection != null;
            connection.close();
            assert statement != null;
            statement.close();
            assert resultSet != null;
            resultSet.close();
            System.out.println();
            System.out.println("Closed connection successfully...");
        }
    }
}
