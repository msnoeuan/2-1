package W06p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginEx extends JFrame {
    LoginEx() {
        this.setTitle("LOGIN FORM");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(3, 2, 0, 5));

//        GridLayout grid = new GridLayout(3, 2, 0, 5);
//        this.setLayout(grid);

        this.add(new JLabel("사용자 ID"));
        JTextField id = new JTextField("");
        this.add(id);

        this.add(new JLabel("비밀번호"));
        JTextField pwd = new JTextField("");
        this.add(pwd);

        JButton btnLogin = new JButton("로그인");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strId = id.getText();
                String strPwd = pwd.getText();
                System.out.println(strId + ", " + strPwd + " 로그인 버튼이 클릭됐습니다.");

                if(strId.equals("dongyang") && strPwd.equals("1234"))
                    System.out.println("정상적으로 로그인 되었습니다.");
                else
                    System.out.println("id 혹은 비밀번호가 틀렸습니다. 다시 입력해주시길 바랍니다.");
            }
        });
        this.add(btnLogin);

        JButton btnCancel = new JButton("취소");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id.setText("");
                pwd.setText("");

                System.out.println("취소 버튼을 눌렀습니다.");
            }
        });
        this.add(btnCancel);

        this.setSize(300, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginEx();
    }
}
