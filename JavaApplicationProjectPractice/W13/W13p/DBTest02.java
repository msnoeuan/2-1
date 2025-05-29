package W13p;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;

public class DBTest02 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "g1ooms60");
            System.out.println("sampledb 연결 완료");
            System.out.println();

            Statement stmt = conn.createStatement();
            String sql = "select * from student where dept = '컴퓨터시스템';";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                System.out.print(rs.getString("id"));
                System.out.print("\t" + rs.getString("name"));
                System.out.print("\t" + rs.getString("dept"));
                System.out.println();
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
