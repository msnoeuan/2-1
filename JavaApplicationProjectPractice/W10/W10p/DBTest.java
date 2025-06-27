package W10p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sampledbW10";
            String user = "root";
            String pwd = "g1ooms60";
            Connection conn = DriverManager.getConnection(url, user, pwd);

            System.out.println("DB Connect!");

            String inid  = "20250007";
            String inname = "이정후";
            String indept = "야구학과";

            String sql = "insert into student values(?, ?, ?);";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, inid);
            pstmt.setString(2, inname);
            pstmt.setString(3, indept);

            pstmt.executeUpdate();  // 실행

            System.out.println("input complete!");

        } catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
