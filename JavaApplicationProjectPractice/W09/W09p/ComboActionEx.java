package W09p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboActionEx extends JFrame {
    private String[] fruits = {"apple", "banana", "mango"};
    private JComboBox<String> strCombo = new JComboBox<>(fruits);
    private ImageIcon[] images = {
            new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/apple.png"),
            new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/banana.png"),
            new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/mango.png")
    };
    private JLabel imgLabel = new JLabel(images[0]);

    ComboActionEx() {
        setTitle("콤보박스 활용 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(strCombo);
        strCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> cb = (JComboBox <String>)e.getSource();
                int index = cb.getSelectedIndex();
                imgLabel.setIcon(images[index]);
            }
        });
        add(imgLabel);

        setSize(300,250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboActionEx();
    }
}
