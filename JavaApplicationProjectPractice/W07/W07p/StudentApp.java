package W07p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp extends JFrame {
    ArrayList<Student> studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // 생성자
    StudentApp() {
        this.setTitle("학생 관리 시스템");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(6, 2));

        JTextField inName = new JTextField("");
        JTextField inHb = new JTextField("");
        JTextField inDept = new JTextField("");
        JTextField inGwa = new JTextField("");

        JButton btnIn = new JButton("입력");
        btnIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strName = inName.getText();
                String strHb = inHb.getText();
                String strDept = inDept.getText();
                String strGwa = inGwa.getText();

                studentList.add(new Student(strName, strHb, strDept, strGwa));
                System.out.println(strName + " => 입력 완료");
            }
        });

        JButton btnCancel = new JButton("취소");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inName.setText("");
                inHb.setText("");
                inDept.setText("");
                inGwa.setText("");
            }
        });

        JButton btnSave = new JButton("조회 및 파일 저장");
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fout = new FileWriter("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W07/20230880.txt");
                    for(Student st : studentList) {
                        System.out.println(st);
                        fout.write(st.getName() + ", " + st.getHb() + ", " + st.getDept() + ", " + st.getGwa() + "\n");
                    }
                    System.out.println("파일 저장 완료");
                    fout.close();

                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("쓰기 에러~!");
                }
            }
        });

        JButton btnSelect = new JButton("이름으로 검색");
        btnSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("검색할 학생 이름을 쓰시오 : ");
                String name = sc.next();

                for(Student st : studentList) {
                    if(st.getName().equals(name))
                        System.out.println((st));
                    else
                        System.out.println("입력한 학생 정보가 조회되지 않습니다.");
                }

            }
        });

        // 붙이기
        this.add(new JLabel("이름"));
        this.add(inName);
        this.add(new JLabel("학번"));
        this.add(inHb);
        this.add(new JLabel("학과"));
        this.add(inDept);
        this.add(new JLabel("과목"));
        this.add(inGwa);

        this.add(btnIn);
        this.add(btnCancel);
        this.add(btnSave);
        this.add(btnSelect);

        this.setSize(400, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentApp();
    }
}
