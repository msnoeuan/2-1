package W13p;

import java.sql.*;

public class DBTest03 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "g1ooms60");
            System.out.println("sampledb 연결 완료");
            System.out.println();
            Statement stmt = conn.createStatement();

            // 데이터 변경 중 입력
//            String sql = "insert into student value('2024007', '홍길동', '체육학과');";
//            String sql2 = "update student set dept = '샌디에고' where name = '홍길동';";
            String sql3 = "delete from student where name = '홍길동';";
            stmt.executeUpdate(sql3);
            // stmt.executeQuery(sql); => select
            // stmt.executeUpdate(sql); => insert, update, delete
            System.out.println("삭제가 완료되었습니다.");

            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException  e) {
            e.printStackTrace();
            System.out.println("에러 발생");
        }
    }
}
