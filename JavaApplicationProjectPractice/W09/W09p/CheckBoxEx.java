package W09p;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
    CheckBoxEx() {
        setTitle("체크박스 만들기 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon unSelected = new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/unselected.png");
        ImageIcon selected = new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/selected.png");

        JCheckBox apple = new JCheckBox("사과");
        JCheckBox pear = new JCheckBox("배", true);
        JCheckBox cherry = new JCheckBox("체리", unSelected);
        cherry.setBorderPainted(true);
        cherry.setSelectedIcon(selected);

        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
