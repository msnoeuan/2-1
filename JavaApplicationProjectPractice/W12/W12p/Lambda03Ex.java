package W12p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lambda03Ex extends JFrame {
    Lambda03Ex() {
        setTitle("람다식 적용 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        add(new JLabel("아이스크림을 좋아하나요?"));

        JButton yesBtn = new JButton("Yes");
//        yesBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//            }
//        });
        yesBtn.addActionListener(e -> System.out.println("Yes, I love ice cream."));  // 람다식
        add(yesBtn);

        JButton noBtn = new JButton("No");
        noBtn.addActionListener(e -> System.out.println("No, I don't like ice cream"));
        add(noBtn);

        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lambda03Ex();
    }
}
