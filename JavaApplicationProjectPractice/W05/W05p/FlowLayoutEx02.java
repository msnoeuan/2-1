package W05p;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx02 extends JFrame {
    FlowLayoutEx02() {
        setTitle("버튼 3개 화면");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());

        JButton btn1 = new JButton("OK");
        this.add(btn1);
        this.add(new JButton("Cancel"));
        this.add(new JButton("삭제"));

        this.setSize(300, 150);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutEx02();
    }
}
