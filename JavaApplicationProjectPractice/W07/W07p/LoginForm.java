package W07p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    LoginForm() {
        this.setTitle("LOGIN FORM");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 2));

        this.add(new JLabel("이메일"));
        JTextField email = new JTextField("");
        this.add(email);

        this.add(new JLabel("이메일"));
        JPasswordField pwd = new JPasswordField("");
        this.add(pwd);

        JButton btnLogin = new JButton("로그인");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strEmail = email.getText();
                String strPwd = pwd.getText();

                if(strEmail.equals("hong@google.com") && strPwd.equals("1234"))
                    System.out.println("로그인되었습니다.");
                else
                    System.out.println("이메일과 비밀번호를 다시 입력하십시오.");
            }
        });
        this.add(btnLogin);

        JButton btnCancel = new JButton("취소");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                email.setText("");
                pwd.setText("");
            }
        });
        this.add(btnCancel);

        this.setSize(400, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
