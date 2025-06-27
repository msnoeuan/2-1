package W10p;

import java.sql.*;

public class DBConn {
    public static Connection dbConnection() {
        Connection conn;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledbW10", "root", "g1ooms60");
            System.out.println("DB Connected!");

            return conn;
        } catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("DB ERROR!");

            return null;
        }
    }
}
