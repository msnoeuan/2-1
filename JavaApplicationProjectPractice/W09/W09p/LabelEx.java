package W09p;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
    LabelEx() {
        setTitle("레이블 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel textLabel = new JLabel("사랑합니다");

        ImageIcon beauty = new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/heart.png");
        JLabel imageLabel = new JLabel(beauty);

        ImageIcon normalIcon = new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/phone.png");
        JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER);

        c.add(textLabel);
        c.add(imageLabel);
        c.add(label);

        setSize(400, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabelEx();
    }
}
