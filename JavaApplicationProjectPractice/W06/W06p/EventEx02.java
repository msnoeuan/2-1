package W06p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx02 extends JFrame {
    EventEx02() {
        this.setTitle("버튼 이벤트 예제 2");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("기본 텍스트");
        this.add(label);

        JButton btn1 = new JButton("안녕!");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("안녕하세요!");
            }
        });
        this.add(btn1);

        JButton btn2 = new JButton("잘가!");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("안녕히 가세요!");
            }
        });
        this.add(btn2);

        this.setSize(400, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new EventEx02();
    }
}
