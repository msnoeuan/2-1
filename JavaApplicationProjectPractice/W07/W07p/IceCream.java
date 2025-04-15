package W07p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IceCream extends JFrame {
    IceCream() {
        this.setTitle("판넬 예제");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.add(new JLabel("아이스크림을 좋아하나요??"));

        JButton btnYes = new JButton("Yes");
        btnYes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("예, 아이스크림을 좋아합니다.");
            }
        });
        this.add(btnYes);

        JButton btnNo = new JButton("No");
        btnNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("아니오, 아이스크림을 좋아하지 않습니다.");
            }
        });
        this.add(btnNo);

        this.setSize(400, 200);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new IceCream();
    }
}
