package W05p;

import javax.swing.*;

public class MyFrameEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("첫 GUI 프로그래밍");
        frame.setSize(300, 200);  // 픽셀 단위
        frame.setVisible(true);  // 초기값은 false로 안 보임
        // setSize와 setVisible는 JFrame 클래스 말고 Window 클래스 아래에 있음(JFrame의 부모 클래스)

        JFrame frame2 = new JFrame("두 번째 GUI 프로그래밍");
        frame2.setSize(500, 500);
        frame2.setVisible(true);
    }
}
