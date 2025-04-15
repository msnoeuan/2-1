package W05p;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx02 extends JFrame {
    GridLayoutEx02() {
        setTitle("LOGIN FORM");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(3, 2));

        this.add(new JLabel("사용자ID"));
        this.add(new JTextField(""));
        this.add(new JLabel("비밀번호"));
        this.add(new JTextField(""));
        this.add(new JButton("로그인"));
        this.add(new JButton("취소"));

        this.setSize(300, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx02();
    }
}
