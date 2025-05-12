package W09p;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
    SliderEx() {
        setTitle("슬라이더 만들기 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);  // 수평 슬라이더, 최소값, 최대값, 초기값
        slider.setPaintLabels(true);  // label 출력
        slider.setPaintTicks(true);  // 눈금 출력
        slider.setMajorTickSpacing(50);  //  큰 눈금 간격 지정
        slider.setMinorTickSpacing(10);  // 작은 눈금 간격 지정

        add(slider);

        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SliderEx();
    }
}
