package W06p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutEx extends JFrame {
    GridLayoutEx() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(5, 2, 0, 5));

        JLabel name = new JLabel("이름");
        this.add(name);
        JTextField namef = new JTextField("");
        this.add(namef);

        JLabel stuId = new JLabel("학번");
        this.add(stuId);
        JTextField stuIdf = new JTextField("");
        this.add(stuIdf);

        JLabel major = new JLabel("전공");
        this.add(major);
        JTextField majorf = new JTextField("");
        this.add(majorf);

        JLabel subject = new JLabel("과목");
        this.add(subject);
        JTextField subjectf = new JTextField("");
        this.add(subjectf);

        JButton btn1 = new JButton("확인");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strName = namef.getText();
                String strStuId = stuIdf.getText();
                String strMajor = majorf.getText();
                String strSubject = subjectf.getText();

                System.out.println("이름 : " + strName);
                System.out.println("학번 : " + strStuId);
                System.out.println("전공 : " + strMajor);
                System.out.println("과목 : " + strSubject);
            }
        });
        this.add(btn1);

        JButton btn2 = new JButton("취소");
        this.add(btn2);

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
