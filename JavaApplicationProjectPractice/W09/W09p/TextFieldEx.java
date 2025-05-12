package W09p;

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
    TextFieldEx() {
        setTitle("텍스트 필드 만들기 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new Label("이름"));
        add(new JTextField(20));
        add(new Label("학과"));
        add(new JTextField("컴퓨터공학과", 20));
        add(new Label("주소"));
        add(new JTextField("서울시 ...", 20));

        setSize(300,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldEx();
    }
}
