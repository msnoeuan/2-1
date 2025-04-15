package W05p;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx() {
        setTitle("BorderLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout(30, 20)); // 디폴트는 hgap : 0 / vgap : 0

        this.add(new JButton("중심"), BorderLayout.CENTER);
        this.add(new JButton("북"), BorderLayout.NORTH);
        this.add(new JButton("남"), BorderLayout.SOUTH);
        this.add(new JButton("동"), BorderLayout.EAST);
        this.add(new JButton("서"), BorderLayout.WEST);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}
