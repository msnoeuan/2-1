package W11p;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
    SliderEx() {
        setTitle("슬라이더 만들기 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);

        add(slider);

        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SliderEx();
    }
}
