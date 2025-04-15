package W05p;

import javax.swing.*;

public class NullContainerEx extends JFrame {
    public NullContainerEx() {
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(null);

        JLabel la = new JLabel("Hello. Press Buttons!");
        la.setLocation(130, 50);
        la.setSize(200, 20);
        this.add(la);

        for(int i = 1; i <= 9; i ++) {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i * 15, i * 15);
            b.setSize(50, 20);
            this.add(b);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}
