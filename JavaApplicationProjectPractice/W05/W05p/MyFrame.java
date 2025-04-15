package W05p;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("300X300 스윙 프레임 만들기");  // super("타이틀문자열"); 이라고 해도 됨
        setSize(300, 300);
        setVisible(true);  // 프레임 출력
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
