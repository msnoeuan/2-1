package W09p;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
    private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
    private ImageIcon[] images = {
            new ImageIcon(""),
            new ImageIcon(""),
            new ImageIcon(""),
            new ImageIcon("")
    };
    ListEx() {
        setTitle("리스트 만들기 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JList<String> strList = new JList<>(fruits);
        c.add(strList);

        JList<ImageIcon> imgList = new JList<>(images);
        imgList.setListData(images);
        c.add(imgList);

        JList<String> scrollList = new JList<>(fruits);
        c.add(new JScrollPane(scrollList));

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListEx();
    }
}
