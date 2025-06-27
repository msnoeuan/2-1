import java.sql.*;

public class DBPra {
    public static Connection dbConnection() {
        Connection conn;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
            System.out.println("DB Connected");
            return conn;
        } catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("DB Error");
            return null;
        }
    }
}
