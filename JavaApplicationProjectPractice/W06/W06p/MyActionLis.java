package W06p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyActionLis implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
        JButton b = (JButton) e.getSource();

        if(b.getText().equals("English Action")) {
            b.setText("한글로 액션");
            b.setOpaque(true);
            b.setContentAreaFilled(true);
            b.setBackground(Color.orange);
        }
        else
            b.setText("English Action");
    }
}
