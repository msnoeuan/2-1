package W13p;

import java.sql.*;

public class DBTest01 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "g1ooms60");
            System.out.println("DB 연결!!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("db error");
        }
    }
}
