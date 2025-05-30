package W11p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SliderChangeEx extends JFrame {
    private JLabel colorLabel;
    private JSlider[] sl = new JSlider[3];

    SliderChangeEx() {
        setTitle("슬라이더와 ChangeEvent 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        colorLabel = new JLabel("Slider Example 색상 변경 !!");

        for(int i = 0; i < sl.length; i ++) {
            sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 120);
            sl[i].setPaintLabels(true);
            sl[i].setPaintTicks(true);
            sl[i].setPaintTrack(true);
            sl[i].setMajorTickSpacing(50);
            sl[i].setMinorTickSpacing(10);
            this.add(sl[i]);
        }

        sl[0].setForeground(Color.RED);
        sl[1].setForeground(Color.GREEN);
        sl[2].setForeground(Color.BLUE);

        int r = sl[0].getValue();
        int g = sl[1].getValue();
        int b = sl[2].getValue();

        colorLabel.setOpaque(true);
        colorLabel.setBackground(new Color(r, g, b));
        add(colorLabel);

        JButton btn = new JButton("확인");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r = sl[0].getValue();
                int g = sl[1].getValue();
                int b = sl[2].getValue();
                colorLabel.setBackground(new Color(r, g, b));
            }
        });
        add(btn);

        setSize(300, 230);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SliderChangeEx();
    }
}
