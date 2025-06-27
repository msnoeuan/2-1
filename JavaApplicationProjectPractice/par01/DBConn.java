import java.sql.*;

public class DBConn {
    public static Connection dbConnection() {
        Connection conn;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "g1ooms60");
            System.out.println("DB Connected");
            return conn;
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("DB Error");
            return null;
        }
    }
}
