package W06p;

import javax.swing.*;
import java.awt.*;

public class IndepClassListener extends JFrame {
    IndepClassListener() {
        this.setTitle("Action 이벤트 예제");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btn = new JButton("English Action");
        this.setLayout(new FlowLayout());
        this.add(btn);

        MyActionLis listener = new MyActionLis();
        btn.addActionListener(listener);

        this.setSize(350, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}
