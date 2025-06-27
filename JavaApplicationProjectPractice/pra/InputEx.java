import W10p.DBConn;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.io.FileWriter;
import java.sql.*;

public class InputEx extends JFrame {
    JTextField stuId, stuName, stuDept, searchTF;
    JButton insert, update, delete, select, searchBtn;
    JRadioButton stuIdR, stuNameR, stuDeptR;
    JTextArea ta;
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;
    FileWriter fout = null;

    InputEx() {
        setTitle("학생 관리 프로젝트");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        createGUI();

        setSize(300, 550);
        setVisible(true);
    }

    public void createGUI() {
        setLayout(new FlowLayout());

        add(new JLabel("학번"));
        stuId = new JTextField(20);
        add(stuId);

        add(new JLabel("이름"));
        stuName = new JTextField(20);
        add(stuName);

        add(new JLabel("학과"));
        stuDept = new JTextField(20);
        add(stuDept);

        insert = new JButton("입력");
        add(insert);

        update = new JButton("수정");
        add(update);

        delete = new JButton("삭제");
        add(delete);

        select = new JButton("조회");
        add(select);

        JPanel pn1 = new JPanel();

        searchTF = new JTextField(18);
        pn1.add(searchTF);
        searchBtn = new JButton("검색");
        pn1.add(searchBtn);

        stuIdR = new JRadioButton("학번");
        stuNameR = new JRadioButton("이름");
        stuDeptR = new JRadioButton("학과");

        ButtonGroup group = new ButtonGroup();
        group.add(stuIdR);
        group.add(stuNameR);
        group.add(stuDeptR);

        JPanel pn2 = new JPanel();

        pn2.add(stuIdR);
        pn2.add(stuNameR);
        pn2.add(stuDeptR);

        JPanel pMiddle = new JPanel(new BorderLayout(0, 0));
        pMiddle.add(BorderLayout.NORTH, pn1);
        pMiddle.add(BorderLayout.CENTER, pn2);
        TitledBorder tb = new TitledBorder("검색");
        pMiddle.setBorder(tb);

        add(pMiddle);

        ta = new JTextArea(15, 20);
        add(ta);
    }

    public void dbSearch() {
        try {
            conn = DBConn.dbConnection();
            String searchText = searchTF.getText().toString();
            String searchSql = "";

            if(stuIdR.isSelected())
                searchSql = "select * from student where id = ?;";
            else if(stuNameR.isSelected())
                searchSql = "select * from student where name = ?;";
            else
                searchSql = "select * from student where dept = ?;";

            pstmt = conn.prepareStatement(searchSql);
            pstmt.setString(1, searchText);
            rs = pstmt.executeQuery();

            String line = "";
            ta.setText("          id          name          dept\n");
            ta.append("------------------------------------------");

            while(rs.next()) {
                String name = rs.getString("name");
                String dept = rs.getString("dept");
                String id = rs.getString("id");

                line = "  |  " + id + "  |  " + name + "  |  " + dept + "\n";
                System.out.println("rs => " + line);
                ta.append(line);
            }
            rs.close();
            pstmt.close();
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new InputEx();
    }
}
