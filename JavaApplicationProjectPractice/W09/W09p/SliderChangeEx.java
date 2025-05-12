package W09p;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderChangeEx extends JFrame {
    private JLabel colorLabel;
    private JSlider[] sl = new JSlider[3];

    SliderChangeEx() {
        setTitle("슬라이더와 ChangeEvent 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        colorLabel = new JLabel("SLIDER EXAMPLE");

        for(int i = 0; i < sl.length; i ++) {
            sl[i] = new JSlider(JSlider.HORIZONTAL, 0 ,255, 128);

            sl[i].setPaintLabels(true);
            sl[i].setPaintTicks(true);
            sl[i].setPaintTrack(true);
            sl[i].setMajorTickSpacing(50);
            sl[i].setMinorTickSpacing(10);
            sl[i].addChangeListener(new MyChangeListener());

            add(sl[i]);
        }

//        sl[0].setForeground(Color.RED);
//        sl[1].setForeground(Color.GREEN);
//        sl[2].setForeground(Color.BLUE);

        int r = sl[0].getValue();
        int g = sl[1].getValue();
        int b = sl[2].getValue();

        colorLabel.setOpaque(true);  // 배경색을 보이게 설정
//        colorLabel.setBackground(new Color(r, g, b));
        add(colorLabel);

        setSize(300, 230);
        setVisible(true);
    }

    class MyChangeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            int r = sl[0].getValue();
            int g = sl[1].getValue();
            int b = sl[2].getValue();
            colorLabel.setBackground(new Color(r, g, b));
        }
    }

    public static void main(String[] args) {
        new SliderChangeEx();
    }
}

/*
* <익명 클래스 리스너 VS 독립 클래스 리스너>
* 1. 익명 클래스 리스너
*   - 재사용 어려움
*   - 짧고 간결
*   - 간단한 동작일 때 좋음
*   - 이벤트 핸들러가 많을 때 코드가 길어지고 헷갈림
*
* 2. 독립 클래스 리스너
*   - 여러 곳에서 재사용 가능
*   - 길어질 수 있음
*   - 복잡한 동작일 땐 더 좋음
*   - 이벤트 핸들러가 많을 때 구조가 더 깔끔해짐
* */


