package W05p;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // this.setLayout(new GridLayout(4, 2, 0, 5));
        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);

        this.setLayout(grid);

        this.add(new JLabel("이름"));
        this.add(new JTextField(""));
        this.add(new JLabel("학번"));
        this.add(new JTextField(""));
        this.add(new JLabel("학과"));
        this.add(new JTextField(""));
        this.add(new JLabel("과목"));
        this.add(new JTextField(""));

        setSize(300, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
