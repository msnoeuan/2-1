package W09p;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
    ButtonEx() {
        setTitle("이미지 버튼 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon normalIcon = new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/A.png");
        ImageIcon rolloverIcon = new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/B.png");
        ImageIcon pressedIcon = new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/C.png");

        JButton btn = new JButton("call~~", normalIcon);
        btn.setPressedIcon(pressedIcon);
        btn.setRolloverIcon(rolloverIcon);

        c.add(btn);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonEx();
    }
}
