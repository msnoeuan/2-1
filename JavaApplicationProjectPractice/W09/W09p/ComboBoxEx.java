package W09p;

import javax.swing.*;
import java.awt.*;

public class ComboBoxEx extends JFrame {
    private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
    private String[] names = {"kitae", "jaemoon", "hyosoo", "namyun"};

    ComboBoxEx() {
        setTitle("콤보박스 만들기 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JComboBox<String> strCombo = new JComboBox<>(fruits);
        add(strCombo);

        JComboBox<String> nameCombo = new JComboBox<String>();
        for(int i = 0; i < names.length; i ++)
            nameCombo.addItem(names[i]);
        add(nameCombo);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxEx();
    }
}
