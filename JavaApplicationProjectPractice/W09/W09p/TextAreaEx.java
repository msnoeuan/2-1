package W09p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaEx extends JFrame {
    private JTextField tf = new JTextField(10);
    private JTextArea ta = new JTextArea(10,20);

    TextAreaEx() {
        setTitle("텍스트 영역 만들기 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
        add(tf);
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField)e.getSource();
                // e.getSource() : 이벤트를 발생시킨 컴포넌트가 누군지 알려줌
                // e.getSource()는 Object 타입으로 반환(어떤 컴포넌트인지 정확히 모르는 상태) => (JTextField)로 형변환
                ta.append(t.getText() + "\n");
                t.setText("");
            }
        });
        add(new JScrollPane(ta));

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaEx();
    }
}
