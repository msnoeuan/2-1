import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Input extends JFrame {
    JTextField tfName, tfTel, tfCom;
    JButton btnInsert, btnSelect, btnSearch, btnUpdate, btnDelete, btnExit;
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    Input() {
        setTitle("homework");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        createGUI();

//        btnInsert, btnSelect, btnSearch

        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbInsert();
            }
        });

        btnSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbSelect();
            }
        });

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbSearch();
            }
        });


        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbUpdate();
            }
        });


        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbDelete();
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbExit();
            }
        });



        setSize(400, 300);
        setVisible(true);
    }

    public void createGUI() {
        setLayout(new GridLayout(6,2));

        add(new JLabel("이름"));
        tfName = new JTextField();
        add(tfName);

        add(new JLabel("전화번호"));
        tfTel = new JTextField();
        add(tfTel);

        add(new JLabel("회사이름"));
        tfCom = new JTextField();
        add(tfCom);

        btnInsert = new JButton("입력");
        add(btnInsert);

        btnSelect = new JButton("조회");
        add(btnSelect);

        btnSearch = new JButton("검색");
        add(btnSearch);

        btnUpdate = new JButton("수정");
        add(btnUpdate);

        btnDelete = new JButton("삭제");
        add(btnDelete);

        btnExit = new JButton("종료");
        add(btnExit);
    }

    public void dbInsert() {
        try {
            conn = DBConn.dbConnection();
            String sql = "insert into addrtbl(name, tel, com) values(?, ?, ?);";

            String name = tfName.getText();
            String tel = tfTel.getText();
            String com = tfCom.getText();

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, tel);
            pstmt.setString(3, com);

            pstmt.executeUpdate();

            tfName.setText("");
            tfTel.setText("");
            tfCom.setText("");

            pstmt.close();
            conn.close();

        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("입력 오류");
        }
    }

    public void dbSelect() {
        try {
            conn = DBConn.dbConnection();

            String sql = "select * from addrtbl;";

            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            String line = "";

            while(rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String tel = rs.getString("tel");
                String com = rs.getString("com");
                String inDate = rs.getString("inDate");

                line = "id : " + id + ", name : " + name + ", tel : " + tel + ", com : " + com + ", inDate : " + inDate;
                System.out.println(line);
            }

            tfName.setText("");
            tfTel.setText("");
            tfCom.setText("");

            rs.close();
            pstmt.close();
            conn.close();

        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("조회 오류");
        }
    }

    public void dbSearch() {
        try {
            conn = DBConn.dbConnection();
            String sql = "";
            String searchText = "";

            // tfName, tfTel, tfCom;
            if(!tfName.getText().equals("")) {
                sql = "select * from addrtbl where name = ?;";
                searchText = tfName.getText();
            }
            else if(!tfTel.getText().equals("")) {
                sql = "select * from addrtbl where tel = ?;";
                searchText = tfTel.getText();
            }
            else if(!tfCom.getText().equals("")) {
                sql = "select * from addrtbl where com = ?;";
                searchText = tfCom.getText();
            }
            else {
                System.out.println("검색할 정보를 입력하세요");
                return;
            }

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, searchText);
            rs = pstmt.executeQuery();

            String line = "";

            while(rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String tel = rs.getString("tel");
                String com = rs.getString("com");
                String inDate = rs.getString("inDate");

                line = "id : " + id + ", name : " + name + ", tel : " + tel + ", com : " + com + ", inDate : " + inDate;
                System.out.println(line);
            }

            tfName.setText("");
            tfTel.setText("");
            tfCom.setText("");

            pstmt.close();
            conn.close();


        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("검색 오류");
        }
    }
    public void dbUpdate() {
        try {
            conn = DBConn.dbConnection();
            String sql = "update addrtbl set name = ?, com = ? where tel = ?;";

//            tfName, tfTel, tfCom;
            String name = tfName.getText();
            String tel = tfTel.getText();
            String com = tfCom.getText();

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, com);
            pstmt.setString(3, tel);

            pstmt.executeUpdate();


            tfName.setText("");
            tfTel.setText("");
            tfCom.setText("");

            pstmt.close();
            conn.close();

        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("수정 오류");
        }
    }

    public void dbDelete() {
        try {
            conn = DBConn.dbConnection();
            String sql = "Delete from addrtbl where name = ? and tel = ? and com = ?;";

            String name = tfName.getText();
            String tel = tfTel.getText();
            String com = tfCom.getText();

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, tel);
            pstmt.setString(3, com);

            pstmt.executeUpdate();

            tfName.setText("");
            tfTel.setText("");
            tfCom.setText("");

            pstmt.close();
            conn.close();

        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("삭제 오류");
        }
    }
    public void dbExit() {
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }

    public static void main(String[] args) {
        new Input();
    }
}
